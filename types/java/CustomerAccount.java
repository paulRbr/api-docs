// CustomerAccount.java

package io.quicktype;

import java.time.LocalDate;

public class CustomerAccount {
    private String addressCity;
    private String addressLineOne;
    private String addressLineTwo;
    private String addressState;
    private String addressZip;
    private long customerID;
    private LocalDate dateOfBirth;
    private String email;
    private String nameFirst;
    private String nameLast;
    private String nameMiddle;
    private String namePrefix;
    private String nameSuffix;
    private String phoneNumber;
    private String ssn;
    private String customerAccountExternalID;
    private CustomerAccountIssuerProcessorConfig customerAccountIssuerProcessorConfig;
    private CustomerAccountRole customerAccountRole;
    private Account account;

    /**
     * Address city
     */
    public String getAddressCity() { return addressCity; }
    public void setAddressCity(String value) { this.addressCity = value; }

    /**
     * Address line one
     */
    public String getAddressLineOne() { return addressLineOne; }
    public void setAddressLineOne(String value) { this.addressLineOne = value; }

    /**
     * Address line two
     */
    public String getAddressLineTwo() { return addressLineTwo; }
    public void setAddressLineTwo(String value) { this.addressLineTwo = value; }

    /**
     * Address state
     */
    public String getAddressState() { return addressState; }
    public void setAddressState(String value) { this.addressState = value; }

    /**
     * Five digit zipcode or nine digit 'ZIP+4'
     */
    public String getAddressZip() { return addressZip; }
    public void setAddressZip(String value) { this.addressZip = value; }

    /**
     * A Canopy-generated unique ID for the customer
     */
    public long getCustomerID() { return customerID; }
    public void setCustomerID(long value) { this.customerID = value; }

    /**
     * Customer's date of birth in ISO 8601 format
     */
    public LocalDate getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(LocalDate value) { this.dateOfBirth = value; }

    /**
     * The email address of this Customer
     */
    public String getEmail() { return email; }
    public void setEmail(String value) { this.email = value; }

    /**
     * Customer's first name
     */
    public String getNameFirst() { return nameFirst; }
    public void setNameFirst(String value) { this.nameFirst = value; }

    /**
     * Customer's last name
     */
    public String getNameLast() { return nameLast; }
    public void setNameLast(String value) { this.nameLast = value; }

    /**
     * Customer's middle name
     */
    public String getNameMiddle() { return nameMiddle; }
    public void setNameMiddle(String value) { this.nameMiddle = value; }

    /**
     * Prefix to the customer's name
     */
    public String getNamePrefix() { return namePrefix; }
    public void setNamePrefix(String value) { this.namePrefix = value; }

    /**
     * Suffix to the customer's name
     */
    public String getNameSuffix() { return nameSuffix; }
    public void setNameSuffix(String value) { this.nameSuffix = value; }

    /**
     * Customer's phone number in E.164 format
     */
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String value) { this.phoneNumber = value; }

    /**
     * Social security number of the customer
     */
    public String getSsn() { return ssn; }
    public void setSsn(String value) { this.ssn = value; }

    /**
     * A unique number for the customer on the account. For instance, a credit card number. If
     * none is provided, a Canopy-generated ID can be used.
     */
    public String getCustomerAccountExternalID() { return customerAccountExternalID; }
    public void setCustomerAccountExternalID(String value) { this.customerAccountExternalID = value; }

    public CustomerAccountIssuerProcessorConfig getCustomerAccountIssuerProcessorConfig() { return customerAccountIssuerProcessorConfig; }
    public void setCustomerAccountIssuerProcessorConfig(CustomerAccountIssuerProcessorConfig value) { this.customerAccountIssuerProcessorConfig = value; }

    /**
     * The role of the customer for the account.
     */
    public CustomerAccountRole getCustomerAccountRole() { return customerAccountRole; }
    public void setCustomerAccountRole(CustomerAccountRole value) { this.customerAccountRole = value; }

    public Account getAccount() { return account; }
    public void setAccount(Account value) { this.account = value; }
}

