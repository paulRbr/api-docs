// LineItem.java

package io.quicktype;

import java.time.OffsetDateTime;

public class LineItem {
    private long accountID;
    private OffsetDateTime createdAt;
    private OffsetDateTime effectiveAt;
    private ExternalField[] externalFields;
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
    public OffsetDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(OffsetDateTime value) { this.createdAt = value; }

    /**
     * The `Date-Time` that this line item became/becomes active
     */
    public OffsetDateTime getEffectiveAt() { return effectiveAt; }
    public void setEffectiveAt(OffsetDateTime value) { this.effectiveAt = value; }

    /**
     * An array of static references to fields in a third party system.
     */
    public ExternalField[] getExternalFields() { return externalFields; }
    public void setExternalFields(ExternalField[] value) { this.externalFields = value; }

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
    INVALID, VALID;

    public String toValue() {
        switch (this) {
            case INVALID: return "INVALID";
            case VALID: return "VALID";
        }
        return null;
    }

    public static LineItemStatus forValue(String value) throws IOException {
        if (value.equals("INVALID")) return INVALID;
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
    CHARGE, LATE_FEE, PAYMENT, PAYMENT_REVERSAL_FEE;

    public String toValue() {
        switch (this) {
            case CHARGE: return "CHARGE";
            case LATE_FEE: return "LATE_FEE";
            case PAYMENT: return "PAYMENT";
            case PAYMENT_REVERSAL_FEE: return "PAYMENT_REVERSAL_FEE";
        }
        return null;
    }

    public static LineItemType forValue(String value) throws IOException {
        if (value.equals("CHARGE")) return CHARGE;
        if (value.equals("LATE_FEE")) return LATE_FEE;
        if (value.equals("PAYMENT")) return PAYMENT;
        if (value.equals("PAYMENT_REVERSAL_FEE")) return PAYMENT_REVERSAL_FEE;
        throw new IOException("Cannot deserialize LineItemType");
    }
}

// LineItemSummary.java

package io.quicktype;

public class LineItemSummary {
    private long balanceCents;
    private long originalAmountCents;
    private long principalCents;
    private long totalInterestAccruedCents;

    /**
     * The current balance of the line item, which accounts for interest accrued per the
     * `product's` interest policy and the `account's` interest rate attribute.
     */
    public long getBalanceCents() { return balanceCents; }
    public void setBalanceCents(long value) { this.balanceCents = value; }

    /**
     * The originating amount of money (in cents) relating to this line item.
     */
    public long getOriginalAmountCents() { return originalAmountCents; }
    public void setOriginalAmountCents(long value) { this.originalAmountCents = value; }

    /**
     * The principal balance of the line item.
     */
    public long getPrincipalCents() { return principalCents; }
    public void setPrincipalCents(long value) { this.principalCents = value; }

    /**
     * The sum (in cents) of all interest charges, if any, applied to this line item
     */
    public long getTotalInterestAccruedCents() { return totalInterestAccruedCents; }
    public void setTotalInterestAccruedCents(long value) { this.totalInterestAccruedCents = value; }
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
