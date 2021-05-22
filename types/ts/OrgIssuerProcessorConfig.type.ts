export interface OrgIssuerProcessorConfig {
    lithic_config?: LithicConfig;
}

export interface LithicConfig {
    /**
     * API key for your organization in Lithic. You can generate this in your Lithic dashboard
     * as a self-service option.
     */
    api_key?: string;
}