// Account.java

package io.quicktype;

public class Account {
    private String accountID;
    private AccountOverview accountOverview;
    private AccountProduct accountProduct;
    private AdditionalStatementMinPayDetails additionalStatementMinPayDetails;
    private AssociatedEntities associatedEntities;
    private String createdAt;
    private String effectiveAt;
    private ExternalField[] externalFields;
    private MinPayDueCents minPayDueCents;
    private PaymentProcessorConfig paymentProcessorConfig;
    private Summary summary;

    /**
     * This is generated by Canopy. A unique ID for the account.
     */
    public String getAccountID() { return accountID; }
    public void setAccountID(String value) { this.accountID = value; }

    public AccountOverview getAccountOverview() { return accountOverview; }
    public void setAccountOverview(AccountOverview value) { this.accountOverview = value; }

    /**
     * The product associated with the account.
     */
    public AccountProduct getAccountProduct() { return accountProduct; }
    public void setAccountProduct(AccountProduct value) { this.accountProduct = value; }

    public AdditionalStatementMinPayDetails getAdditionalStatementMinPayDetails() { return additionalStatementMinPayDetails; }
    public void setAdditionalStatementMinPayDetails(AdditionalStatementMinPayDetails value) { this.additionalStatementMinPayDetails = value; }

    public AssociatedEntities getAssociatedEntities() { return associatedEntities; }
    public void setAssociatedEntities(AssociatedEntities value) { this.associatedEntities = value; }

    /**
     * The `Date-Time` which the account was created in the API.
     */
    public String getCreatedAt() { return createdAt; }
    public void setCreatedAt(String value) { this.createdAt = value; }

    /**
     * The `Date-Time` that this account became/becomes active.
     */
    public String getEffectiveAt() { return effectiveAt; }
    public void setEffectiveAt(String value) { this.effectiveAt = value; }

    /**
     * An Array of External Fields. These should be used to connect accounts created in Canopy
     * to Users in your system and any connected external systems.
     */
    public ExternalField[] getExternalFields() { return externalFields; }
    public void setExternalFields(ExternalField[] value) { this.externalFields = value; }

    public MinPayDueCents getMinPayDueCents() { return minPayDueCents; }
    public void setMinPayDueCents(MinPayDueCents value) { this.minPayDueCents = value; }

    public PaymentProcessorConfig getPaymentProcessorConfig() { return paymentProcessorConfig; }
    public void setPaymentProcessorConfig(PaymentProcessorConfig value) { this.paymentProcessorConfig = value; }

    public Summary getSummary() { return summary; }
    public void setSummary(Summary value) { this.summary = value; }
}

// AccountOverview.java

package io.quicktype;

public class AccountOverview {
    private String accountStatus;
    private String accountStatusSubtype;

    /**
     * The Status of the Account. Active upon account creation.
     */
    public String getAccountStatus() { return accountStatus; }
    public void setAccountStatus(String value) { this.accountStatus = value; }

    /**
     * The subtype of the Status of the Account. Null upon account creation.
     */
    public String getAccountStatusSubtype() { return accountStatusSubtype; }
    public void setAccountStatusSubtype(String value) { this.accountStatusSubtype = value; }
}

// AccountProduct.java

package io.quicktype;

/**
 * The product associated with the account.
 */
public class AccountProduct {
    private String externalProductID;
    private PostPromoOverview postPromoOverview;
    private ProductDurationInformation productDurationInformation;
    private long productID;
    private ProductLifecycle productLifecycle;
    private ProductOverview productOverview;
    private PromoOverview promoOverview;

    /**
     * A unique external ID that may be used interchangeably with the Canopy-generated product ID
     */
    public String getExternalProductID() { return externalProductID; }
    public void setExternalProductID(String value) { this.externalProductID = value; }

    public PostPromoOverview getPostPromoOverview() { return postPromoOverview; }
    public void setPostPromoOverview(PostPromoOverview value) { this.postPromoOverview = value; }

