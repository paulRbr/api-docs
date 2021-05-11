/**
 * A base group of policies that define a Product
 */
export interface BasePolicyConfig {
    /**
     * The set of policies governing the billing cycle for the product.
     */
    billing_cycle_policies: BillingCyclePolicies;
    /**
     * The set of policies governing fees for the product.
     */
    fee_policies: FeePolicies;
    /**
     * The Interest Policy Object
     */
    interest_policies: InterestPolicies;
    /**
     * The set of policies governing payment due information for the product.
     */
    payment_due_policies: PaymentDuePolicies;
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
     * output timestamps will be denoted as UTC offsets normalized based on this value. Defaults
     * to America/New_York if not provided.
     */
    product_time_zone?: string;
}

/**
 * The set of policies governing fees for the product.
 */
export interface FeePolicies {
    /**
     * The transaction volume structure that dictates a transaction fee.
     */
    default_surcharge_fee_structure?: DefaultSurchargeFeeStructure[];
    /**
     * Defaults to 0 days. The amount of time after a payment is late after which you would like
     * for a late fee to be incurred.
     */
    late_fee_grace?: string;
    /**
     * The interval at which a surcharge fee is assessed.
     */
    surcharge_fee_interval?: string;
}

export interface DefaultSurchargeFeeStructure {
    /**
     * Indicates the surcharge fee as a percent of total transaction volume that will be applied
     * to the account if the total transaction volume during the surcharge interval falls within
     * the provided start and end range.
     */
    percent_surcharge: number;
    /**
     * Indicates the ending transaction volume at which this fee will apply. If not provided,
     * the surcharge will apply to any transaction volume above the defined start.
     */
    surcharge_end_exclusive_cents?: number;
    /**
     * Indicates the starting transaction volume at which this fee will apply.
     */
    surcharge_start_inclusive_cents: number;
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
