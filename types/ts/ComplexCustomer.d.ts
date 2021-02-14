export interface ComplexCustomer {
  /**
   * Address city
   */
  address_city?: string;
  /**
   * Address line one
   */
  address_line_one?: string;
  /**
   * Address line two
   */
  address_line_two?: string;
  /**
   * Address state
   */
  address_state?: string;
  /**
   * Address zip code
   */
  address_zip?: string;
  /**
   * A Canopy-generated unique ID for the customer
   */
  customer_id: number;
  /**
   * Customer's date of birth
   */
  date_of_birth?: Date;
  /**
   * The email address of this Customer
   */
  email?: string;
  /**
   * Customer's first name
   */
  name_first?: string;
  /**
   * Customer's last name
   */
  name_last?: string;
  /**
   * Customer's middle name
   */
  name_middle?: string;
  /**
   * Prefix to the customer's name
   */
  name_prefix?: string;
  /**
   * Prefix to the customer's name
   */
  name_suffix?: string;
  /**
   * Phone number of the customer
   */
  phone_number?: string;
  /**
   * Social security number of the customer
   */
  ssn?: string;
  /**
   * An array of Accounts this Customer is assigned to.
   */
  accounts?: Account[];
}

export interface Account {
  /**
   * This is generated by Canopy. A unique ID for the account.
   */
  account_id: number;
  account_overview?: AccountOverview;
  /**
   * The product associated with the account
   */
  account_product?: AccountProduct;
  additional_statement_min_pay_details?: AdditionalStatementMinPayDetails;
  associated_entities?: AssociatedEntities;
  /**
   * The `Date-Time` which the account was created in the API.
   */
  created_at: Date;
  /**
   * The `Date-Time` that this account became/becomes active.
   */
  effective_at: Date;
  /**
   * An Array of External Fields. These should be used to connect accounts created in Canopy
   * to Users in your system and any connected external systems.
   */
  external_fields?: ExternalField[];
  min_pay_due_cents?: MinPayDueCents;
  summary?: Summary;
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
 * The product associated with the account
 */
export interface AccountProduct {
  /**
   * A unique external ID that may be used interchangeably with the Canopy-generated product ID
   */
  external_product_id?: string;
  post_promo_overview?: PostPromoOverview;
  product_duration_information?: ProductDurationInformation;
  /**
   * The Canopy-generated ID for the product.
   */
  product_id: number;
  product_lifecycle?: ProductLifecycle;
  product_overview?: ProductOverview;
  promo_overview?: PromoOverview;
}

export interface PostPromoOverview {
  /**
   * If applicable, the start date for a promotional period for the account.
   */
  post_promo_exclusive_end?: Date;
  /**
   * If applicable, post-promotional amortization length in cycles.
   */
  post_promo_impl_am_len?: number;
  /**
   * The percentage interest applied to the account during the post-promotional period (i.e.
   * 6.2%)
   */
  post_promo_impl_interest_rate_percent?: number;
  /**
   * If applicable, the start date for a promotional period for the account.
   */
  post_promo_inclusive_start?: Date;
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
   * The fee charged for late payments on the account.
   */
  late_fee_impl_cents: number;
  /**
   * If applicable, the account's loan repayment date.
   */
  loan_end_date?: Date;
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
  product_type: ProductType;
}

/**
 * The Type of Product. If not included, defaults to `REVOLVING`
 */
export enum ProductType {
  DeferredInstallment = "DEFERRED_INSTALLMENT",
  FixedRateInstallment = "FIXED_RATE_INSTALLMENT",
  Installment = "INSTALLMENT",
  MixedRateInstallment = "MIXED_RATE_INSTALLMENT",
  Revolving = "REVOLVING",
}

export interface PromoOverview {
  /**
   * If applicable, the start date for a promotional period for the account.
   */
  promo_exclusive_end?: Date;
  /**
   * The percentage interest applied to the account during the promotional period (i.e. 6.2%)
   */
  promo_impl_interest_rate_percent?: number;
  /**
   * If applicable, the start date for a promotional period for the account.
   */
  promo_inclusive_start?: Date;
  /**
   * If applicable, the end date for a purchase window for the account
   */
  promo_purchase_window_exclusive_end?: Date;
  /**
   * If applicable, the start date for a purchase window for the account
   */
  promo_purchase_window_inclusive_start?: Date;
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

export interface MinPayDueCents {
  /**
   * The `Date-Time` the payment for this billing cycle is due.
   */
  min_pay_due_at?: Date;
  /**
   * Total amount due for the billing cycle, summing cycle principal, interest, deferred
   * interest, and fees outstanding.
   */
  statement_min_pay_cents: number;
}

export interface Summary {
  /**
   * The total deferred interest balance (in cents) associated with the account.
   */
  am_deferred_interest_balance_cents?: number;
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
  interest_balance_cents: number;
  /**
   * The percentage interest applied to the account (i.e. 6.2 means 6.2%)
   */
  interest_rate_percent: number;
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
  principal_cents: number;
  /**
   * The total balance (in cents) associated with the account.
   */
  total_balance_cents: number;
  /**
   * The total sum of interest allocations for payments made to date (in cents) associated
   * with the account.
   */
  total_interest_paid_to_date_cents: number;
  /**
   * The total sum of payments made to date (in cents) associated with the account.
   */
  total_paid_to_date_cents: number;
  /**
   * The total amount needed to pay off the loan at this exact moment.
   */
  total_payoff_cents?: number;
}
