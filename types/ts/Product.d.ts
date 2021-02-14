export interface Product {
  /**
   * The `Date-Time` that this product was created on the server.
   */
  created_at: Date;
  /**
   * The `Date-Time` as of which this product is effective on the server.
   */
  effective_at?: Date;
  /**
   * A unique external ID that may be used interchangeably with the Canopy-generated product ID
   */
  external_product_id?: string;
  post_promotional_policies: PostPromotionalPolicies;
  /**
   * The Canopy-generated ID for the product.
   */
  product_id: number;
  product_lifecycle_policies: ProductLifecyclePolicies;
  /**
   * A series of static fields about the product.
   */
  product_overview: ProductOverview;
  /**
   * Summary of product information
   */
  product_summary?: ProductSummary;
  /**
   * If applicable, a promotional configuration for the product.
   */
  promotional_policies: PromotionalPolicies;
}

export interface PostPromotionalPolicies {
  /**
   * Optional lower bound for amortization length in billing cycles for the product.
   */
  post_promo_am_len_range_inclusive_lower?: number;
  /**
   * Optional upper bound for amortization length in billing cycles for the product.
   */
  post_promo_am_len_range_inclusive_upper?: number;
  /**
   * Optional lower bound for APR Range for the product (i.e. 2 = 2%).
   */
  post_promo_apr_range_inclusive_lower?: number;
  /**
   * Optional upper bound for APR Range for the product (i.e. 5 = 5%).
   */
  post_promo_apr_range_inclusive_upper?: number;
  /**
   * Default duration for the amortization period during post-promotion
   */
  post_promo_default_am_len?: number;
  /**
   * The rate that serves as the active interest rate for accounts during the post-promotional
   * period.
   */
  post_promo_default_interest_rate_percent?: number;
  /**
   * Current due calculation method for the post-promotional period.
   */
  post_promo_min_pay_type?: PromoMinPayType;
}

/**
 * Current due calculation method for the post-promotional period.
 *
 * Current due calculation method for the promotional period.
 */
export enum PromoMinPayType {
  Am = "AM",
  None = "NONE",
  PercentInterest = "PERCENT_INTEREST",
  PercentPrincipal = "PERCENT_PRINCIPAL",
}

export interface ProductLifecyclePolicies {
  /**
   * The set of policies governing the billing cycle for the product.
   */
  billing_cycle_policies?: BillingCyclePolicies;
  default_attributes?: DefaultAttributes;
  /**
   * The set of policies governing fees for the product.
   */
  fee_policies?: FeePolicies;
  /**
   * The Interest Policy Object
   */
  interest_policies?: InterestPolicies;
  /**
   * The set of policies governing payment due information for the product.
   */
  payment_due_policies?: PaymentDuePolicies;
}

/**
 * The set of policies governing the billing cycle for the product.
 */
export interface BillingCyclePolicies {
  /**
   * Defaults to EST Midnight. Time of the close of business. Note* this value will be
   * converted into the `product_time_zone` This is used for statement cuts and partner-level
   * and issuing bank-level reconciliation
   */
  close_of_business_time?: string;
  /**
   * Defaults to 0 days. The amount of time before statement cut that the payment should be
   * due for the billing cycle. If positive, it will count days from the start of the cycle.
   * Note, this field has a signage convention: if negative, it will count days back from the
   * end of the cycle. IE '25 days' indicates that payments are due 25 days after the
   * statement is cut. `-5` days indicates that payments will be due five days prior to the
   * cut of the *next* cycle. Cannot exceed the duration of the billing cycle.
   */
  cycle_due_interval?: string;
  /**
   * The length of the billing cycle. after which a statement is generated, and a due date
   * assigned. IE '1 month' '3 months' or '7 days' (most common is monthly)
   */
  cycle_interval: string;
  /**
   * Defaults to 0 days. If applicable, the amount of time you would like between origination
   * and the first statement cut. IE '10 days'. If you would like the first billing cycle to
   * be the same length as all other billing cycles, either do not include this field in the
   * request, or set its value to the same as `billing_cycle_period`
   */
  first_cycle_interval?: string;
  /**
   * Timezone denoted as an Olson-style timezone defining the timezone for the product. All
   * times in any response data for accounts using this product will be denominated in this
   * timezone. Shifts due to daylight savings will be accounted for where relevant, and all
   * output timestamps will be denoted as UTC offsets normalized based on this value.
   */
  product_time_zone?: string;
}

