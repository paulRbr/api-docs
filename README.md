# Canopy OpenAPI Schema

![Library](https://user-images.githubusercontent.com/5934549/110534507-274e9d00-80ed-11eb-987a-6ffca3f3a490.png)

This specification serves as the one and only source of truth throughout Canopy's stack.

We use the v3.0.3 version of the [OpenAPI spec](https://github.com/OAI/OpenAPI-Specification/blob/master/versions/3.0.3.md).

## Initial setup

1. Ensure you're on Node 14 or later: `nvm install lts`
2. `yarn`
3. `gem install bump-cli --version "~> 0.7"`
4. The pre-commit hook will bundle, validate, generate TS and Go types, and format the code before pushing.
   You can run either of those individually by referring to `scripts` in `package.json`.
5. Optional: install [Crunch42](https://github.com/42Crunch/vscode-openapi) extension for VSCode.

## Live documentation structure

The `openapi.json` file is the entrypoint to the modular spec that we use for development.

Paths defined within the OpenAPI specification all contain local references to the `requestBodies`, `responses`, and `schemas` sections. However, these sections themselves all contain remote references, so that each request body, response, and schema definition is contained within its own file in its respective directory within this documentation.

We consolidate these modules and dereference them into one unified json file that is used for validation and deployment.

## Updating the live documentation

Changes made to the `master` branch are deployed via GitHub Actions to internal docs [here](https://bump.sh/hub/internal-docs-hub/doc/artis_api_interface_updates).

```
When committing `master`, a pre-commit hook will build and validate the `dist/consolidated.json` file to ensure a valid API specification can be generated. In order for this commit to be successful, ensure that you are running Node 14 or later.
```

Changes made to the `production` branch are deployed via GitHub Actions to the [live documentation site](https://docs.canopyservicing.com).

## Validation

The CI workflow validates the consolidated OpenAPI file before deploying it. Please validate your changes in one of two ways before pushing:

1. `yarn validate`
2. Open up the [Crunch42](https://github.com/42Crunch/vscode-openapi) extension for VSCode with `dist/consolidated.json` in the editor and run a security audit by either clicking on the purple icon in the top right corner of the editor or opening up the launcher via Cmd-Option-P and entering "security". First option should be `OpenAPI: perform security audit`.

   See [docs](https://github.com/42Crunch/vscode-openapi#use-the-extension-to-audit-the-security-of-your-api) for more info.

## Type Generation

1. To include a schema for type generation, include it as a part of `openapi.json["schemas"]`.
2. Run `yarn build`.
