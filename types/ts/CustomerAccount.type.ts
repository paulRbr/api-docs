export interface CustomerAccount {
    /**
     * Address city.
     */
    address_city?: string;
    /**
     * Address line one.
     */
    address_line_one?: string;
    /**
     * Address line two.
     */
    address_line_two?: string;
    /**
     * Address state.
     */
    address_state?: string;
    /**
     * Five digit zipcode or nine digit 'ZIP+4'
     */
    address_zip?:      string;
    business_details?: BusinessDetails;
    /**
     * A Canopy-generated ID for the customer.
     */
    customer_id: string;
    /**
     * Customer's date of birth in ISO 8601 format
     */
    date_of_birth?: string;
    /**
     * The email address of this Customer
     */
    email?: string;
    /**
     * Customer's first name. Primary account holder or controlling officer name for Business
     * customers.
     */
    name_first?: string;
    /**
     * Customer's last name. Primary account holder or controlling officer name for Business
     * customers.
     */
    name_last?: string;
    /**
     * Customer's middle name. Primary account holder or controlling officer name for Business
     * customers.
     */
    name_middle?: string;
    /**
     * Prefix to the customer's name. Primary account holder or controlling officer name for
     * Business customers.
     */
    name_prefix?: string;
    /**
     * Suffix to the customer's name
     */
    name_suffix?: string;
    /**
     * Customer's phone number in E.164 format
     */
    phone_number?: string;
    /**
     * Social security number of the customer
     */
    ssn?: string;
    /**
     * A unique number for the customer on the account. For instance, a credit card number. If
     * none is provided, a Canopy-generated ID can be used.
     */
    customer_account_external_id?:             string;
    customer_account_issuer_processor_config?: CustomerAccountIssuerProcessorConfig;
    /**
     * The role of the customer for the account.
     */
    customer_account_role?: string;
    account?:               Account;
}

export interface Account {
    /**
     * This is generated by Canopy. A unique ID for the account.
     */
    account_id:        string;
    account_overview?: AccountOverview;
    /**
     * The product associated with the account.
     */
    account_product?:                      AccountProduct;
    additional_statement_min_pay_details?: AdditionalStatementMinPayDetails;
    associated_entities?:                  AssociatedEntities;
    /**
     * The `Date-Time` which the account was created in the API.
     */
    created_at?: string;
    cycle_type?: CycleType;
    discounts?:  Discounts;
    /**
     * The `Date-Time` that this account became/becomes active.
     */
    effective_at?: string;
    /**
     * Note: The value passed here *must* be unique. This ties to a reference of your account in
     * an external system. For example, you may have a ten digit loan number you use to
     * reference the account.
     */
    external_account_id?: string;
    /**
     * An Array of External Fields. These should be used to connect accounts created in Canopy
     * to Users in your system and any connected external systems.
     */
    external_fields?:          ExternalField[];
    issuer_processor_details?: IssuerProcessorDetails;
    min_pay_due_cents?:        MinPayDueCents;
    payment_processor_config?: PaymentProcessorConfig;
    summary?:                  Summary;
}

export interface AccountOverview {
    /**
     * The Status of the Account. Active upon account creation.
     */
    account_status: string;
    /**
     * The subtype of the Status of the Account. Null upon account creation.
     */
    account_status_subtype?: string;
}

/**
 * The product associated with the account.
 */
export interface AccountProduct {
    /**
     * A unique external ID that may be used interchangeably with the Canopy-generated product ID
     */
    external_product_id?:          string;
    post_promo_overview?:          PostPromoOverview;
    product_duration_information?: ProductDurationInformation;
    /**
     * The Canopy-generated ID for the product.
     */
    product_id:         number;
    product_lifecycle?: ProductLifecycle;
    product_overview?:  ProductOverview;
    promo_overview?:    PromoOverview;
}

export interface PostPromoOverview {
    /**
     * If applicable, the start date for a promotional period for the account.
     */
    post_promo_exclusive_end?: string;
    /**
     * The percentage interest applied to the account during the post-promotional period (i.e.
     * 6.2%)
     */
    post_promo_impl_interest_rate_percent?: number;
    /**
     * If applicable, the start date for a promotional period for the account.
     */
    post_promo_inclusive_start?: string;
    /**
     * If applicable, post-promotional amortization length in cycles.
     */
    post_promo_len?: number;
}

export interface ProductDurationInformation {
    /**
     * The number of billing cycles from account origination during which accounts on this
     * product are on a promotional period.
     */
    promo_len?: number;
    /**
     * If applicable, the number of billing cycles from account origination under which this
     * product falls under a purchas window period.
     */
    promo_purchase_window_len?: number;
}

