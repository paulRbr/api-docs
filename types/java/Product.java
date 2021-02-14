// Product.java

package io.quicktype;

import java.time.OffsetDateTime;

public class Product {
    private OffsetDateTime createdAt;
    private OffsetDateTime effectiveAt;
    private String externalProductID;
    private PostPromotionalPolicies postPromotionalPolicies;
    private long productID;
    private ProductLifecyclePolicies productLifecyclePolicies;
    private ProductOverview productOverview;
    private ProductSummary productSummary;
    private PromotionalPolicies promotionalPolicies;

    /**
     * The `Date-Time` that this product was created on the server.
     */
    public OffsetDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(OffsetDateTime value) { this.createdAt = value; }

    /**
     * The `Date-Time` as of which this product is effective on the server.
     */
    public OffsetDateTime getEffectiveAt() { return effectiveAt; }
    public void setEffectiveAt(OffsetDateTime value) { this.effectiveAt = value; }

    /**
     * A unique external ID that may be used interchangeably with the Canopy-generated product ID
     */
    public String getExternalProductID() { return externalProductID; }
    public void setExternalProductID(String value) { this.externalProductID = value; }

    public PostPromotionalPolicies getPostPromotionalPolicies() { return postPromotionalPolicies; }
    public void setPostPromotionalPolicies(PostPromotionalPolicies value) { this.postPromotionalPolicies = value; }

    /**
     * The Canopy-generated ID for the product.
     */
    public long getProductID() { return productID; }
    public void setProductID(long value) { this.productID = value; }

    public ProductLifecyclePolicies getProductLifecyclePolicies() { return productLifecyclePolicies; }
    public void setProductLifecyclePolicies(ProductLifecyclePolicies value) { this.productLifecyclePolicies = value; }

    /**
     * A series of static fields about the product.
     */
    public ProductOverview getProductOverview() { return productOverview; }
    public void setProductOverview(ProductOverview value) { this.productOverview = value; }

    /**
     * Summary of product information
     */
    public ProductSummary getProductSummary() { return productSummary; }
    public void setProductSummary(ProductSummary value) { this.productSummary = value; }

    /**
     * If applicable, a promotional configuration for the product.
     */
    public PromotionalPolicies getPromotionalPolicies() { return promotionalPolicies; }
    public void setPromotionalPolicies(PromotionalPolicies value) { this.promotionalPolicies = value; }
}

// PostPromotionalPolicies.java

package io.quicktype;

public class PostPromotionalPolicies {
    private Long postPromoAmLenRangeInclusiveLower;
    private Long postPromoAmLenRangeInclusiveUpper;
    private Double postPromoAPRRangeInclusiveLower;
    private Double postPromoAPRRangeInclusiveUpper;
    private Long postPromoDefaultAmLen;
    private Double postPromoDefaultInterestRatePercent;
    private PromoMinPayType postPromoMinPayType;

    /**
     * Optional lower bound for amortization length in billing cycles for the product.
     */
    public Long getPostPromoAmLenRangeInclusiveLower() { return postPromoAmLenRangeInclusiveLower; }
    public void setPostPromoAmLenRangeInclusiveLower(Long value) { this.postPromoAmLenRangeInclusiveLower = value; }

    /**
     * Optional upper bound for amortization length in billing cycles for the product.
     */
    public Long getPostPromoAmLenRangeInclusiveUpper() { return postPromoAmLenRangeInclusiveUpper; }
    public void setPostPromoAmLenRangeInclusiveUpper(Long value) { this.postPromoAmLenRangeInclusiveUpper = value; }

    /**
     * Optional lower bound for APR Range for the product (i.e. 2 = 2%).
     */
    public Double getPostPromoAPRRangeInclusiveLower() { return postPromoAPRRangeInclusiveLower; }
    public void setPostPromoAPRRangeInclusiveLower(Double value) { this.postPromoAPRRangeInclusiveLower = value; }

    /**
     * Optional upper bound for APR Range for the product (i.e. 5 = 5%).
     */
    public Double getPostPromoAPRRangeInclusiveUpper() { return postPromoAPRRangeInclusiveUpper; }
    public void setPostPromoAPRRangeInclusiveUpper(Double value) { this.postPromoAPRRangeInclusiveUpper = value; }

    /**
     * Default duration for the amortization period during post-promotion
     */
    public Long getPostPromoDefaultAmLen() { return postPromoDefaultAmLen; }
    public void setPostPromoDefaultAmLen(Long value) { this.postPromoDefaultAmLen = value; }

    /**
     * The rate that serves as the active interest rate for accounts during the post-promotional
     * period.
     */
    public Double getPostPromoDefaultInterestRatePercent() { return postPromoDefaultInterestRatePercent; }
    public void setPostPromoDefaultInterestRatePercent(Double value) { this.postPromoDefaultInterestRatePercent = value; }

