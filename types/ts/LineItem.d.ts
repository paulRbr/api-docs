export interface LineItem {
  /**
   * The account associated with the line item
   */
  account_id: number;
  /**
   * The `Date-Time` which the line item was created.
   */
  created_at: Date;
  /**
   * The `Date-Time` that this line item became/becomes active
   */
  effective_at: Date;
  /**
   * An array of static references to fields in a third party system.
   */
  external_fields?: ExternalField[];
  /**
   * The ID associated with the line item
   */
  line_item_id: number;
  line_item_overview?: LineItemOverview;
  line_item_summary?: LineItemSummary;
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
export enum LineItemStatus {
  Invalid = "INVALID",
  Valid = "VALID",
}

/**
 * The Line Item Type. i.e. `CHARGE`, `PAYMENT`.
 */
export enum LineItemType {
  Charge = "CHARGE",
  LateFee = "LATE_FEE",
  Payment = "PAYMENT",
  PaymentReversalFee = "PAYMENT_REVERSAL_FEE",
}

export interface LineItemSummary {
  /**
   * The current balance of the line item, which accounts for interest accrued per the
   * `product's` interest policy and the `account's` interest rate attribute.
   */
  balance_cents: number;
  /**
   * The originating amount of money (in cents) relating to this line item.
   */
  original_amount_cents: number;
  /**
   * The principal balance of the line item.
   */
  principal_cents: number;
  /**
   * The sum (in cents) of all interest charges, if any, applied to this line item
   */
  total_interest_accrued_cents: number;
}

/**
 * Merchant information if applicable.
 */
export interface MerchantData {
  id?: string;
  mcc_code?: number;
  name?: string;
  phone_number?: string;
}
