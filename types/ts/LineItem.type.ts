export interface LineItem {
    /**
     * The account associated with the line item
     */
    account_id: string;
    /**
     * The `Date-Time` which the line item was created.
     */
    created_at?: string;
    /**
     * The `Date-Time` that this line item became/becomes active
     */
    effective_at?: string;
    /**
     * An array of static references to fields in a third party system.
     */
    external_fields?:          ExternalField[];
    issuer_processor_details?: IssuerProcessorDetails;
    /**
     * The ID associated with the line item
     */
    line_item_id:        string;
    line_item_overview?: LineItemOverview;
    line_item_summary?:  LineItemSummary;
    /**
     * Merchant information if applicable.
     */
    merchant_data?: MerchantData;
    /**
     * the Product ID of the account
     */
    product_id: number;
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

export interface IssuerProcessorDetails {
    lithic?: Lithic;
}

export interface Lithic {
    /**
     * The external unique identifier of the card related to this line item.
     */
    card_token?: string;
    /**
     * Last four digits of the card against which the spend was made.
     */
    last_four?: string;
    /**
     * The external unique identifier of the transaction.
     */
    transaction_token?: string;
}

export interface LineItemOverview {
    /**
     * A description of this particular line item if any. More common for adjustments.
     */
    description?: string;
    /**
     * the corresponding Status for a line item
     */
    line_item_status?: string;
    /**
     * The Line Item Type. i.e. `CHARGE`, `PAYMENT`.
     */
    line_item_type: string;
}

export interface LineItemSummary {
    /**
     * The current AM deferred interest balance of the line item. Canopy tracks deferred
     * interest during an amortization period separately from deferred interest accrued during a
     * revolving period.
     */
    am_deferred_interest_balance_cents?: number;
    /**
     * The current AM interest balance of the line item. Canopy tracks interest during an
     * amortization period separately from deferred interest accrued during a revolving period.
     */
    am_interest_balance_cents?: number;
    /**
     * The current balance of the line item, which accounts for interest accrued per the
     * `product's` interest policy and the `account's` interest rate attribute.
     */
    balance_cents?: number;
    /**
     * The current deferred interest balance of the line item.
     */
    deferred_interest_balance_cents?: number;
    /**
     * The current interest balance of the line item.
     */
    interest_balance_cents?: number;
    /**
     * The originating amount of money (in cents) relating to this line item.
     */
    original_amount_cents?: number;
    /**
     * The principal balance of the line item.
     */
    principal_cents?: number;
    /**
     * The sum (in cents) of all payments towards interest charges, if any, applied to this line
     * item to date
     */
    total_interest_paid_to_date_cents?: number;
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
