type CreateProductInput struct {
	Admin                    *Admin                   `json:"admin,omitempty"`              
	EffectiveAt              *string                  `json:"effective_at,omitempty"`       // The `Date-Time` as of which this product is effective on the server. Your product should; be older than all accounts enrolled in it.
	ExternalProductID        *string                  `json:"external_product_id,omitempty"`// A unique external ID that may be used interchangeably with the Canopy-generated product ID
	PostPromotionalPolicies  PostPromotionalPolicies  `json:"post_promotional_policies"`    
	ProductLifecyclePolicies ProductLifecyclePolicies `json:"product_lifecycle_policies"`   
	ProductOverview          ProductOverview          `json:"product_overview"`             // A series of static fields about the product.
	PromotionalPolicies      PromotionalPolicies      `json:"promotional_policies"`         // If applicable, a promotional configuration for the product.
}

type Admin struct {
	MigrationMode *bool `json:"migration_mode,omitempty"`// If migration mode is on, Canopy will stop auto-generating statements for this account.
}

type PostPromotionalPolicies struct {
	PostPromoAmLenRangeInclusiveLower   *int64               `json:"post_promo_am_len_range_inclusive_lower,omitempty"` // Optional lower bound for amortization length in billing cycles for the product.
	PostPromoAmLenRangeInclusiveUpper   *int64               `json:"post_promo_am_len_range_inclusive_upper,omitempty"` // Optional upper bound for amortization length in billing cycles for the product.
	PostPromoAPRRangeInclusiveLower     *float64             `json:"post_promo_apr_range_inclusive_lower,omitempty"`    // Optional lower bound for APR Range for the product (i.e. 2 = 2%).
	PostPromoAPRRangeInclusiveUpper     *float64             `json:"post_promo_apr_range_inclusive_upper,omitempty"`    // Optional upper bound for APR Range for the product (i.e. 5 = 5%).
	PostPromoDefaultInterestRatePercent *float64             `json:"post_promo_default_interest_rate_percent,omitempty"`// The rate that serves as the active interest rate for accounts during the post-promotional; period.
	PostPromoLen                        *int64               `json:"post_promo_len,omitempty"`                          // Default duration for any amortization period during post-promotion
	PostPromoMinPayType                 *PostPromoMinPayType `json:"post_promo_min_pay_type,omitempty"`                 // Current due calculation method for the post-promotional period.
}

type ProductLifecyclePolicies struct {
	BillingCyclePolicies *BillingCyclePolicies `json:"billing_cycle_policies,omitempty"`// The set of policies governing the billing cycle for the product.
	DefaultAttributes    *DefaultAttributes    `json:"default_attributes,omitempty"`    
	FeePolicies          *FeePolicies          `json:"fee_policies,omitempty"`          // The set of policies governing fees for the product.
	InterestPolicies     *InterestPolicies     `json:"interest_policies,omitempty"`     // The Interest Policy Object
	PaymentDuePolicies   *PaymentDuePolicies   `json:"payment_due_policies,omitempty"`  // The set of policies governing payment due information for the product.
}

// The set of policies governing the billing cycle for the product.
type BillingCyclePolicies struct {
	CloseOfBusinessTime *string `json:"close_of_business_time,omitempty"`// Defaults to EST Midnight. Time of the close of business. Note* this value will be; converted into the `product_time_zone` This is used for statement cuts and partner-level; and issuing bank-level reconciliation
	CycleDueInterval    *string `json:"cycle_due_interval,omitempty"`    // Defaults to 0 days. The amount of time before statement cut that the payment should be; due for the billing cycle. If positive, it will count days from the start of the cycle.; Note, this field has a signage convention: if negative, it will count days back from the; end of the cycle. IE '25 days' indicates that payments are due 25 days after the; statement is cut. `-5` days indicates that payments will be due five days prior to the; cut of the *next* cycle. Cannot exceed the duration of the billing cycle.
	CycleInterval       string  `json:"cycle_interval"`                  // The length of the billing cycle. after which a statement is generated, and a due date; assigned. IE '1 month' '3 months' or '7 days' (most common is monthly)
	FirstCycleInterval  *string `json:"first_cycle_interval,omitempty"`  // Defaults to 0 days. If applicable, the amount of time you would like between origination; and the first statement cut. IE '10 days'. If you would like the first billing cycle to; be the same length as all other billing cycles, either do not include this field in the; request, or set its value to the same as `billing_cycle_period`
	ProductTimeZone     *string `json:"product_time_zone,omitempty"`     // Timezone denoted as an Olson-style timezone defining the timezone for the product. All; times in any response data for accounts using this product will be denominated in this; timezone. Shifts due to daylight savings will be accounted for where relevant, and all; output timestamps will be denoted as UTC offsets normalized based on this value. Defaults; to America/New_York if not provided.
}

type DefaultAttributes struct {
	DefaultCreditLimitCents        int64  `json:"default_credit_limit_cents"`                  // The default maximum principal credit (in cents) available for a customer account. For; risk-based-pricing, this default limit can be overridden on a per-account basis if a; `credit_limit` is selected at the time of assigning an account to a product in the; `Create Account` call. Credit limits for an account can also be updated post-account; creation.
	DefaultLateFeeCents            *int64 `json:"default_late_fee_cents,omitempty"`            // The default late fee for accounts enrolled in this product. This will be used if no late; fee is provided at account creation.
	DefaultPaymentReversalFeeCents *int64 `json:"default_payment_reversal_fee_cents,omitempty"`// The default payment reversa fee for accounts enrolled in this product. This will be used; if no late fee is provided at account creation.
}

