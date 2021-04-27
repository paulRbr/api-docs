type OrgPaymentProcessorConfig struct {
	RepayConfig *RepayConfig `json:"repay_config,omitempty"`
}

type RepayConfig struct {
	MerchantID *string `json:"merchant_id,omitempty"`// Merchant ID for your organization in Repay. You will need to go through an approval; process with Repay to get approved as a Merchant under Canopy prior to making this API; request.
}