    public ProductDurationInformation getProductDurationInformation() { return productDurationInformation; }
    public void setProductDurationInformation(ProductDurationInformation value) { this.productDurationInformation = value; }

    /**
     * The Canopy-generated ID for the product.
     */
    public long getProductID() { return productID; }
    public void setProductID(long value) { this.productID = value; }

    public ProductLifecycle getProductLifecycle() { return productLifecycle; }
    public void setProductLifecycle(ProductLifecycle value) { this.productLifecycle = value; }

    public ProductOverview getProductOverview() { return productOverview; }
    public void setProductOverview(ProductOverview value) { this.productOverview = value; }

    public PromoOverview getPromoOverview() { return promoOverview; }
    public void setPromoOverview(PromoOverview value) { this.promoOverview = value; }
}

// PostPromoOverview.java

package io.quicktype;

public class PostPromoOverview {
    private String postPromoExclusiveEnd;
    private Long postPromoImplAmLen;
    private Double postPromoImplInterestRatePercent;
    private String postPromoInclusiveStart;

    /**
     * If applicable, the start date for a promotional period for the account.
     */
    public String getPostPromoExclusiveEnd() { return postPromoExclusiveEnd; }
    public void setPostPromoExclusiveEnd(String value) { this.postPromoExclusiveEnd = value; }

    /**
     * If applicable, post-promotional amortization length in cycles.
     */
    public Long getPostPromoImplAmLen() { return postPromoImplAmLen; }
    public void setPostPromoImplAmLen(Long value) { this.postPromoImplAmLen = value; }

    /**
     * The percentage interest applied to the account during the post-promotional period (i.e.
     * 6.2%)
     */
    public Double getPostPromoImplInterestRatePercent() { return postPromoImplInterestRatePercent; }
    public void setPostPromoImplInterestRatePercent(Double value) { this.postPromoImplInterestRatePercent = value; }

    /**
     * If applicable, the start date for a promotional period for the account.
     */
    public String getPostPromoInclusiveStart() { return postPromoInclusiveStart; }
    public void setPostPromoInclusiveStart(String value) { this.postPromoInclusiveStart = value; }
}

// ProductDurationInformation.java

package io.quicktype;

public class ProductDurationInformation {
    private Long promoLen;
    private Long promoPurchaseWindowLen;

    /**
     * The number of billing cycles from account origination during which accounts on this
     * product are on a promotional period.
     */
    public Long getPromoLen() { return promoLen; }
    public void setPromoLen(Long value) { this.promoLen = value; }

    /**
     * If applicable, the number of billing cycles from account origination under which this
     * product falls under a purchas window period.
     */
    public Long getPromoPurchaseWindowLen() { return promoPurchaseWindowLen; }
    public void setPromoPurchaseWindowLen(Long value) { this.promoPurchaseWindowLen = value; }
}

// ProductLifecycle.java

package io.quicktype;

public class ProductLifecycle {
    private long lateFeeImplCents;
    private String loanEndDate;
    private long paymentReversalFeeImplCents;

    /**
     * The fee charged for late payments on the account.
     */
    public long getLateFeeImplCents() { return lateFeeImplCents; }
    public void setLateFeeImplCents(long value) { this.lateFeeImplCents = value; }

    /**
     * If applicable, the account's loan repayment date.
     */
    public String getLoanEndDate() { return loanEndDate; }
    public void setLoanEndDate(String value) { this.loanEndDate = value; }

    /**
     * The fee charged for payment reversals on the account.
     */
    public long getPaymentReversalFeeImplCents() { return paymentReversalFeeImplCents; }
    public void setPaymentReversalFeeImplCents(long value) { this.paymentReversalFeeImplCents = value; }
}

// ProductOverview.java

package io.quicktype;

public class ProductOverview {
    private String productColor;
    private String productLongDescription;
    private String productName;
    private String productShortDescription;
    private String productTimeZone;
    private ProductType productType;