    /**
     * Current due calculation method for the post-promotional period.
     */
    public PromoMinPayType getPostPromoMinPayType() { return postPromoMinPayType; }
    public void setPostPromoMinPayType(PromoMinPayType value) { this.postPromoMinPayType = value; }
}

// PromoMinPayType.java

package io.quicktype;

import java.io.IOException;

/**
 * Current due calculation method for the post-promotional period.
 *
 * Current due calculation method for the promotional period.
 */
public enum PromoMinPayType {
    AM, NONE, PERCENT_INTEREST, PERCENT_PRINCIPAL;

    public String toValue() {
        switch (this) {
            case AM: return "AM";
            case NONE: return "NONE";
            case PERCENT_INTEREST: return "PERCENT_INTEREST";
            case PERCENT_PRINCIPAL: return "PERCENT_PRINCIPAL";
        }
        return null;
    }

    public static PromoMinPayType forValue(String value) throws IOException {
        if (value.equals("AM")) return AM;
        if (value.equals("NONE")) return NONE;
        if (value.equals("PERCENT_INTEREST")) return PERCENT_INTEREST;
        if (value.equals("PERCENT_PRINCIPAL")) return PERCENT_PRINCIPAL;
        throw new IOException("Cannot deserialize PromoMinPayType");
    }
}

// ProductLifecyclePolicies.java

package io.quicktype;

public class ProductLifecyclePolicies {
    private BillingCyclePolicies billingCyclePolicies;
    private DefaultAttributes defaultAttributes;
    private FeePolicies feePolicies;
    private InterestPolicies interestPolicies;
    private PaymentDuePolicies paymentDuePolicies;

    /**
     * The set of policies governing the billing cycle for the product.
     */
    public BillingCyclePolicies getBillingCyclePolicies() { return billingCyclePolicies; }
    public void setBillingCyclePolicies(BillingCyclePolicies value) { this.billingCyclePolicies = value; }

    public DefaultAttributes getDefaultAttributes() { return defaultAttributes; }
    public void setDefaultAttributes(DefaultAttributes value) { this.defaultAttributes = value; }

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

// DefaultAttributes.java

package io.quicktype;

public class DefaultAttributes {
    private long defaultCreditLimitCents;
    private Long defaultLateFeeCents;
    private Long defaultPaymentReversalFeeCents;

    /**
     * The default maximum principal credit (in cents) available for a customer account. This
     * default limit can be overridden on a per-account basis if a `credit_limit` is selected at
     * the time of assigning an account to a product. Credit limits for an account can also be
     * updated post-account creation.
     */
    public long getDefaultCreditLimitCents() { return defaultCreditLimitCents; }
    public void setDefaultCreditLimitCents(long value) { this.defaultCreditLimitCents = value; }

    /**
     * The default maximum principal credit (in cents) available for a customer account. This
     * default limit can be overridden on a per-account basis if a `credit_limit` is selected at
     * the time of assigning an account to a product. Credit limits for an account can also be
     * updated post-account creation.
     */
    public Long getDefaultLateFeeCents() { return defaultLateFeeCents; }
    public void setDefaultLateFeeCents(Long value) { this.defaultLateFeeCents = value; }

    /**
     * The default maximum principal credit (in cents) available for a customer account. This
     * default limit can be overridden on a per-account basis if a `credit_limit` is selected at
     * the time of assigning an account to a product. Credit limits for an account can also be
     * updated post-account creation.
     */
    public Long getDefaultPaymentReversalFeeCents() { return defaultPaymentReversalFeeCents; }
    public void setDefaultPaymentReversalFeeCents(Long value) { this.defaultPaymentReversalFeeCents = value; }
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

// ProductOverview.java

package io.quicktype;

/**
 * A series of static fields about the product.
 */
public class ProductOverview {
    private ExternalField[] externalFields;
    private String productColor;
    private String productLongDescription;
    private String productName;
    private String productShortDescription;
    private ProductType productType;

    public ExternalField[] getExternalFields() { return externalFields; }
    public void setExternalFields(ExternalField[] value) { this.externalFields = value; }

    /**
     * A color to be associated with the product for UI purposes.
     */
    public String getProductColor() { return productColor; }
    public void setProductColor(String value) { this.productColor = value; }

    /**
     * Description of the Product ranging from 0 - 1000.
     */
    public String getProductLongDescription() { return productLongDescription; }
    public void setProductLongDescription(String value) { this.productLongDescription = value; }

    /**
     * Name of Product, i.e. Express Card.
     */
    public String getProductName() { return productName; }
    public void setProductName(String value) { this.productName = value; }

    /**
     * A short description of the product ranging from 0 - 60 characters.
     */
    public String getProductShortDescription() { return productShortDescription; }
    public void setProductShortDescription(String value) { this.productShortDescription = value; }

    /**
     * The Type of Product
     */
    public ProductType getProductType() { return productType; }
    public void setProductType(ProductType value) { this.productType = value; }
}

// ExternalField.java

package io.quicktype;

public class ExternalField {
    private String key;
    private String value;

