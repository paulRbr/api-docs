// SimpleLineItem.java

package io.quicktype;

public class SimpleLineItem {
    private long accountID;
    private String createdAt;
    private String effectiveAt;
    private ExternalField[] externalFields;
    private IssuerProcessorMetadata issuerProcessorMetadata;
    private long lineItemID;
    private LineItemOverview lineItemOverview;
    private LineItemSummary lineItemSummary;
    private MerchantData merchantData;
    private long productID;

    /**
     * The account associated with the line item
     */
    public long getAccountID() { return accountID; }
    public void setAccountID(long value) { this.accountID = value; }

    /**
     * The `Date-Time` which the line item was created.
     */
    public String getCreatedAt() { return createdAt; }
    public void setCreatedAt(String value) { this.createdAt = value; }

    /**
     * The `Date-Time` that this line item became/becomes active
     */
    public String getEffectiveAt() { return effectiveAt; }
    public void setEffectiveAt(String value) { this.effectiveAt = value; }

    /**
     * An array of static references to fields in a third party system.
     */
    public ExternalField[] getExternalFields() { return externalFields; }
    public void setExternalFields(ExternalField[] value) { this.externalFields = value; }

    public IssuerProcessorMetadata getIssuerProcessorMetadata() { return issuerProcessorMetadata; }
    public void setIssuerProcessorMetadata(IssuerProcessorMetadata value) { this.issuerProcessorMetadata = value; }

    /**
     * The ID associated with the line item
     */
    public long getLineItemID() { return lineItemID; }
    public void setLineItemID(long value) { this.lineItemID = value; }

    public LineItemOverview getLineItemOverview() { return lineItemOverview; }
    public void setLineItemOverview(LineItemOverview value) { this.lineItemOverview = value; }

    public LineItemSummary getLineItemSummary() { return lineItemSummary; }
    public void setLineItemSummary(LineItemSummary value) { this.lineItemSummary = value; }

    /**
     * Merchant information if applicable.
     */
    public MerchantData getMerchantData() { return merchantData; }
    public void setMerchantData(MerchantData value) { this.merchantData = value; }

    /**
     * the Product ID of the account
     */
    public long getProductID() { return productID; }
    public void setProductID(long value) { this.productID = value; }
}

// ExternalField.java

package io.quicktype;

public class ExternalField {
    private String key;
    private String value;

    /**
     * Key - i.e. Name of the External Party
     */
    public String getKey() { return key; }
    public void setKey(String value) { this.key = value; }

    /**
     * Value - i.e. External Account ID
     */
    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }
}

// IssuerProcessorMetadata.java

package io.quicktype;

public class IssuerProcessorMetadata {
    private Privacy privacy;

    public Privacy getPrivacy() { return privacy; }
    public void setPrivacy(Privacy value) { this.privacy = value; }
}

// Privacy.java

package io.quicktype;

public class Privacy {
    private Long lastFour;

    /**
     * Last four digits of the card against which the spend was made.
     */
    public Long getLastFour() { return lastFour; }
    public void setLastFour(Long value) { this.lastFour = value; }
}

// LineItemOverview.java

package io.quicktype;

public class LineItemOverview {
    private String description;
    private LineItemStatus lineItemStatus;
    private LineItemType lineItemType;

    /**
     * A description of this particular line item if any. More common for adjustments.
     */
    public String getDescription() { return description; }
    public void setDescription(String value) { this.description = value; }

    /**
     * the corresponding Status for a line item
     */
    public LineItemStatus getLineItemStatus() { return lineItemStatus; }
    public void setLineItemStatus(LineItemStatus value) { this.lineItemStatus = value; }

    /**
     * The Line Item Type. i.e. `CHARGE`, `PAYMENT`.
     */
    public LineItemType getLineItemType() { return lineItemType; }
    public void setLineItemType(LineItemType value) { this.lineItemType = value; }
}

// LineItemStatus.java

package io.quicktype;

import java.io.IOException;

/**
 * the corresponding Status for a line item
 */
public enum LineItemStatus {
    INVALID, OFFSET, PENDING, REVERSED, ROLLED, SPLIT_INVALID, SPLIT_VALID, VALID;

    public String toValue() {
        switch (this) {
            case INVALID: return "INVALID";
            case OFFSET: return "OFFSET";
            case PENDING: return "PENDING";
            case REVERSED: return "REVERSED";
            case ROLLED: return "ROLLED";
            case SPLIT_INVALID: return "SPLIT_INVALID";
            case SPLIT_VALID: return "SPLIT_VALID";
            case VALID: return "VALID";
        }
        return null;
    }