    /**
     * A color to be associated with the product for UI purposes.
     */
    public String getProductColor() { return productColor; }
    public void setProductColor(String value) { this.productColor = value; }

    /**
     * Description of the Product.
     */
    public String getProductLongDescription() { return productLongDescription; }
    public void setProductLongDescription(String value) { this.productLongDescription = value; }

    /**
     * Name of Product, i.e. Express Card.
     */
    public String getProductName() { return productName; }
    public void setProductName(String value) { this.productName = value; }

    /**
     * Short description of the Product - max of 30 characters.
     */
    public String getProductShortDescription() { return productShortDescription; }
    public void setProductShortDescription(String value) { this.productShortDescription = value; }

    /**
     * Timezone denoted as an [Olson-style
     * timezone](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones) defining the
     * timezone for the product. All times in any response data for accounts using this product
     * will be denominated in this timezone. Shifts due to daylight savings will be accounted
     * for where relevant, and all output timestamps will be denoted as UTC offsets normalized
     * based on this value.
     */
    public String getProductTimeZone() { return productTimeZone; }
    public void setProductTimeZone(String value) { this.productTimeZone = value; }

    /**
     * The Type of Product. If not included, defaults to `REVOLVING`
     */
    public ProductType getProductType() { return productType; }
    public void setProductType(ProductType value) { this.productType = value; }
}

// ProductType.java

package io.quicktype;

import java.io.IOException;

/**
 * The Type of Product. If not included, defaults to `REVOLVING`
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

// PromoOverview.java

package io.quicktype;

public class PromoOverview {
    private String promoExclusiveEnd;
    private Double promoImplInterestRatePercent;
    private String promoInclusiveStart;
    private String promoPurchaseWindowExclusiveEnd;
    private String promoPurchaseWindowInclusiveStart;

    /**
     * If applicable, the start date for a promotional period for the account.
     */
    public String getPromoExclusiveEnd() { return promoExclusiveEnd; }
    public void setPromoExclusiveEnd(String value) { this.promoExclusiveEnd = value; }

    /**
     * The percentage interest applied to the account during the promotional period (i.e. 6.2%)
     */
    public Double getPromoImplInterestRatePercent() { return promoImplInterestRatePercent; }
    public void setPromoImplInterestRatePercent(Double value) { this.promoImplInterestRatePercent = value; }

    /**
     * If applicable, the start date for a promotional period for the account.
     */
    public String getPromoInclusiveStart() { return promoInclusiveStart; }
    public void setPromoInclusiveStart(String value) { this.promoInclusiveStart = value; }

    /**
     * If applicable, the end date for a purchase window for the account
     */
    public String getPromoPurchaseWindowExclusiveEnd() { return promoPurchaseWindowExclusiveEnd; }
    public void setPromoPurchaseWindowExclusiveEnd(String value) { this.promoPurchaseWindowExclusiveEnd = value; }

    /**
     * If applicable, the start date for a purchase window for the account
     */
    public String getPromoPurchaseWindowInclusiveStart() { return promoPurchaseWindowInclusiveStart; }
    public void setPromoPurchaseWindowInclusiveStart(String value) { this.promoPurchaseWindowInclusiveStart = value; }
}

// AdditionalStatementMinPayDetails.java

package io.quicktype;

public class AdditionalStatementMinPayDetails {
    private long previousStatementMinPayCents;
    private long statementMinPayAmDeferredInterestCents;
    private long statementMinPayAmInterestCents;
    private long statementMinPayChargesPrincipalCents;
    private long statementMinPayDeferredCents;
    private long statementMinPayFeesCents;
    private long statementMinPayInterestCents;

    /**
     * Previous amounts due, including fees. This is a subset of statement_min_pay_cents.
     */
    public long getPreviousStatementMinPayCents() { return previousStatementMinPayCents; }
    public void setPreviousStatementMinPayCents(long value) { this.previousStatementMinPayCents = value; }