export interface ProductLifecycle {
    /**
     * An annual fee to be charged yearly from the date of account creation. It will reflect on
     * the subsequent statement once incurred.
     */
    annual_fee_impl_cents?: number;
    /**
     * The fee charged for late payments on the account.
     */
    late_fee_impl_cents: number;
    /**
     * If applicable, the account's loan repayment date.
     */
    loan_end_date?: string;
    /**
     * A monthly fee to be charged monthly from the date of account creation. It will reflect on
     * the subsequent statement once incurred.
     */
    monthly_fee_impl_cents?: number;
    /**
     * The fee charged at the time of account origination
     */
    origination_fee_impl_cents?: number;
    /**
     * The fee charged for payment reversals on the account.
     */
    payment_reversal_fee_impl_cents: number;
}

export interface ProductOverview {
    /**
     * A color to be associated with the product for UI purposes.
     */
    product_color?: string;
    /**
     * Description of the Product.
     */
    product_long_description: string;
    /**
     * Name of Product, i.e. Express Card.
     */
    product_name: string;
    /**
     * Short description of the Product - max of 30 characters.
     */
    product_short_description?: string;
    /**
     * Timezone denoted as an [Olson-style
     * timezone](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones) defining the
     * timezone for the product. All times in any response data for accounts using this product
     * will be denominated in this timezone. Shifts due to daylight savings will be accounted
     * for where relevant, and all output timestamps will be denoted as UTC offsets normalized
     * based on this value.
     */
    product_time_zone?: string;
    /**
     * The Type of Product. If not included, defaults to `REVOLVING`
     */
    product_type: string;
}

export interface PromoOverview {
    /**
     * If applicable, the start date for a promotional period for the account.
     */
    promo_exclusive_end?: string;
    /**
     * The percentage interest applied to the account during the promotional period (i.e. 6.2%)
     */
    promo_impl_interest_rate_percent?: number;
    /**
     * If applicable, the start date for a promotional period for the account.
     */
    promo_inclusive_start?: string;
    /**
     * Defaults to 0. The number of billing cycles from account origination during which
     * accounts on this product are on a promotional period.
     */
    promo_len?: number;
    /**
     * If applicable, the end date for a purchase window for the account
     */
    promo_purchase_window_exclusive_end?: string;
    /**
     * If applicable, the start date for a purchase window for the account
     */
    promo_purchase_window_inclusive_start?: string;
}

export interface AdditionalStatementMinPayDetails {
    /**
     * Previous amounts due, including fees. This is a subset of statement_min_pay_cents.
     */
    previous_statement_min_pay_cents: number;
    /**
     * The current AM deferred interest balance of the line item. Canopy tracks deferred
     * interest during an amortization period separately from deferred interest accrued during a
     * revolving period.
     */
    statement_min_pay_am_deferred_interest_cents: number;
    /**
     * The current AM interest balance of the line item. Canopy tracks interest during an
     * amortization period separately from deferred interest accrued during a revolving period.
     */
    statement_min_pay_am_interest_cents: number;
    /**
     * Total principal due for the billing cycle.
     */
    statement_min_pay_charges_principal_cents: number;
    /**
     * Total deferred interest due for the billing cycle.
     */
    statement_min_pay_deferred_cents: number;
    /**
     * Total fees due for the billing cycle.
     */
    statement_min_pay_fees_cents: number;
    /**
     * Total interest due for the billing cycle.
     */
    statement_min_pay_interest_cents: number;
}

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
     * The `Date-Time` that this discount is valid.
     */
    loan_discount_at?: string;
    /**
     * Loan discount amount in cents.
     */
    loan_discount_cents?: number;
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

export interface IssuerProcessorDetails {
    lithic?: IssuerProcessorDetailsLithic;
}

export interface IssuerProcessorDetailsLithic {
    /**
     * The external unique identifier of the Lithic account against which charges are made.
     */
    account_token?: string;
}

export interface MinPayDueCents {
    /**
     * The `Date-Time` the payment for this billing cycle is due.
     */
    min_pay_due_at?: string;
    /**
     * Total amount due for the billing cycle, summing cycle principal, interest, deferred
     * interest, and fees outstanding.
     */
    statement_min_pay_cents: number;
}

export interface PaymentProcessorConfig {
    /**
     * ACH processing configuration.
     */
    ach?: Ach;
    /**
     * Indicates whether autopay is enabled for this account. Currently, autopay is triggered 1
     * day prior to a payment due date. If `default_payment_processor` is set to `NONE`, autopay
     * will not be triggered for account regardless of this field's value.
     */
    autopay_enabled?: boolean;
    /**
     * Debit processing configuration.
     */
    debit_card?: DebitCard;
    /**
     * Configures the payment processor to be used for manual or autopay payments. This cannot
     * be set to a value different from `NONE` if no valid ACH or Debit Card configs are
     * provided.
     */
    default_payment_processor_method?: DefaultPaymentProcessorMethod;
}

/**
 * ACH processing configuration.
 */
export interface Ach {
    dwolla_config?:          DwollaConfig;
    modern_treasury_config?: ModernTreasuryConfig;
    /**
     * Indicates the active payment processor whose configuration will be used for ACH/Debit
     * card payments made from the account.
     */
    payment_processor_name: AchPaymentProcessorName;
    repay_config?:          AchRepayConfig;
}