export interface DefaultAttributes {
  /**
   * The default maximum principal credit (in cents) available for a customer account. This
   * default limit can be overridden on a per-account basis if a `credit_limit` is selected at
   * the time of assigning an account to a product. Credit limits for an account can also be
   * updated post-account creation.
   */
  default_credit_limit_cents: number;
  /**
   * The default maximum principal credit (in cents) available for a customer account. This
   * default limit can be overridden on a per-account basis if a `credit_limit` is selected at
   * the time of assigning an account to a product. Credit limits for an account can also be
   * updated post-account creation.
   */
  default_late_fee_cents?: number;
  /**
   * The default maximum principal credit (in cents) available for a customer account. This
   * default limit can be overridden on a per-account basis if a `credit_limit` is selected at
   * the time of assigning an account to a product. Credit limits for an account can also be
   * updated post-account creation.
   */
  default_payment_reversal_fee_cents?: number;
}

/**
 * The set of policies governing fees for the product.
 */
export interface FeePolicies {
  /**
   * Defaults to 0 days. The amount of time after a payment is late after which you would like
   * for a late fee to be incurred.
   */
  late_fee_grace?: string;
}

/**
 * The Interest Policy Object
 */
export interface InterestPolicies {
  /**
   * Defaults to EST 1AM. Interest for this policy is calculated at this time every X interval.
   */
  interest_calc_time?: string;
}

/**
 * The set of policies governing payment due information for the product.
 */
export interface PaymentDuePolicies {
  /**
   * After this number of consecutive late events, the account status shifts to `suspended`
   * with a status subtype of `charged_off`
   */
  charge_off_on_n_consecutive_late_fees?: number;
  /**
   * After this number of consecutive late events, the account status shifts to `suspended`
   * with a status subtype of `delinquent`
   */
  delinquent_on_n_consecutive_late_fees?: number;
}

/**
 * A series of static fields about the product.
 */
export interface ProductOverview {
  external_fields?: ExternalField[];
  /**
   * A color to be associated with the product for UI purposes.
   */
  product_color?: string;
  /**
   * Description of the Product ranging from 0 - 1000.
   */
  product_long_description: string;
  /**
   * Name of Product, i.e. Express Card.
   */
  product_name: string;
  /**
   * A short description of the product ranging from 0 - 60 characters.
   */
  product_short_description?: string;
  /**
   * The Type of Product
   */
  product_type: ProductType;
}

export interface ExternalField {
  key?: string;
  value?: string;
}

/**
 * The Type of Product
 */
export enum ProductType {
  DeferredInstallment = "DEFERRED_INSTALLMENT",
  FixedRateInstallment = "FIXED_RATE_INSTALLMENT",
  Installment = "INSTALLMENT",
  MixedRateInstallment = "MIXED_RATE_INSTALLMENT",
  Revolving = "REVOLVING",
}

/**
 * Summary of product information
 */
export interface ProductSummary {
  accounts_overview?: AccountsOverview;
}

export interface AccountsOverview {
  /**
   * Total number of accounts under the product.
   */
  account_count_total: number;
}

/**
 * If applicable, a promotional configuration for the product.
 */
export interface PromotionalPolicies {
  /**
   * Optional lower bound for APR Range for the product (i.e. 2 = 2%).
   */
  promo_apr_range_inclusive_lower?: number;
  /**
   * Optional upper bound for APR Range for the product (i.e. 5 = 5%).
   */
  promo_apr_range_inclusive_upper?: number;
  /**
   * The rate that serves as the active interest rate for accounts during the promotional
   * period.
   */
  promo_default_interest_rate_percent?: number;
  /**
   * Indicates whether interest accrued during the promotional period is deferred interest.
   */
  promo_interest_deferred?: boolean;
  /**
   * The number of billing cycles from account origination during which accounts on this
   * product are on a promotional period.
   */
  promo_len?: number;
  /**
   * Defaults to 100. The percent of new interest in the cycle used to determine the minimum
   * payment.
   */
  promo_min_pay_percent?: number;
  /**
   * Current due calculation method for the promotional period.
   */
  promo_min_pay_type?: PromoMinPayType;
  /**
   * If applicable, the number of billing cycles from account origination under which this
   * product falls under a purchas window period.
   */
  promo_purchase_window_len?: number;
}
