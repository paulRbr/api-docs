// Generate the type definitions of our internal models from Canopy component schemas.
// We select the component schemas from the dereferenced API spec, and generate TS and Go types.

const fs = require("fs/promises");
const path = require("path");
const { components } = require("../dist/consolidated.json");
const { quicktype, InputData, JSONSchemaInput, JSONSchemaStore } = require("quicktype-core");

async function main() {
  const supportedTypes = [
    {
      // Types for the frontend and api layer
      lang: "ts",
      extension: "type.ts",
    },
    {
      // Types for the Go SDK
      lang: "go",
      extension: "go",
    },
  ];

  // Generate the language-specific types for each supported language.
  supportedTypes.map((type) => {
    // We only concern ourselves with the JSON Schema components, ignoring generation of request/response specs.
    // This allows us to work with the raw models instead of definitions tied to req/res chain.
    Object.entries(components.schemas).map(async ([modelName, schemaProps]) => {
      // Use quicktype to generate the types.
      const output = await quicktypeJSONSchema(type.lang, modelName, JSON.stringify(schemaProps));
      try {
        // We write the types to their own language specific directory.
        await fs.writeFile(
          path.resolve(__dirname, "..", "types", type.lang, `${modelName}.${type.extension}`),
          output.lines.join("\n")
        );
      } catch (err) {
        console.error(err);
      }
    });
  });
}

main();

async function quicktypeJSONSchema(targetLanguage, typeName, jsonSchemaString) {
  const schemaInput = new JSONSchemaInput(new JSONSchemaStore());

  // We could add multiple schemas for multiple types,
  // but here we're just making one type from JSON schema.
  await schemaInput.addSource({ name: typeName, schema: jsonSchemaString });

  const inputData = new InputData();
  inputData.addInput(schemaInput);

  return await quicktype({
    inputData,
    lang: targetLanguage,
    rendererOptions: {
      "just-types": true,
    },
    inferDateTimes: false,
  });
}
