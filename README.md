# Canopy OpenAPI spec

This specification serves as the one and only source of truth for the Canopy Servicing API.

# Structure of the live documentation

The `openapi.json` specification deploys to our [live documentation site](docs.canopyservicing.com).

Paths defined within the Open Api specification all contain local references to the `requestBodies`, `responses`, and `schemas` sections of the Open Api specification. However, these sections themselves all contain remote references, so that each request body, response, and schema definition is contained within its own file in its respective directory within this documentation.

# Updating the live documentation

## Deploy option 1

Make sure you have the Bump CLI installed

```
gem install bump-cli
```

To preview (but not deploy) your documentation, run

```
bundle exec bump preview openapi.json --import-external-references
```

To deploy your documentation to our [docs website](docs.canopyservicing.com), run

```
bundle exec bump deploy openapi.json --doc [get-doc-id-from-a-team-member] --token [get-token-from-a-team-member] --import-external-references
```

## Deploy option 2

The --import-external-references flag from Bump is currently experimental, so if you are facing issues when trying to deploy via option 1, you can consolidate all of your remote references using [`speccy`](https://github.com/wework/speccy) and deploy the consolidated file.

Install speccy globally:

```
npm install speccy -g
```

or

```
yarn global add speccy
```

Next, output your openapi spec into a consolidated file

```
speccy resolve openapi.json -o consolidatedOpenapi.json
```

Once you've resolved any errors with your remote references and created a consolidated open api spec, deploy your consolidated spec.

To preview (but not deploy) your documentation, run

```
bundle exec bump preview consolidatedOpenapi.json
```

To deploy your documentation to our [docs website](docs.canopyservicing.com), run

```
bundle exec bump deploy consolidatedOpenapi.json --doc [get-doc-id-from-a-team-member] --token [get-token-from-a-team-member]
```

## Commit your changes once deployed

Once you have deployed, commit your changes and make a pull request against the `master` branch.

# Updating the "working" documentation

We maintain an internal version of our documentation that includes API routes that are planned, but not currently deployed.

The `working-openApi.json` specification deploys to our [in-progress documentation site](https://bump.sh/doc/canopy-in-progress-documentation).

## Deploy option 1

Make sure you have the Bump CLI installed

```
gem install bump-cli
```

To preview (but not deploy) your documentation, run

```
bundle exec bump preview working-openApi.json --import-external-references
```

To deploy your documentation to our [in-progress docs website](https://bump.sh/doc/canopy-in-progress-documentation), run

```
bundle exec bump deploy working-openApi.json --doc [get-doc-id-from-a-team-member] --token [get-token-from-a-team-member] --import-external-references
```

## Deploy option 2

The --import-external-references flag from Bump is currently experimental, so if you are facing issues when trying to deploy via option 1, you can consolidate all of your remote references using [`speccy`](https://github.com/wework/speccy) and deploy the consolidated file.

Install speccy globally:

```
npm install speccy -g
```

or

```
yarn global add speccy
```

Next, output your openapi spec into a consolidated file

```
speccy resolve working-openApi.json -o workingConsolidatedOpenapi.json
```

Once you've resolved any errors with your remote references and created a consolidated open api spec, deploy your consolidated spec.

To preview (but not deploy) your documentation, run

```
bundle exec bump preview workingConsolidatedOpenapi.json
```

To deploy your documentation to our [in-progress docs website](https://bump.sh/doc/canopy-in-progress-documentation), run

```
bundle exec bump deploy workingConsolidatedOpenapi.json --doc [get-doc-id-from-a-team-member] --token [get-token-from-a-team-member]
```

## Commit your changes once deployed

Once you have deployed, commit your changes and make a pull request against the `master` branch.
