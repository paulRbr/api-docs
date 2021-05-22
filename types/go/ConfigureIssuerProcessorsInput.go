type ConfigureIssuerProcessorsInput struct {
	LithicConfig *LithicConfig `json:"lithic_config,omitempty"`
}

type LithicConfig struct {
	APIKey *string `json:"api_key,omitempty"`// API key for your organization in Lithic. You can generate this in your Lithic dashboard; as a self-service option.
}
