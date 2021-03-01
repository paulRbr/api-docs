// ComplexCustomer.java

package io.quicktype;

import java.time.LocalDate;

public class ComplexCustomer {
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
    private Account[] accounts;

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
     * An array of Accounts this Customer is assigned to.
     */
    public Account[] getAccounts() { return accounts; }
    public void setAccounts(Account[] value) { this.accounts = value; }
}

// Account.java

package io.quicktype;

import java.time.OffsetDateTime;

public class Account {
    private long accountID;
    private AccountOverview accountOverview;
    private AccountProduct accountProduct;
    private AdditionalStatementMinPayDetails additionalStatementMinPayDetails;
    private AssociatedEntities associatedEntities;
    private OffsetDateTime createdAt;
    private OffsetDateTime effectiveAt;
    private ExternalField[] externalFields;
    private MinPayDueCents minPayDueCents;
    private Summary summary;

    /**
     * This is generated by Canopy. A unique ID for the account.
     */
    public long getAccountID() { return accountID; }
    public void setAccountID(long value) { this.accountID = value; }

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
    public OffsetDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(OffsetDateTime value) { this.createdAt = value; }

    /**
     * The `Date-Time` that this account became/becomes active.
     */
    public OffsetDateTime getEffectiveAt() { return effectiveAt; }
    public void setEffectiveAt(OffsetDateTime value) { this.effectiveAt = value; }

    /**
     * An Array of External Fields. These should be used to connect accounts created in Canopy
     * to Users in your system and any connected external systems.
     */
    public ExternalField[] getExternalFields() { return externalFields; }
    public void setExternalFields(ExternalField[] value) { this.externalFields = value; }

    public MinPayDueCents getMinPayDueCents() { return minPayDueCents; }
    public void setMinPayDueCents(MinPayDueCents value) { this.minPayDueCents = value; }

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

import java.time.OffsetDateTime;

public class PostPromoOverview {
    private OffsetDateTime postPromoExclusiveEnd;
    private Long postPromoImplAmLen;
    private Double postPromoImplInterestRatePercent;
    private OffsetDateTime postPromoInclusiveStart;

    /**
     * If applicable, the start date for a promotional period for the account.
     */
    public OffsetDateTime getPostPromoExclusiveEnd() { return postPromoExclusiveEnd; }
    public void setPostPromoExclusiveEnd(OffsetDateTime value) { this.postPromoExclusiveEnd = value; }

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
    public OffsetDateTime getPostPromoInclusiveStart() { return postPromoInclusiveStart; }
    public void setPostPromoInclusiveStart(OffsetDateTime value) { this.postPromoInclusiveStart = value; }
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

import java.time.OffsetDateTime;

public class ProductLifecycle {
    private long lateFeeImplCents;
    private OffsetDateTime loanEndDate;
    private long paymentReversalFeeImplCents;

    /**
     * The fee charged for late payments on the account.
     */
    public long getLateFeeImplCents() { return lateFeeImplCents; }
    public void setLateFeeImplCents(long value) { this.lateFeeImplCents = value; }

    /**
     * If applicable, the account's loan repayment date.
     */
    public OffsetDateTime getLoanEndDate() { return loanEndDate; }
    public void setLoanEndDate(OffsetDateTime value) { this.loanEndDate = value; }

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

import java.time.OffsetDateTime;

public class PromoOverview {
    private OffsetDateTime promoExclusiveEnd;
    private Double promoImplInterestRatePercent;
    private OffsetDateTime promoInclusiveStart;
    private OffsetDateTime promoPurchaseWindowExclusiveEnd;
    private OffsetDateTime promoPurchaseWindowInclusiveStart;

    /**
     * If applicable, the start date for a promotional period for the account.
     */
    public OffsetDateTime getPromoExclusiveEnd() { return promoExclusiveEnd; }
    public void setPromoExclusiveEnd(OffsetDateTime value) { this.promoExclusiveEnd = value; }