    /**
     * The current AM deferred interest balance of the line item. Canopy tracks deferred
     * interest during an amortization period separately from deferred interest accrued during a
     * revolving period.
     */
    public long getStatementMinPayAmDeferredInterestCents() { return statementMinPayAmDeferredInterestCents; }
    public void setStatementMinPayAmDeferredInterestCents(long value) { this.statementMinPayAmDeferredInterestCents = value; }

    /**
     * The current AM interest balance of the line item. Canopy tracks interest during an
     * amortization period separately from deferred interest accrued during a revolving period.
     */
    public long getStatementMinPayAmInterestCents() { return statementMinPayAmInterestCents; }
    public void setStatementMinPayAmInterestCents(long value) { this.statementMinPayAmInterestCents = value; }

    /**
     * Total principal due for the billing cycle.
     */
    public long getStatementMinPayChargesPrincipalCents() { return statementMinPayChargesPrincipalCents; }
    public void setStatementMinPayChargesPrincipalCents(long value) { this.statementMinPayChargesPrincipalCents = value; }

    /**
     * Total deferred interest due for the billing cycle.
     */
    public long getStatementMinPayDeferredCents() { return statementMinPayDeferredCents; }
    public void setStatementMinPayDeferredCents(long value) { this.statementMinPayDeferredCents = value; }

    /**
     * Total fees due for the billing cycle.
     */
    public long getStatementMinPayFeesCents() { return statementMinPayFeesCents; }
    public void setStatementMinPayFeesCents(long value) { this.statementMinPayFeesCents = value; }

    /**
     * Total interest due for the billing cycle.
     */
    public long getStatementMinPayInterestCents() { return statementMinPayInterestCents; }
    public void setStatementMinPayInterestCents(long value) { this.statementMinPayInterestCents = value; }
}

// AssociatedEntities.java

package io.quicktype;

public class AssociatedEntities {
    private String lenderName;
    private String merchantName;

    /**
     * A lender name associated with the account
     */
    public String getLenderName() { return lenderName; }
    public void setLenderName(String value) { this.lenderName = value; }

    /**
     * A merchant name associated with the account
     */
    public String getMerchantName() { return merchantName; }
    public void setMerchantName(String value) { this.merchantName = value; }
}

// ExternalField.java

package io.quicktype;

public class ExternalField {
    private String key;
    private String value;

    /**
     * key: i.e. Name of the External Party
     */
    public String getKey() { return key; }
    public void setKey(String value) { this.key = value; }

    /**
     * value: i.e. External Account ID
     */
    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }
}

// MinPayDueCents.java

package io.quicktype;

public class MinPayDueCents {
    private String minPayDueAt;
    private long statementMinPayCents;

    /**
     * The `Date-Time` the payment for this billing cycle is due.
     */
    public String getMinPayDueAt() { return minPayDueAt; }
    public void setMinPayDueAt(String value) { this.minPayDueAt = value; }

    /**
     * Total amount due for the billing cycle, summing cycle principal, interest, deferred
     * interest, and fees outstanding.
     */
    public long getStatementMinPayCents() { return statementMinPayCents; }
    public void setStatementMinPayCents(long value) { this.statementMinPayCents = value; }
}

// PaymentProcessorConfig.java

package io.quicktype;

public class PaymentProcessorConfig {
    private Boolean autopayEnabled;
    private PaymentProcessorName paymentProcessorName;
    private RepayConfig repayConfig;

    /**
     * Indicates whether autopay is enabled for this account. Currently, autopay is triggered
     * two days prior to a payment due date.
     */
    public Boolean getAutopayEnabled() { return autopayEnabled; }
    public void setAutopayEnabled(Boolean value) { this.autopayEnabled = value; }

    /**
     * Indicates the active payment processor whose configuration will be used for payments made
     * from the account. If `NONE`, Canopy will not trigger payments to an external payment
     * processor when they occur.
     */
    public PaymentProcessorName getPaymentProcessorName() { return paymentProcessorName; }
    public void setPaymentProcessorName(PaymentProcessorName value) { this.paymentProcessorName = value; }

