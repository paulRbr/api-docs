export interface CreateAccountInput {
    associated_entities?: AssociatedEntities;
    cycle_type?:          CycleType;
    discounts?:           Discounts;
    /**
     * The `Date-Time` as of which this account is effective on the server.
     */
    effective_at?: string;
    /**
     * Note: The value passed here *must* be unique. This ties to a reference of your account in
     * an external system. For example, you may have a ten digit loan number you use to
     * reference the account.
     */
    external_account_id?: string;
    /**
     * External fields can be used to relate accounts created in Canopy to entities in your or
     * any external system.
     */
    external_fields?: ExternalField[];
    /**
     * Note: The value passed here *must* be unique. A unique external ID that may be used
     * interchangeably with the Canopy-generated product ID. Either external ID or Canopy
     * product ID must be passed at the time of account creation.
     */
    external_product_id?:      string;
    payment_processor_config?: PaymentProcessorConfig;
    post_promo_overview?:      PostPromoOverview;
    /**
     * A unique product ID generated by Canopy.
     */
    product_id?:     string;
    promo_overview?: PromoOverview;
    summary?:        Summary;
    /**
     * Array of existing customer IDs to be added to the account. At least one existing *OR* one
     * new customer must be included in account creation.
     */
    assign_customers?: AssignCustomer[];
}

export interface AssignCustomer {
    /**
     * A unique number for the customer on the account. For instance, a credit card number. If
     * none is provided, a Canopy-generated ID can be used.
     */
    customer_account_external_id?:             string;
    customer_account_issuer_processor_config?: CustomerAccountIssuerProcessorConfig;
    /**
     * The role of the customer for the account.
     */
    customer_account_role?: CustomerAccountRole;
    /**
     * A unique account ID generated by Canopy.
     */
    customer_id: string;
}

export interface CustomerAccountIssuerProcessorConfig {
    lithic?: Lithic;
}

export interface Lithic {
    /**
     * Friendly name to identify the card
     */
    memo?: string;
    /**
     * The state of the new card
     */
    state?: State;
    /**
     * The type of card created by Lithic
     */
    type?: Type;
}

/**
 * The state of the new card
 */
export type State = 
    "OPEN" | 
    "PAUSED";

/**
 * The type of card created by Lithic
 */
export type Type = 
    "MERCHANT_LOCKED" | 
    "SINGLE_USE" | 
    "UNLOCKED";

/**
 * The role of the customer for the account.
 */
export type CustomerAccountRole = 
    "PRIMARY" | 
    "SECONDARY";

export interface AssociatedEntities {
    /**
     * A lender name associated with the account
     */
    lender_name?: string;
    /**
     * A merchant name associated with the account
     */
    merchant_name?: string;
}

export interface CycleType {
    /**
     * Interval for a first cycle for this account.
     */
    first_cycle_interval?: string;
}

export interface Discounts {
    prepayment_discount_config?: PrepaymentDiscountConfig;
}

export interface PrepaymentDiscountConfig {
    /**
     * Interval for a first cycle for this account.
     */
    loan_discount_amount?: string;
    /**
     * Interval for a first cycle for this account.
     */
    loan_discount_at?: string;
}

export interface ExternalField {
    /**
     * key: i.e. Name of the External Party
     */
    key?: string;
    /**
     * value: i.e. External Account ID
     */
    value?: string;
}

export interface PaymentProcessorConfig {
    /**
     * Indicates whether autopay is enabled for this account. Autopay is triggered one day prior
     * to due date. If `payment_processor_name` is `NONE`, autopay will not be triggered for the
     * account regardless of this field.
     */
    autopay_enabled?: boolean;
    /**
     * Indicates the active payment processor used for payments made by the account. If `NONE`,
     * Canopy will not trigger payments to any payment processor when they occur.
     */
    payment_processor_name?: PaymentProcessorName;
    /**
     * All sensitive bank information will be replaced with a secure token when performing
     * transactions.
     */
    repay_config?: RepayConfig;
}

/**
 * Indicates the active payment processor used for payments made by the account. If `NONE`,
 * Canopy will not trigger payments to any payment processor when they occur.
 */
export type PaymentProcessorName = 
    "NONE" | 
    "REPAY";

/**
 * All sensitive bank information will be replaced with a secure token when performing
 * transactions.
 */
export interface RepayConfig {
    /**
     * Account number is an eight to ten digit number that identifies a specific account.
     */
    repay_account_number: number;
    /**
     * Type of account: Savings or Checking.
     */
    repay_account_type: RepayAccountType;
    /**
     * Type of checking account: Personal or Business.
     */
    repay_check_type: RepayCheckType;
    /**
     * Account holder's name as it appears on the account.
     */
    repay_name_on_check: string;
    /**
     * The payment method used by the account
     */
    repay_payment_method: RepayPaymentMethod;
    /**
     * Transit number is a nine-digit code based on the U.S. Bank location where your account
     * was opened.
     */
    repay_transit_number: number;
}

/**
 * Type of account: Savings or Checking.
 */
export type RepayAccountType = 
    "CHECKING" | 
    "SAVINGS";

/**
 * Type of checking account: Personal or Business.
 */
export type RepayCheckType = 
    "BUSINESS" | 
    "PERSONAL";

/**
 * The payment method used by the account
 */
export type RepayPaymentMethod = 
    "ACH";

export interface PostPromoOverview {
    /**
     * The percentage interest applied to the account during the post-promotional period (e.g.
     * 6.2)
     */
    post_promo_impl_interest_rate_percent?: number;
    /**
     * If applicable, post-promotional amortization length in cycles.
     */
    post_promo_len?: number;
}

export interface PromoOverview {
    /**
     * The percentage interest applied to the account during the promotional period (e.g. 6.2)
     */
    promo_impl_interest_rate_percent?: number;
}

export interface Summary {
    /**
     * An annual fee to be charged yearly from the date of account creation. It will reflect on
     * the subsequent statement once incurred.
     */
    annual_fee_cents?: number;
    /**
     * Total amount (in cents) that this account can borrow.
     */
    credit_limit_cents?: number;
    /**
     * The initial principal balance (in cents) for the account.
     */
    initial_principal_cents?: number;
    /**
     * The fee charged for late payments on the account.
     */
    late_fee_cents?: number;
    /**
     * Total amount (in cents) that this account can borrow.
     */
    max_approved_credit_limit_cents?: number;
    /**
     * A monthly fee to be charged monthly from the date of account creation. It will reflect on
     * the subsequent statement once incurred.
     */
    monthly_fee_cents?: number;
    /**
     * The fee charged at the time of account origination
     */
    origination_fee_cents?: number;
    /**
     * The fee charged for payment reversals on the account.
     */
    payment_reversal_fee_cents?: number;
}
