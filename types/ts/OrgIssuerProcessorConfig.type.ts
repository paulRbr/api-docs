export interface OrgIssuerProcessorConfig {
    privacy_config?: PrivacyConfig;
}

export interface PrivacyConfig {
    /**
     * API key for your organization in Privacy.com. You can generate this in your privacy.com
     * dashboard as a self-service option.
     */
    api_key?: string;
}
