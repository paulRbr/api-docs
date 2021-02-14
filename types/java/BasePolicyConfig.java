// BasePolicyConfig.java

package io.quicktype;

/**
 * A base group of policies that define a Product
 */
public class BasePolicyConfig {
    private BillingCyclePolicies billingCyclePolicies;
    private FeePolicies feePolicies;
    private InterestPolicies interestPolicies;
    private PaymentDuePolicies paymentDuePolicies;

    /**
     * The set of policies governing the billing cycle for the product.
     */
    public BillingCyclePolicies getBillingCyclePolicies() { return billingCyclePolicies; }
    public void setBillingCyclePolicies(BillingCyclePolicies value) { this.billingCyclePolicies = value; }

    /**
     * The set of policies governing fees for the product.
     */
    public FeePolicies getFeePolicies() { return feePolicies; }
    public void setFeePolicies(FeePolicies value) { this.feePolicies = value; }

    /**
     * The Interest Policy Object
     */
    public InterestPolicies getInterestPolicies() { return interestPolicies; }
    public void setInterestPolicies(InterestPolicies value) { this.interestPolicies = value; }

    /**
     * The set of policies governing payment due information for the product.
     */
    public PaymentDuePolicies getPaymentDuePolicies() { return paymentDuePolicies; }
    public void setPaymentDuePolicies(PaymentDuePolicies value) { this.paymentDuePolicies = value; }
}

// BillingCyclePolicies.java

package io.quicktype;

import java.time.OffsetTime;

/**
 * The set of policies governing the billing cycle for the product.
 */
public class BillingCyclePolicies {
    private OffsetTime closeOfBusinessTime;
    private String cycleDueInterval;
    private String cycleInterval;
    private String firstCycleInterval;
    private String productTimeZone;

    /**
     * Defaults to EST Midnight. Time of the close of business. Note* this value will be
     * converted into the `product_time_zone` This is used for statement cuts and partner-level
     * and issuing bank-level reconciliation
     */
    public OffsetTime getCloseOfBusinessTime() { return closeOfBusinessTime; }
    public void setCloseOfBusinessTime(OffsetTime value) { this.closeOfBusinessTime = value; }

    /**
     * Defaults to 0 days. The amount of time before statement cut that the payment should be
     * due for the billing cycle. If positive, it will count days from the start of the cycle.
     * Note, this field has a signage convention: if negative, it will count days back from the
     * end of the cycle. IE '25 days' indicates that payments are due 25 days after the
     * statement is cut. `-5` days indicates that payments will be due five days prior to the
     * cut of the *next* cycle. Cannot exceed the duration of the billing cycle.
     */
    public String getCycleDueInterval() { return cycleDueInterval; }
    public void setCycleDueInterval(String value) { this.cycleDueInterval = value; }

    /**
     * The length of the billing cycle. after which a statement is generated, and a due date
     * assigned. IE '1 month' '3 months' or '7 days' (most common is monthly)
     */
    public String getCycleInterval() { return cycleInterval; }
    public void setCycleInterval(String value) { this.cycleInterval = value; }

    /**
     * Defaults to 0 days. If applicable, the amount of time you would like between origination
     * and the first statement cut. IE '10 days'. If you would like the first billing cycle to
     * be the same length as all other billing cycles, either do not include this field in the
     * request, or set its value to the same as `billing_cycle_period`
     */
    public String getFirstCycleInterval() { return firstCycleInterval; }
    public void setFirstCycleInterval(String value) { this.firstCycleInterval = value; }

    /**
     * Timezone denoted as an Olson-style timezone defining the timezone for the product. All
     * times in any response data for accounts using this product will be denominated in this
     * timezone. Shifts due to daylight savings will be accounted for where relevant, and all
     * output timestamps will be denoted as UTC offsets normalized based on this value.
     */
    public String getProductTimeZone() { return productTimeZone; }
    public void setProductTimeZone(String value) { this.productTimeZone = value; }
}

// FeePolicies.java

package io.quicktype;

/**
 * The set of policies governing fees for the product.
 */
public class FeePolicies {
    private String lateFeeGrace;

    /**
     * Defaults to 0 days. The amount of time after a payment is late after which you would like
     * for a late fee to be incurred.
     */
    public String getLateFeeGrace() { return lateFeeGrace; }
    public void setLateFeeGrace(String value) { this.lateFeeGrace = value; }
}

// InterestPolicies.java

package io.quicktype;

import java.time.OffsetTime;

/**
 * The Interest Policy Object
 */
public class InterestPolicies {
    private OffsetTime interestCalcTime;

    /**
     * Defaults to EST 1AM. Interest for this policy is calculated at this time every X interval.
     */
    public OffsetTime getInterestCalcTime() { return interestCalcTime; }
    public void setInterestCalcTime(OffsetTime value) { this.interestCalcTime = value; }
}

// PaymentDuePolicies.java

package io.quicktype;

/**
 * The set of policies governing payment due information for the product.
 */
public class PaymentDuePolicies {
    private Long chargeOffOnNConsecutiveLateFees;
    private Long delinquentOnNConsecutiveLateFees;

    /**
     * After this number of consecutive late events, the account status shifts to `suspended`
     * with a status subtype of `charged_off`
     */
    public Long getChargeOffOnNConsecutiveLateFees() { return chargeOffOnNConsecutiveLateFees; }
    public void setChargeOffOnNConsecutiveLateFees(Long value) { this.chargeOffOnNConsecutiveLateFees = value; }

    /**
     * After this number of consecutive late events, the account status shifts to `suspended`
     * with a status subtype of `delinquent`
     */
    public Long getDelinquentOnNConsecutiveLateFees() { return delinquentOnNConsecutiveLateFees; }
    public void setDelinquentOnNConsecutiveLateFees(Long value) { this.delinquentOnNConsecutiveLateFees = value; }
}