    public String getKey() { return key; }
    public void setKey(String value) { this.key = value; }

    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }
}

// ProductType.java

package io.quicktype;

import java.io.IOException;

/**
 * The Type of Product
 */
public enum ProductType {
    DEFERRED_INSTALLMENT, FIXED_RATE_INSTALLMENT, INSTALLMENT, MIXED_RATE_INSTALLMENT, REVOLVING;

    public String toValue() {
        switch (this) {
            case DEFERRED_INSTALLMENT: return "DEFERRED_INSTALLMENT";
            case FIXED_RATE_INSTALLMENT: return "FIXED_RATE_INSTALLMENT";
            case INSTALLMENT: return "INSTALLMENT";
            case MIXED_RATE_INSTALLMENT: return "MIXED_RATE_INSTALLMENT";
            case REVOLVING: return "REVOLVING";
        }
        return null;
    }

    public static ProductType forValue(String value) throws IOException {
        if (value.equals("DEFERRED_INSTALLMENT")) return DEFERRED_INSTALLMENT;
        if (value.equals("FIXED_RATE_INSTALLMENT")) return FIXED_RATE_INSTALLMENT;
        if (value.equals("INSTALLMENT")) return INSTALLMENT;
        if (value.equals("MIXED_RATE_INSTALLMENT")) return MIXED_RATE_INSTALLMENT;
        if (value.equals("REVOLVING")) return REVOLVING;
        throw new IOException("Cannot deserialize ProductType");
    }
}

// ProductSummary.java

package io.quicktype;

/**
 * Summary of product information
 */
public class ProductSummary {
    private AccountsOverview accountsOverview;

    public AccountsOverview getAccountsOverview() { return accountsOverview; }
    public void setAccountsOverview(AccountsOverview value) { this.accountsOverview = value; }
}

// AccountsOverview.java

package io.quicktype;

public class AccountsOverview {
    private long accountCountTotal;

    /**
     * Total number of accounts under the product.
     */
    public long getAccountCountTotal() { return accountCountTotal; }
    public void setAccountCountTotal(long value) { this.accountCountTotal = value; }
}

// PromotionalPolicies.java

package io.quicktype;

/**
 * If applicable, a promotional configuration for the product.
 */
public class PromotionalPolicies {
    private Double promoAPRRangeInclusiveLower;
    private Double promoAPRRangeInclusiveUpper;
    private Double promoDefaultInterestRatePercent;
    private Boolean promoInterestDeferred;
    private Long promoLen;
    private Double promoMinPayPercent;
    private PromoMinPayType promoMinPayType;
    private Long promoPurchaseWindowLen;

    /**
     * Optional lower bound for APR Range for the product (i.e. 2 = 2%).
     */
    public Double getPromoAPRRangeInclusiveLower() { return promoAPRRangeInclusiveLower; }
    public void setPromoAPRRangeInclusiveLower(Double value) { this.promoAPRRangeInclusiveLower = value; }

    /**
     * Optional upper bound for APR Range for the product (i.e. 5 = 5%).
     */
    public Double getPromoAPRRangeInclusiveUpper() { return promoAPRRangeInclusiveUpper; }
    public void setPromoAPRRangeInclusiveUpper(Double value) { this.promoAPRRangeInclusiveUpper = value; }

    /**
     * The rate that serves as the active interest rate for accounts during the promotional
     * period.
     */
    public Double getPromoDefaultInterestRatePercent() { return promoDefaultInterestRatePercent; }
    public void setPromoDefaultInterestRatePercent(Double value) { this.promoDefaultInterestRatePercent = value; }

    /**
     * Indicates whether interest accrued during the promotional period is deferred interest.
     */
    public Boolean getPromoInterestDeferred() { return promoInterestDeferred; }
    public void setPromoInterestDeferred(Boolean value) { this.promoInterestDeferred = value; }

    /**
     * The number of billing cycles from account origination during which accounts on this
     * product are on a promotional period.
     */
    public Long getPromoLen() { return promoLen; }
    public void setPromoLen(Long value) { this.promoLen = value; }

    /**
     * Defaults to 100. The percent of new interest in the cycle used to determine the minimum
     * payment.
     */
    public Double getPromoMinPayPercent() { return promoMinPayPercent; }
    public void setPromoMinPayPercent(Double value) { this.promoMinPayPercent = value; }

    /**
     * Current due calculation method for the promotional period.
     */
    public PromoMinPayType getPromoMinPayType() { return promoMinPayType; }
    public void setPromoMinPayType(PromoMinPayType value) { this.promoMinPayType = value; }

    /**
     * If applicable, the number of billing cycles from account origination under which this
     * product falls under a purchas window period.
     */
    public Long getPromoPurchaseWindowLen() { return promoPurchaseWindowLen; }
    public void setPromoPurchaseWindowLen(Long value) { this.promoPurchaseWindowLen = value; }
}
