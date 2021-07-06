export interface OrgPaymentProcessorConfig {
    /**
     * The merchant config value obtained from the corresponding payment processor.
     */
    merchant_config: string;
    /**
     * Indicates the payment processor for which the merchant config is being set.
     */
    payment_processor_name: PaymentProcessorName;
}

/**
 * Indicates the payment processor for which the merchant config is being set.
 */
export type PaymentProcessorName = 
    "DWOLLA" | 
    "MODERN_TREASURY" | 
    "NONE" | 
    "REPAY";
