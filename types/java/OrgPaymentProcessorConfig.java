// OrgPaymentProcessorConfig.java

package io.quicktype;

public class OrgPaymentProcessorConfig {
    private RepayConfig repayConfig;

    public RepayConfig getRepayConfig() { return repayConfig; }
    public void setRepayConfig(RepayConfig value) { this.repayConfig = value; }
}

// RepayConfig.java

package io.quicktype;

public class RepayConfig {
    private String merchantID;

    /**
     * Merchant ID for your organization in Repay. You will need to go through an approval
     * process with Repay to get approved as a Merchant under Canopy prior to making this API
     * request.
     */
    public String getMerchantID() { return merchantID; }
    public void setMerchantID(String value) { this.merchantID = value; }
}
