import {
  quicktype,
  InputData,
  JSONSchemaInput,
  JSONSchemaStore,
  TypeScriptTargetLanguage,
  TypeScriptRenderer,
  RenderContext,
  getOptionValues,
  tsFlowOptions,
  EnumType,
  Name,
  TargetLanguage,
  SerializedRenderResult,
} from "quicktype-core";
import { utf16StringEscape } from "quicktype-core/dist/support/Strings";

export class MyTypeScriptTargetLanguage extends TypeScriptTargetLanguage {
  protected makeRenderer(
    renderContext: RenderContext,
    untypedOptionValues: { [name: string]: any }
  ): MyTypeScriptRenderer {
    return new MyTypeScriptRenderer(this, renderContext, getOptionValues(tsFlowOptions, untypedOptionValues));
  }
}

export class MyTypeScriptRenderer extends TypeScriptRenderer {
  protected emitEnum(e: EnumType, enumName: Name): void {
    this.emitDescription(this.descriptionForType(e));
    this.emitLine(["export type ", enumName, " = "]);
    this.forEachEnumCase(e, "none", (name, jsonName, position) => {
      const suffix = position === "last" || position === "only" ? ";" : " | ";
      this.indent(() => this.emitLine(`"${utf16StringEscape(jsonName)}"`, suffix));
    });
  }
}
