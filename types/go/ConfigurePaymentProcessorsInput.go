type ConfigurePaymentProcessorsInput struct {
	MerchantConfig       string               `json:"merchant_config"`       // The merchant config value obtained from the corresponding payment processor.
	PaymentProcessorName PaymentProcessorName `json:"payment_processor_name"`// Indicates the payment processor for which the merchant config is being set.
}

// Indicates the payment processor for which the merchant config is being set.
type PaymentProcessorName string
const (
	Dwolla PaymentProcessorName = "DWOLLA"
	ModernTreasury PaymentProcessorName = "MODERN_TREASURY"
	None PaymentProcessorName = "NONE"
	Repay PaymentProcessorName = "REPAY"
)