    public RepayConfig getRepayConfig() { return repayConfig; }
    public void setRepayConfig(RepayConfig value) { this.repayConfig = value; }
}

// PaymentProcessorName.java

package io.quicktype;

import java.io.IOException;

/**
 * Indicates the active payment processor whose configuration will be used for payments made
 * from the account. If `NONE`, Canopy will not trigger payments to an external payment
 * processor when they occur.
 */
public enum PaymentProcessorName {
    NONE, REPAY;

    public String toValue() {
        switch (this) {
            case NONE: return "NONE";
            case REPAY: return "REPAY";
        }
        return null;
    }

    public static PaymentProcessorName forValue(String value) throws IOException {
        if (value.equals("NONE")) return NONE;
        if (value.equals("REPAY")) return REPAY;
        throw new IOException("Cannot deserialize PaymentProcessorName");
    }
}

// RepayConfig.java

package io.quicktype;

public class RepayConfig {
    private boolean validConfig;

    /**
     * Indicates whether Canopy has a valid configuration stored for this payment processor for
     * this account. For example, if Canopy needs an ACH token on behalf of the account to call
     * the processor, this field will indicate that Canopy has successfully stored the necessary
     * token.
     */
    public boolean getValidConfig() { return validConfig; }
    public void setValidConfig(boolean value) { this.validConfig = value; }
}

// Summary.java

package io.quicktype;

public class Summary {
    private Long amDeferredInterestBalanceCents;
    private Long amInterestBalanceCents;
    private Long availableCreditCents;
    private long creditLimitCents;
    private Long deferredInterestBalanceCents;
    private Long interestBalanceCents;
    private Double interestRatePercent;
    private Long maxApprovedCreditLimitCents;
    private Long openToBuyCents;
    private Long principalCents;
    private Long totalBalanceCents;
    private Long totalInterestPaidToDateCents;
    private Long totalPaidToDateCents;
    private Long totalPayoffCents;

    /**
     * The total AM deferred interest balance (in cents) associated with the account.
     */
    public Long getAmDeferredInterestBalanceCents() { return amDeferredInterestBalanceCents; }
    public void setAmDeferredInterestBalanceCents(Long value) { this.amDeferredInterestBalanceCents = value; }

    /**
     * The total AM interest balance (in cents) associated with the account.
     */
    public Long getAmInterestBalanceCents() { return amInterestBalanceCents; }
    public void setAmInterestBalanceCents(Long value) { this.amInterestBalanceCents = value; }

    /**
     * The total available credit balance (in cents) for the account.
     */
    public Long getAvailableCreditCents() { return availableCreditCents; }
    public void setAvailableCreditCents(Long value) { this.availableCreditCents = value; }

    /**
     * Total Amount (in cents) that this account can borrow.
     */
    public long getCreditLimitCents() { return creditLimitCents; }
    public void setCreditLimitCents(long value) { this.creditLimitCents = value; }

    /**
     * The total deferred interest balance (in cents) associated with the account.
     */
    public Long getDeferredInterestBalanceCents() { return deferredInterestBalanceCents; }
    public void setDeferredInterestBalanceCents(Long value) { this.deferredInterestBalanceCents = value; }

    /**
     * The total interest balance (in cents) associated with the account.
     */
    public Long getInterestBalanceCents() { return interestBalanceCents; }
    public void setInterestBalanceCents(Long value) { this.interestBalanceCents = value; }

    /**
     * The percentage interest applied to the account (i.e. 6.2 means 6.2%)
     */
    public Double getInterestRatePercent() { return interestRatePercent; }
    public void setInterestRatePercent(Double value) { this.interestRatePercent = value; }

    /**
     * Total Amount (in cents) that this account can borrow.
     */
    public Long getMaxApprovedCreditLimitCents() { return maxApprovedCreditLimitCents; }
    public void setMaxApprovedCreditLimitCents(Long value) { this.maxApprovedCreditLimitCents = value; }

