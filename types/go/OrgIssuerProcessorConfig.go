type OrgIssuerProcessorConfig struct {
	PrivacyConfig *PrivacyConfig `json:"privacy_config,omitempty"`
}

type PrivacyConfig struct {
	APIKey *string `json:"api_key,omitempty"`// API key for your organization in Privacy.com. You can generate this in your privacy.com; dashboard as a self-service option.
}