    public static LineItemStatus forValue(String value) throws IOException {
        if (value.equals("INVALID")) return INVALID;
        if (value.equals("OFFSET")) return OFFSET;
        if (value.equals("PENDING")) return PENDING;
        if (value.equals("REVERSED")) return REVERSED;
        if (value.equals("ROLLED")) return ROLLED;
        if (value.equals("SPLIT_INVALID")) return SPLIT_INVALID;
        if (value.equals("SPLIT_VALID")) return SPLIT_VALID;
        if (value.equals("VALID")) return VALID;
        throw new IOException("Cannot deserialize LineItemStatus");
    }
}

// LineItemType.java

package io.quicktype;

import java.io.IOException;

/**
 * The Line Item Type. i.e. `CHARGE`, `PAYMENT`.
 */
public enum LineItemType {
    CHARGE, CREDIT_OFFSET, DEBIT_OFFSET, DEFERRED_INTEREST, FEE, INTEREST, LATE_FEE, LOAN, MIN_DUE, PAYMENT, PAYMENT_SPLIT, PRODUCT_INTEREST, PROMO_END, PURCHASE_WINDOW_END, RETURN_CHECK_FEE, STATEMENT;

    public String toValue() {
        switch (this) {
            case CHARGE: return "CHARGE";
            case CREDIT_OFFSET: return "CREDIT_OFFSET";
            case DEBIT_OFFSET: return "DEBIT_OFFSET";
            case DEFERRED_INTEREST: return "DEFERRED_INTEREST";
            case FEE: return "FEE";
            case INTEREST: return "INTEREST";
            case LATE_FEE: return "LATE_FEE";
            case LOAN: return "LOAN";
            case MIN_DUE: return "MIN_DUE";
            case PAYMENT: return "PAYMENT";
            case PAYMENT_SPLIT: return "PAYMENT_SPLIT";
            case PRODUCT_INTEREST: return "PRODUCT_INTEREST";
            case PROMO_END: return "PROMO_END";
            case PURCHASE_WINDOW_END: return "PURCHASE_WINDOW_END";
            case RETURN_CHECK_FEE: return "RETURN_CHECK_FEE";
            case STATEMENT: return "STATEMENT";
        }
        return null;
    }

    public static LineItemType forValue(String value) throws IOException {
        if (value.equals("CHARGE")) return CHARGE;
        if (value.equals("CREDIT_OFFSET")) return CREDIT_OFFSET;
        if (value.equals("DEBIT_OFFSET")) return DEBIT_OFFSET;
        if (value.equals("DEFERRED_INTEREST")) return DEFERRED_INTEREST;
        if (value.equals("FEE")) return FEE;
        if (value.equals("INTEREST")) return INTEREST;
        if (value.equals("LATE_FEE")) return LATE_FEE;
        if (value.equals("LOAN")) return LOAN;
        if (value.equals("MIN_DUE")) return MIN_DUE;
        if (value.equals("PAYMENT")) return PAYMENT;
        if (value.equals("PAYMENT_SPLIT")) return PAYMENT_SPLIT;
        if (value.equals("PRODUCT_INTEREST")) return PRODUCT_INTEREST;
        if (value.equals("PROMO_END")) return PROMO_END;
        if (value.equals("PURCHASE_WINDOW_END")) return PURCHASE_WINDOW_END;
        if (value.equals("RETURN_CHECK_FEE")) return RETURN_CHECK_FEE;
        if (value.equals("STATEMENT")) return STATEMENT;
        throw new IOException("Cannot deserialize LineItemType");
    }
}

// LineItemSummary.java

package io.quicktype;

public class LineItemSummary {
    private long originalAmountCents;

    /**
     * The originating amount of money (in cents) relating to this line item.
     */
    public long getOriginalAmountCents() { return originalAmountCents; }
    public void setOriginalAmountCents(long value) { this.originalAmountCents = value; }
}

// MerchantData.java

package io.quicktype;

/**
 * Merchant information if applicable.
 */
public class MerchantData {
    private String id;
    private Double mccCode;
    private String name;
    private String phoneNumber;

    public String getID() { return id; }
    public void setID(String value) { this.id = value; }

    public Double getMccCode() { return mccCode; }
    public void setMccCode(Double value) { this.mccCode = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String value) { this.phoneNumber = value; }
}