    /**
     * If applicable, the total amount of available funds for continued purchase following a
     * purchase window pattern, where payments made do not replenish amount available for
     * purchase.
     */
    public Long getOpenToBuyCents() { return openToBuyCents; }
    public void setOpenToBuyCents(Long value) { this.openToBuyCents = value; }

    /**
     * The total balance (in cents) associated with the account.
     */
    public Long getPrincipalCents() { return principalCents; }
    public void setPrincipalCents(Long value) { this.principalCents = value; }

    /**
     * The total balance (in cents) associated with the account.
     */
    public Long getTotalBalanceCents() { return totalBalanceCents; }
    public void setTotalBalanceCents(Long value) { this.totalBalanceCents = value; }

    /**
     * The total sum of interest allocations for payments made to date (in cents) associated
     * with the account.
     */
    public Long getTotalInterestPaidToDateCents() { return totalInterestPaidToDateCents; }
    public void setTotalInterestPaidToDateCents(Long value) { this.totalInterestPaidToDateCents = value; }

    /**
     * The total sum of payments made to date (in cents) associated with the account.
     */
    public Long getTotalPaidToDateCents() { return totalPaidToDateCents; }
    public void setTotalPaidToDateCents(Long value) { this.totalPaidToDateCents = value; }

    /**
     * The total amount needed to pay off the loan at this exact moment.
     */
    public Long getTotalPayoffCents() { return totalPayoffCents; }
    public void setTotalPayoffCents(Long value) { this.totalPayoffCents = value; }
}

// CustomerAccountIssuerProcessorConfig.java

package io.quicktype;

public class CustomerAccountIssuerProcessorConfig {
    private Privacy privacy;

    public Privacy getPrivacy() { return privacy; }
    public void setPrivacy(Privacy value) { this.privacy = value; }
}

// Privacy.java

package io.quicktype;

public class Privacy {
    private PrivacyCard privacyCard;

    public PrivacyCard getPrivacyCard() { return privacyCard; }
    public void setPrivacyCard(PrivacyCard value) { this.privacyCard = value; }
}

// PrivacyCard.java

package io.quicktype;

public class PrivacyCard {
    private String lastFour;
    private String memo;
    private Type type;

    /**
     * Last four digits of the card number
     */
    public String getLastFour() { return lastFour; }
    public void setLastFour(String value) { this.lastFour = value; }

    /**
     * Friendly name to identify the card
     */
    public String getMemo() { return memo; }
    public void setMemo(String value) { this.memo = value; }

    /**
     * The type of card created by privacy.com
     */
    public Type getType() { return type; }
    public void setType(Type value) { this.type = value; }
}

// Type.java

package io.quicktype;

import java.io.IOException;

/**
 * The type of card created by privacy.com
 */
public enum Type {
    MERCHANT_LOCKED, SINGLE_USE, UNLOCKED;

    public String toValue() {
        switch (this) {
            case MERCHANT_LOCKED: return "MERCHANT_LOCKED";
            case SINGLE_USE: return "SINGLE_USE";
            case UNLOCKED: return "UNLOCKED";
        }
        return null;
    }

    public static Type forValue(String value) throws IOException {
        if (value.equals("MERCHANT_LOCKED")) return MERCHANT_LOCKED;
        if (value.equals("SINGLE_USE")) return SINGLE_USE;
        if (value.equals("UNLOCKED")) return UNLOCKED;
        throw new IOException("Cannot deserialize Type");
    }
}

// CustomerAccountRole.java

package io.quicktype;

import java.io.IOException;

/**
 * The role of the customer for the account.
 */
public enum CustomerAccountRole {
    PRIMARY, SECONDARY;

    public String toValue() {
        switch (this) {
            case PRIMARY: return "PRIMARY";
            case SECONDARY: return "SECONDARY";
        }
        return null;
    }

    public static CustomerAccountRole forValue(String value) throws IOException {
        if (value.equals("PRIMARY")) return PRIMARY;
        if (value.equals("SECONDARY")) return SECONDARY;
        throw new IOException("Cannot deserialize CustomerAccountRole");
    }
}
