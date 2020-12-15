# Canopy OpenAPI spec

This specification serves as the one and only source of truth for the Canopy Servicing API.

We use the v3.0.3 version of the [OpenAPI spec](https://github.com/OAI/OpenAPI-Specification/blob/master/versions/3.0.3.md).

## Structure of the live documentation

The `openapi.json` file is the entrypoint to the modular spec that we use for development.

Paths defined within the Open Api specification all contain local references to the `requestBodies`, `responses`, and `schemas` sections. However, these sections themselves all contain remote references, so that each request body, response, and schema definition is contained within its own file in its respective directory within this documentation.

We consolidate these modules and dereference them into one unified json file that is used for validation and deployment.

## Updating the live documentation

Changes made to the `master` branch are deployed via GitHub Actions to internal docs [here](https://bump.sh/hub/internal-docs-hub/doc/artis_api_interface_updates).

Changes made to the `production` branch are deployed via GitHub Actions to the [live documentation site](docs.canopyservicing.com).

## Validation

The CI workflow validates the consolidated OpenAPI file before deploying it. Please validate your changes in one of two ways before pushing:

1. `yarn validate`
2. Open up the [Crunch42](https://github.com/42Crunch/vscode-openapi) extension for VSCode with `dist/consolidated.json` in the editor and run a security audit by either clickingon the purple icon in the top right corner of the editor or opening up the launcher via Cmd-Option-P and entering "security". First option should be `OpenAPI: perform security audit`.

   See [docs](https://github.com/42Crunch/vscode-openapi#use-the-extension-to-audit-the-security-of-your-api) for more info.