// The set of policies governing fees for the product.
type FeePolicies struct {
	DefaultSurchargeFeeStructure []DefaultSurchargeFeeStructure `json:"default_surcharge_fee_structure,omitempty"`// The transaction volume structure that dictates a transaction fee.
	LateFeeGrace                 *string                        `json:"late_fee_grace,omitempty"`                 // Defaults to 0 days. The amount of time after a payment is late after which you would like; for a late fee to be incurred.
	SurchargeFeeInterval         *string                        `json:"surcharge_fee_interval,omitempty"`         // The interval at which a surcharge fee is assessed.
}

type DefaultSurchargeFeeStructure struct {
	PercentSurcharge             float64 `json:"percent_surcharge"`                      // Indicates the surcharge fee as a percent of total transaction volume that will be applied; to the account if the total transaction volume during the surcharge interval falls within; the provided start and end range.
	SurchargeEndExclusiveCents   *int64  `json:"surcharge_end_exclusive_cents,omitempty"`// Indicates the ending transaction volume at which this fee will apply. If not provided,; the surcharge will apply to any transaction volume above the defined start.
	SurchargeStartInclusiveCents int64   `json:"surcharge_start_inclusive_cents"`        // Indicates the starting transaction volume at which this fee will apply.
}

// The Interest Policy Object
type InterestPolicies struct {
	InterestCalcTime *string `json:"interest_calc_time,omitempty"`// Defaults to EST 1AM. Interest for this policy is calculated at this time every X interval.
}

// The set of policies governing payment due information for the product.
type PaymentDuePolicies struct {
	ChargeOffOnNConsecutiveLateFees  *int64 `json:"charge_off_on_n_consecutive_late_fees,omitempty"`// After this number of consecutive late events, the account status shifts to `suspended`; with a status subtype of `charged_off`
	DelinquentOnNConsecutiveLateFees *int64 `json:"delinquent_on_n_consecutive_late_fees,omitempty"`// After this number of consecutive late events, the account status shifts to `suspended`; with a status subtype of `delinquent`
}

// A series of static fields about the product.
type ProductOverview struct {
	ProductColor            *string     `json:"product_color,omitempty"`  // A color to be associated with the product for UI purposes.
	ProductLongDescription  string      `json:"product_long_description"` // Description of the Product ranging from 0 - 1000.
	ProductName             string      `json:"product_name"`             // Name of Product, i.e. BNPL 24 Month Standard.
	ProductShortDescription string      `json:"product_short_description"`// A short description of the product ranging from 0 - 60 characters.
	ProductType             ProductType `json:"product_type"`             // The Type of Product
}

// If applicable, a promotional configuration for the product.
type PromotionalPolicies struct {
	PromoAPRRangeInclusiveLower     *float64         `json:"promo_apr_range_inclusive_lower,omitempty"`    // Optional lower bound for APR Range for the product (i.e. 2 = 2%).
	PromoAPRRangeInclusiveUpper     *float64         `json:"promo_apr_range_inclusive_upper,omitempty"`    // Optional upper bound for APR Range for the product (i.e. 5 = 5%).
	PromoDefaultInterestRatePercent *float64         `json:"promo_default_interest_rate_percent,omitempty"`// The rate that serves as the active interest rate for accounts during the promotional; period.
	PromoInterestDeferred           *bool            `json:"promo_interest_deferred,omitempty"`            // Indicates whether interest accrued during the promotional period is deferred interest.
	PromoLen                        *int64           `json:"promo_len,omitempty"`                          // Defaults to 0. The number of billing cycles from account origination during which; accounts on this product are on a promotional period.
	PromoMinPayPercent              *float64         `json:"promo_min_pay_percent,omitempty"`              // Defaults to 100. The percent of new interest in the cycle used to determine the minimum; payment.
	PromoMinPayType                 *PromoMinPayType `json:"promo_min_pay_type,omitempty"`                 // Current due calculation method for the promotional period.
	PromoPurchaseWindowLen          *int64           `json:"promo_purchase_window_len,omitempty"`          // If applicable, the number of billing cycles from account origination under which this; product falls under a purchas window period.
}

// Current due calculation method for the post-promotional period.
type PostPromoMinPayType string
const (
	PostPromoMinPayTypeAM PostPromoMinPayType = "AM"
)

// The Type of Product
type ProductType string
const (
	DeferredInstallment ProductType = "DEFERRED_INSTALLMENT"
	FixedRateInstallment ProductType = "FIXED_RATE_INSTALLMENT"
	Installment ProductType = "INSTALLMENT"
	MixedRateInstallment ProductType = "MIXED_RATE_INSTALLMENT"
	Revolving ProductType = "REVOLVING"
)

// Current due calculation method for the promotional period.
type PromoMinPayType string
const (
	None PromoMinPayType = "NONE"
	PercentInterest PromoMinPayType = "PERCENT_INTEREST"
	PercentPrincipal PromoMinPayType = "PERCENT_PRINCIPAL"
	PromoMinPayTypeAM PromoMinPayType = "AM"
)