export interface DwollaConfig {
    /**
     * Indicates whether Canopy has a valid configuration stored for this ACH payment processor
     * for this account. For example, if Canopy needs an ACH token on behalf of the account to
     * call the processor, this field will indicate that Canopy has successfully stored the
     * necessary token.
     */
    valid_config: boolean;
}

export interface ModernTreasuryConfig {
    /**
     * Indicates whether Canopy has a valid configuration stored for this ACH payment processor
     * for this account. For example, if Canopy needs an ACH token on behalf of the account to
     * call the processor, this field will indicate that Canopy has successfully stored the
     * necessary token.
     */
    valid_config: boolean;
}

/**
 * Indicates the active payment processor whose configuration will be used for ACH/Debit
 * card payments made from the account.
 */
export type AchPaymentProcessorName = 
    "DWOLLA" | 
    "MODERN_TREASURY" | 
    "NONE" | 
    "REPAY";

export interface AchRepayConfig {
    /**
     * Indicates whether Canopy has a valid configuration stored for this ACH payment processor
     * for this account. For example, if Canopy needs an ACH token on behalf of the account to
     * call the processor, this field will indicate that Canopy has successfully stored the
     * necessary token.
     */
    valid_config: boolean;
}

/**
 * Debit processing configuration.
 */
export interface DebitCard {
    /**
     * Indicates the active payment processor whose configuration will be used for Debit card
     * payments made from the account.
     */
    payment_processor_name: DebitCardPaymentProcessorName;
    repay_config?:          DebitCardRepayConfig;
}

/**
 * Indicates the active payment processor whose configuration will be used for Debit card
 * payments made from the account.
 */
export type DebitCardPaymentProcessorName = 
    "NONE" | 
    "REPAY";

export interface DebitCardRepayConfig {
    /**
     * Indicates whether Canopy has a valid configuration stored for this Debit card payment
     * processor for this account. For example, if Canopy needs a Debit card token on behalf of
     * the account to call the processor, this field will indicate that Canopy has successfully
     * stored the necessary token.
     */
    valid_config: boolean;
}

/**
 * Configures the payment processor to be used for manual or autopay payments. This cannot
 * be set to a value different from `NONE` if no valid ACH or Debit Card configs are
 * provided.
 */
export type DefaultPaymentProcessorMethod = 
    "ACH" | 
    "DEBIT_CARD" | 
    "NONE";

export interface Summary {
    /**
     * The total AM deferred interest balance (in cents) associated with the account.
     */
    am_deferred_interest_balance_cents?: number;
    /**
     * The total AM interest balance (in cents) associated with the account.
     */
    am_interest_balance_cents?: number;
    /**
     * The total available credit balance (in cents) for the account.
     */
    available_credit_cents?: number;
    /**
     * Total Amount (in cents) that this account can borrow.
     */
    credit_limit_cents: number;
    /**
     * The total deferred interest balance (in cents) associated with the account.
     */
    deferred_interest_balance_cents?: number;
    /**
     * The total interest balance (in cents) associated with the account.
     */
    interest_balance_cents?: number;
    /**
     * The percentage interest applied to the account (i.e. 6.2 means 6.2%)
     */
    interest_rate_percent?: number;
    /**
     * Total Amount (in cents) that this account can borrow.
     */
    max_approved_credit_limit_cents?: number;
    /**
     * If applicable, the total amount of available funds for continued purchase following a
     * purchase window pattern, where payments made do not replenish amount available for
     * purchase.
     */
    open_to_buy_cents?: number;
    /**
     * The total balance (in cents) associated with the account.
     */
    principal_cents?: number;
    /**
     * The total balance (in cents) associated with the account.
     */
    total_balance_cents?: number;
    /**
     * The total sum of interest allocations for payments made to date (in cents) associated
     * with the account.
     */
    total_interest_paid_to_date_cents?: number;
    /**
     * The total sum of payments made to date (in cents) associated with the account.
     */
    total_paid_to_date_cents?: number;
    /**
     * The total amount needed to pay off the loan at this exact moment.
     */
    total_payoff_cents?: number;
}

export interface BusinessDetails {
    /**
     * EIN of the business
     */
    business_ein?: string;
    /**
     * The legal name of the Business
     */
    business_legal_name?: string;
    /**
     * The DBA name of the Business
     */
    doing_business_as?: string;
}

export interface CustomerAccountIssuerProcessorConfig {
    lithic?: CustomerAccountIssuerProcessorConfigLithic;
}

export interface CustomerAccountIssuerProcessorConfigLithic {
    lithic_card?: LithicCard;
}

export interface LithicCard {
    /**
     * Last four digits of the card number
     */
    last_four?: string;
    /**
     * Friendly name to identify the card
     */
    memo?: string;
    /**
     * The type of card created by Lithic
     */
    type?: Type;
}

/**
 * The type of card created by Lithic
 */
export type Type = 
    "MERCHANT_LOCKED" | 
    "SINGLE_USE" | 
    "UNLOCKED";
