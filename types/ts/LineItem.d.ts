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
  line_item_status?: LineItemStatus;
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
  Offset = "OFFSET",
  Pending = "PENDING",
  Reversed = "REVERSED",
  Rolled = "ROLLED",
  SplitInvalid = "SPLIT_INVALID",
  SplitValid = "SPLIT_VALID",
  Valid = "VALID",
}

/**
 * The Line Item Type. i.e. `CHARGE`, `PAYMENT`.
 */
export enum LineItemType {
  Charge = "CHARGE",
  CreditOffset = "CREDIT_OFFSET",
  DebitOffset = "DEBIT_OFFSET",
  DeferredInterest = "DEFERRED_INTEREST",
  Fee = "FEE",
  Interest = "INTEREST",
  LateFee = "LATE_FEE",
  Loan = "LOAN",
  MinDue = "MIN_DUE",
  Payment = "PAYMENT",
  PaymentSplit = "PAYMENT_SPLIT",
  ProductInterest = "PRODUCT_INTEREST",
  PromoEnd = "PROMO_END",
  PurchaseWindowEnd = "PURCHASE_WINDOW_END",
  ReturnCheckFee = "RETURN_CHECK_FEE",
  Statement = "STATEMENT",
}

export interface LineItemSummary {
  /**
   * The current AM deferred interest balance of the line item. Canopy tracks deferred
   * interest during an amortization period separately from deferred interest accrued during a
   * revolving period.
   */
  am_deferred_interest_balance_cents?: number;
  /**
   * The current balance of the line item, which accounts for interest accrued per the
   * `product's` interest policy and the `account's` interest rate attribute.
   */
  balance_cents: number;
  /**
   * he current deferred interest balance of the line item.
   */
  deferred_interest_balance_cents: number;
  /**
   * The current interest balance of the line item.
   */
  interest_balance_cents: number;
  /**
   * The originating amount of money (in cents) relating to this line item.
   */
  original_amount_cents: number;
  /**
   * The principal balance of the line item.
   */
  principal_cents: number;
  /**
   * The sum (in cents) of all payments towards interest charges, if any, applied to this line
   * item to date
   */
  total_interest_paid_to_date_cents: number;
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
