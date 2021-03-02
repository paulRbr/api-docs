export interface OrgPaymentProcessorConfig {
    repay_config?: RepayConfig;
}

export interface RepayConfig {
    /**
     * Merchant ID for your organization in Repay. You will need to go through an approval
     * process with Repay to get approved as a Merchant under Canopy prior to making this API
     * request.
     */
    merchant_id?: string;
}
