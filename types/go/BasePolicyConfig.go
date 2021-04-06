// A base group of policies that define a Product
type BasePolicyConfig struct {
	BillingCyclePolicies BillingCyclePolicies `json:"billing_cycle_policies"`// The set of policies governing the billing cycle for the product.
	FeePolicies          FeePolicies          `json:"fee_policies"`          // The set of policies governing fees for the product.
	InterestPolicies     InterestPolicies     `json:"interest_policies"`     // The Interest Policy Object
	PaymentDuePolicies   PaymentDuePolicies   `json:"payment_due_policies"`  // The set of policies governing payment due information for the product.
}

// The set of policies governing the billing cycle for the product.
type BillingCyclePolicies struct {
	CloseOfBusinessTime *string `json:"close_of_business_time,omitempty"`// Defaults to EST Midnight. Time of the close of business. Note* this value will be; converted into the `product_time_zone` This is used for statement cuts and partner-level; and issuing bank-level reconciliation
	CycleDueInterval    *string `json:"cycle_due_interval,omitempty"`    // Defaults to 0 days. The amount of time before statement cut that the payment should be; due for the billing cycle. If positive, it will count days from the start of the cycle.; Note, this field has a signage convention: if negative, it will count days back from the; end of the cycle. IE '25 days' indicates that payments are due 25 days after the; statement is cut. `-5` days indicates that payments will be due five days prior to the; cut of the *next* cycle. Cannot exceed the duration of the billing cycle.
	CycleInterval       string  `json:"cycle_interval"`                  // The length of the billing cycle. after which a statement is generated, and a due date; assigned. IE '1 month' '3 months' or '7 days' (most common is monthly)
	FirstCycleInterval  *string `json:"first_cycle_interval,omitempty"`  // Defaults to 0 days. If applicable, the amount of time you would like between origination; and the first statement cut. IE '10 days'. If you would like the first billing cycle to; be the same length as all other billing cycles, either do not include this field in the; request, or set its value to the same as `billing_cycle_period`
	ProductTimeZone     *string `json:"product_time_zone,omitempty"`     // Timezone denoted as an Olson-style timezone defining the timezone for the product. All; times in any response data for accounts using this product will be denominated in this; timezone. Shifts due to daylight savings will be accounted for where relevant, and all; output timestamps will be denoted as UTC offsets normalized based on this value. Defaults; to America/New_York if not provided.
}

// The set of policies governing fees for the product.
type FeePolicies struct {
	LateFeeGrace *string `json:"late_fee_grace,omitempty"`// Defaults to 0 days. The amount of time after a payment is late after which you would like; for a late fee to be incurred.
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
