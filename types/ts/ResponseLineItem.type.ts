export interface ResponseLineItem {
    /**
     * A Canopy-generated ID for the account.
     */
    account_id: string;
    /**
     * The `Date-Time` which the line item was created.
     */
    created_at: string;
    /**
     * The `Date-Time` that this line item became/becomes active
     */
    effective_at: string;
    /**
     * An array of static references to fields in a third party system.
     */
    external_fields?:           ExternalField[];
    issuer_processor_metadata?: IssuerProcessorMetadata;
    /**
     * A Canopy-generated ID for the line item.
     */
    line_item_id:        string;
    line_item_overview?: LineItemOverview;
    line_item_summary?:  LineItemSummary;
    /**
     * Merchant information if applicable.
     */
    merchant_data?: MerchantData;
    /**
     * A Canopy-generated ID for the product.
     */
    product_id: string;
}

export interface ExternalField {
    /**
     * Key - i.e. Name of the External Party
     */
    key?: string;
    /**
     * Value - i.e. External Account ID
     */
    value?: string;
}

export interface IssuerProcessorMetadata {
    lithic?: Lithic;
}

export interface Lithic {
    /**
     * Last four digits of the card against which the spend was made.
     */
    last_four?: number;
}

export interface LineItemOverview {
    /**
     * A description of this particular line item if any. More common for adjustments.
     */
    description?: string;
    /**
     * the corresponding Status for a line item
     */
    line_item_status: LineItemStatus;
    /**
     * The Line Item Type. i.e. `CHARGE`, `PAYMENT`.
     */
    line_item_type: LineItemType;
}

/**
 * the corresponding Status for a line item
 */
export type LineItemStatus = 
    "AUTHORIZED" | 
    "DECLINED" | 
    "INVALID" | 
    "OFFSET" | 
    "PENDING" | 
    "POSTED" | 
    "REVERSED" | 
    "ROLLED" | 
    "SPLIT_INVALID" | 
    "SPLIT_VALID" | 
    "VALID" | 
    "VOID";

/**
 * The Line Item Type. i.e. `CHARGE`, `PAYMENT`.
 */
export type LineItemType = 
    "CHARGE" | 
    "CREDIT_OFFSET" | 
    "DEBIT_OFFSET" | 
    "DEFERRED_INTEREST" | 
    "FEE" | 
    "FEE_SURCHARGE" | 
    "INTEREST" | 
    "LATE_FEE" | 
    "LOAN" | 
    "MIN_DUE" | 
    "MONTH_FEE" | 
    "ORIG_FEE" | 
    "PAYMENT" | 
    "PAYMENT_REVERSAL" | 
    "PAYMENT_SPLIT" | 
    "PRODUCT_INTEREST" | 
    "PROMO_END" | 
    "PURCHASE_WINDOW_END" | 
    "RETURN_CHECK_FEE" | 
    "STATEMENT" | 
    "YEAR_FEE";

export interface LineItemSummary {
    /**
     * The originating amount of money (in cents) relating to this line item.
     */
    original_amount_cents: number;
}

/**
 * Merchant information if applicable.
 */
export interface MerchantData {
    id?:           string;
    mcc_code?:     number;
    name?:         string;
    phone_number?: string;
}