    /**
     * The percentage interest applied to the account during the promotional period (i.e. 6.2%)
     */
    public Double getPromoImplInterestRatePercent() { return promoImplInterestRatePercent; }
    public void setPromoImplInterestRatePercent(Double value) { this.promoImplInterestRatePercent = value; }

    /**
     * If applicable, the start date for a promotional period for the account.
     */
    public OffsetDateTime getPromoInclusiveStart() { return promoInclusiveStart; }
    public void setPromoInclusiveStart(OffsetDateTime value) { this.promoInclusiveStart = value; }

    /**
     * If applicable, the end date for a purchase window for the account
     */
    public OffsetDateTime getPromoPurchaseWindowExclusiveEnd() { return promoPurchaseWindowExclusiveEnd; }
    public void setPromoPurchaseWindowExclusiveEnd(OffsetDateTime value) { this.promoPurchaseWindowExclusiveEnd = value; }

    /**
     * If applicable, the start date for a purchase window for the account
     */
    public OffsetDateTime getPromoPurchaseWindowInclusiveStart() { return promoPurchaseWindowInclusiveStart; }
    public void setPromoPurchaseWindowInclusiveStart(OffsetDateTime value) { this.promoPurchaseWindowInclusiveStart = value; }
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

import java.time.OffsetDateTime;

public class MinPayDueCents {
    private OffsetDateTime minPayDueAt;
    private long statementMinPayCents;

    /**
     * The `Date-Time` the payment for this billing cycle is due.
     */
    public OffsetDateTime getMinPayDueAt() { return minPayDueAt; }
    public void setMinPayDueAt(OffsetDateTime value) { this.minPayDueAt = value; }

    /**
     * Total amount due for the billing cycle, summing cycle principal, interest, deferred
     * interest, and fees outstanding.
     */
    public long getStatementMinPayCents() { return statementMinPayCents; }
    public void setStatementMinPayCents(long value) { this.statementMinPayCents = value; }
}

// Summary.java

package io.quicktype;

public class Summary {
    private Long amDeferredInterestBalanceCents;
    private Long amInterestBalanceCents;
    private Long availableCreditCents;
    private long creditLimitCents;
    private Long deferredInterestBalanceCents;
    private long interestBalanceCents;
    private double interestRatePercent;
    private Long maxApprovedCreditLimitCents;
    private Long openToBuyCents;
    private long principalCents;
    private long totalBalanceCents;
    private long totalInterestPaidToDateCents;
    private long totalPaidToDateCents;
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
    public long getInterestBalanceCents() { return interestBalanceCents; }
    public void setInterestBalanceCents(long value) { this.interestBalanceCents = value; }

    /**
     * The percentage interest applied to the account (i.e. 6.2 means 6.2%)
     */
    public double getInterestRatePercent() { return interestRatePercent; }
    public void setInterestRatePercent(double value) { this.interestRatePercent = value; }

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
    public long getPrincipalCents() { return principalCents; }
    public void setPrincipalCents(long value) { this.principalCents = value; }

    /**
     * The total balance (in cents) associated with the account.
     */
    public long getTotalBalanceCents() { return totalBalanceCents; }
    public void setTotalBalanceCents(long value) { this.totalBalanceCents = value; }

    /**
     * The total sum of interest allocations for payments made to date (in cents) associated
     * with the account.
     */
    public long getTotalInterestPaidToDateCents() { return totalInterestPaidToDateCents; }
    public void setTotalInterestPaidToDateCents(long value) { this.totalInterestPaidToDateCents = value; }

    /**
     * The total sum of payments made to date (in cents) associated with the account.
     */
    public long getTotalPaidToDateCents() { return totalPaidToDateCents; }
    public void setTotalPaidToDateCents(long value) { this.totalPaidToDateCents = value; }

    /**
     * The total amount needed to pay off the loan at this exact moment.
     */
    public Long getTotalPayoffCents() { return totalPayoffCents; }
    public void setTotalPayoffCents(Long value) { this.totalPayoffCents = value; }
}
