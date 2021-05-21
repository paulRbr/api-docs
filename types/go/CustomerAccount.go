type CustomerAccount struct {
	AddressCity                          *string                               `json:"address_city,omitempty"`                            // Address city.
	AddressLineOne                       *string                               `json:"address_line_one,omitempty"`                        // Address line one.
	AddressLineTwo                       *string                               `json:"address_line_two,omitempty"`                        // Address line two.
	AddressState                         *string                               `json:"address_state,omitempty"`                           // Address state.
	AddressZip                           *string                               `json:"address_zip,omitempty"`                             // Five digit zipcode or nine digit 'ZIP+4'
	BusinessDetails                      *BusinessDetails                      `json:"business_details,omitempty"`                        
	CustomerID                           string                                `json:"customer_id"`                                       // A Canopy-generated ID for the customer.
	DateOfBirth                          *string                               `json:"date_of_birth,omitempty"`                           // Customer's date of birth in ISO 8601 format
	Email                                *string                               `json:"email,omitempty"`                                   // The email address of this Customer
	NameFirst                            *string                               `json:"name_first,omitempty"`                              // Customer's first name. Primary account holder or controlling officer name for Business; customers.
	NameLast                             *string                               `json:"name_last,omitempty"`                               // Customer's last name. Primary account holder or controlling officer name for Business; customers.
	NameMiddle                           *string                               `json:"name_middle,omitempty"`                             // Customer's middle name. Primary account holder or controlling officer name for Business; customers.
	NamePrefix                           *string                               `json:"name_prefix,omitempty"`                             // Prefix to the customer's name. Primary account holder or controlling officer name for; Business customers.
	NameSuffix                           *string                               `json:"name_suffix,omitempty"`                             // Suffix to the customer's name
	PhoneNumber                          *string                               `json:"phone_number,omitempty"`                            // Customer's phone number in E.164 format
	Ssn                                  *string                               `json:"ssn,omitempty"`                                     // Social security number of the customer
	CustomerAccountExternalID            *string                               `json:"customer_account_external_id,omitempty"`            // A unique number for the customer on the account. For instance, a credit card number. If; none is provided, a Canopy-generated ID can be used.
	CustomerAccountIssuerProcessorConfig *CustomerAccountIssuerProcessorConfig `json:"customer_account_issuer_processor_config,omitempty"`
	CustomerAccountRole                  *string                               `json:"customer_account_role,omitempty"`                   // The role of the customer for the account.
	Account                              *Account                              `json:"account,omitempty"`                                 
}

type Account struct {
	AccountID                        string                            `json:"account_id"`                                    // This is generated by Canopy. A unique ID for the account.
	AccountOverview                  *AccountOverview                  `json:"account_overview,omitempty"`                    
	AccountProduct                   *AccountProduct                   `json:"account_product,omitempty"`                     // The product associated with the account.
	AdditionalStatementMinPayDetails *AdditionalStatementMinPayDetails `json:"additional_statement_min_pay_details,omitempty"`
	AssociatedEntities               *AssociatedEntities               `json:"associated_entities,omitempty"`                 
	CreatedAt                        *string                           `json:"created_at,omitempty"`                          // The `Date-Time` which the account was created in the API.
	CycleType                        *CycleType                        `json:"cycle_type,omitempty"`                          
	EffectiveAt                      *string                           `json:"effective_at,omitempty"`                        // The `Date-Time` that this account became/becomes active.
	ExternalFields                   []ExternalField                   `json:"external_fields,omitempty"`                     // An Array of External Fields. These should be used to connect accounts created in Canopy; to Users in your system and any connected external systems.
	IssuerProcessorDetails           *IssuerProcessorDetails           `json:"issuer_processor_details,omitempty"`            
	MinPayDueCents                   *MinPayDueCents                   `json:"min_pay_due_cents,omitempty"`                   
	PaymentProcessorConfig           *PaymentProcessorConfig           `json:"payment_processor_config,omitempty"`            
	Summary                          *Summary                          `json:"summary,omitempty"`                             
}

type AccountOverview struct {
	AccountStatus        string  `json:"account_status"`                  // The Status of the Account. Active upon account creation.
	AccountStatusSubtype *string `json:"account_status_subtype,omitempty"`// The subtype of the Status of the Account. Null upon account creation.
}

// The product associated with the account.
type AccountProduct struct {
	ExternalProductID          *string                     `json:"external_product_id,omitempty"`         // A unique external ID that may be used interchangeably with the Canopy-generated product ID
	PostPromoOverview          *PostPromoOverview          `json:"post_promo_overview,omitempty"`         
	ProductDurationInformation *ProductDurationInformation `json:"product_duration_information,omitempty"`
	ProductID                  int64                       `json:"product_id"`                            // The Canopy-generated ID for the product.
	ProductLifecycle           *ProductLifecycle           `json:"product_lifecycle,omitempty"`           
	ProductOverview            *ProductOverview            `json:"product_overview,omitempty"`            
	PromoOverview              *PromoOverview              `json:"promo_overview,omitempty"`              
}

type PostPromoOverview struct {
	PostPromoExclusiveEnd            *string  `json:"post_promo_exclusive_end,omitempty"`             // If applicable, the start date for a promotional period for the account.
	PostPromoImplInterestRatePercent *float64 `json:"post_promo_impl_interest_rate_percent,omitempty"`// The percentage interest applied to the account during the post-promotional period (i.e.; 6.2%)
	PostPromoInclusiveStart          *string  `json:"post_promo_inclusive_start,omitempty"`           // If applicable, the start date for a promotional period for the account.
	PostPromoLen                     *int64   `json:"post_promo_len,omitempty"`                       // If applicable, post-promotional amortization length in cycles.
}

type ProductDurationInformation struct {
	PromoLen               *int64 `json:"promo_len,omitempty"`                // The number of billing cycles from account origination during which accounts on this; product are on a promotional period.
	PromoPurchaseWindowLen *int64 `json:"promo_purchase_window_len,omitempty"`// If applicable, the number of billing cycles from account origination under which this; product falls under a purchas window period.
}

type ProductLifecycle struct {
	AnnualFeeImplCents          *int64  `json:"annual_fee_impl_cents,omitempty"`     // An annual fee to be charged yearly from the date of account creation. It will reflect on; the subsequent statement once incurred.
	LateFeeImplCents            int64   `json:"late_fee_impl_cents"`                 // The fee charged for late payments on the account.
	LoanEndDate                 *string `json:"loan_end_date,omitempty"`             // If applicable, the account's loan repayment date.
	MonthlyFeeImplCents         *int64  `json:"monthly_fee_impl_cents,omitempty"`    // A monthly fee to be charged monthly from the date of account creation. It will reflect on; the subsequent statement once incurred.
	OriginationFeeImplCents     *int64  `json:"origination_fee_impl_cents,omitempty"`// The fee charged at the time of account origination
	PaymentReversalFeeImplCents int64   `json:"payment_reversal_fee_impl_cents"`     // The fee charged for payment reversals on the account.
}

type ProductOverview struct {
	ProductColor            *string `json:"product_color,omitempty"`            // A color to be associated with the product for UI purposes.
	ProductLongDescription  string  `json:"product_long_description"`           // Description of the Product.
	ProductName             string  `json:"product_name"`                       // Name of Product, i.e. Express Card.
	ProductShortDescription *string `json:"product_short_description,omitempty"`// Short description of the Product - max of 30 characters.
	ProductTimeZone         *string `json:"product_time_zone,omitempty"`        // Timezone denoted as an [Olson-style; timezone](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones) defining the; timezone for the product. All times in any response data for accounts using this product; will be denominated in this timezone. Shifts due to daylight savings will be accounted; for where relevant, and all output timestamps will be denoted as UTC offsets normalized; based on this value.
	ProductType             string  `json:"product_type"`                       // The Type of Product. If not included, defaults to `REVOLVING`
}

type PromoOverview struct {
	PromoExclusiveEnd                 *string  `json:"promo_exclusive_end,omitempty"`                  // If applicable, the start date for a promotional period for the account.
	PromoImplInterestRatePercent      *float64 `json:"promo_impl_interest_rate_percent,omitempty"`     // The percentage interest applied to the account during the promotional period (i.e. 6.2%)
	PromoInclusiveStart               *string  `json:"promo_inclusive_start,omitempty"`                // If applicable, the start date for a promotional period for the account.
	PromoLen                          *int64   `json:"promo_len,omitempty"`                            // Defaults to 0. The number of billing cycles from account origination during which; accounts on this product are on a promotional period.
	PromoPurchaseWindowExclusiveEnd   *string  `json:"promo_purchase_window_exclusive_end,omitempty"`  // If applicable, the end date for a purchase window for the account
	PromoPurchaseWindowInclusiveStart *string  `json:"promo_purchase_window_inclusive_start,omitempty"`// If applicable, the start date for a purchase window for the account
}

type AdditionalStatementMinPayDetails struct {
	PreviousStatementMinPayCents           int64 `json:"previous_statement_min_pay_cents"`            // Previous amounts due, including fees. This is a subset of statement_min_pay_cents.
	StatementMinPayAmDeferredInterestCents int64 `json:"statement_min_pay_am_deferred_interest_cents"`// The current AM deferred interest balance of the line item. Canopy tracks deferred; interest during an amortization period separately from deferred interest accrued during a; revolving period.
	StatementMinPayAmInterestCents         int64 `json:"statement_min_pay_am_interest_cents"`         // The current AM interest balance of the line item. Canopy tracks interest during an; amortization period separately from deferred interest accrued during a revolving period.
	StatementMinPayChargesPrincipalCents   int64 `json:"statement_min_pay_charges_principal_cents"`   // Total principal due for the billing cycle.
	StatementMinPayDeferredCents           int64 `json:"statement_min_pay_deferred_cents"`            // Total deferred interest due for the billing cycle.
	StatementMinPayFeesCents               int64 `json:"statement_min_pay_fees_cents"`                // Total fees due for the billing cycle.
	StatementMinPayInterestCents           int64 `json:"statement_min_pay_interest_cents"`            // Total interest due for the billing cycle.
}

type AssociatedEntities struct {
	LenderName   *string `json:"lender_name,omitempty"`  // A lender name associated with the account
	MerchantName *string `json:"merchant_name,omitempty"`// A merchant name associated with the account
}

type CycleType struct {
	FirstCycleInterval *string `json:"first_cycle_interval,omitempty"`// Interval for a first cycle for this account.
}

type ExternalField struct {
	Key   *string `json:"key,omitempty"`  // key: i.e. Name of the External Party
	Value *string `json:"value,omitempty"`// value: i.e. External Account ID
}

type IssuerProcessorDetails struct {
	Privacy *IssuerProcessorDetailsPrivacy `json:"privacy,omitempty"`
}

type IssuerProcessorDetailsPrivacy struct {
	AccountToken *string `json:"account_token,omitempty"`// The external unique identifier of the Privacy account against which charges are made.
}

type MinPayDueCents struct {
	MinPayDueAt          *string `json:"min_pay_due_at,omitempty"`// The `Date-Time` the payment for this billing cycle is due.
	StatementMinPayCents int64   `json:"statement_min_pay_cents"` // Total amount due for the billing cycle, summing cycle principal, interest, deferred; interest, and fees outstanding.
}

type PaymentProcessorConfig struct {
	AutopayEnabled       *bool                 `json:"autopay_enabled,omitempty"`       // Indicates whether autopay is enabled for this account. Currently, autopay is triggered 1; day prior to a payment due date.
	PaymentProcessorName *PaymentProcessorName `json:"payment_processor_name,omitempty"`// Indicates the active payment processor whose configuration will be used for payments made; from the account. If `NONE`, Canopy will not trigger payments to an external payment; processor when they occur.
	RepayConfig          *RepayConfig          `json:"repay_config,omitempty"`          
}

type RepayConfig struct {
	ValidConfig bool `json:"valid_config"`// Indicates whether Canopy has a valid configuration stored for this payment processor for; this account. For example, if Canopy needs an ACH token on behalf of the account to call; the processor, this field will indicate that Canopy has successfully stored the necessary; token.
}

type Summary struct {
	AmDeferredInterestBalanceCents *int64   `json:"am_deferred_interest_balance_cents,omitempty"`// The total AM deferred interest balance (in cents) associated with the account.
	AmInterestBalanceCents         *int64   `json:"am_interest_balance_cents,omitempty"`         // The total AM interest balance (in cents) associated with the account.
	AvailableCreditCents           *int64   `json:"available_credit_cents,omitempty"`            // The total available credit balance (in cents) for the account.
	CreditLimitCents               int64    `json:"credit_limit_cents"`                          // Total Amount (in cents) that this account can borrow.
	DeferredInterestBalanceCents   *int64   `json:"deferred_interest_balance_cents,omitempty"`   // The total deferred interest balance (in cents) associated with the account.
	InterestBalanceCents           *int64   `json:"interest_balance_cents,omitempty"`            // The total interest balance (in cents) associated with the account.
	InterestRatePercent            *float64 `json:"interest_rate_percent,omitempty"`             // The percentage interest applied to the account (i.e. 6.2 means 6.2%)
	MaxApprovedCreditLimitCents    *int64   `json:"max_approved_credit_limit_cents,omitempty"`   // Total Amount (in cents) that this account can borrow.
	OpenToBuyCents                 *int64   `json:"open_to_buy_cents,omitempty"`                 // If applicable, the total amount of available funds for continued purchase following a; purchase window pattern, where payments made do not replenish amount available for; purchase.
	PrincipalCents                 *int64   `json:"principal_cents,omitempty"`                   // The total balance (in cents) associated with the account.
	TotalBalanceCents              *int64   `json:"total_balance_cents,omitempty"`               // The total balance (in cents) associated with the account.
	TotalInterestPaidToDateCents   *int64   `json:"total_interest_paid_to_date_cents,omitempty"` // The total sum of interest allocations for payments made to date (in cents) associated; with the account.
	TotalPaidToDateCents           *int64   `json:"total_paid_to_date_cents,omitempty"`          // The total sum of payments made to date (in cents) associated with the account.
	TotalPayoffCents               *int64   `json:"total_payoff_cents,omitempty"`                // The total amount needed to pay off the loan at this exact moment.
}

type BusinessDetails struct {
	BusinessEin       *string `json:"business_ein,omitempty"`       // EIN of the business
	BusinessLegalName *string `json:"business_legal_name,omitempty"`// The legal name of the Business
	DoingBusinessAs   *string `json:"doing_business_as,omitempty"`  // The DBA name of the Business
}

type CustomerAccountIssuerProcessorConfig struct {
	Privacy *CustomerAccountIssuerProcessorConfigPrivacy `json:"privacy,omitempty"`
}

type CustomerAccountIssuerProcessorConfigPrivacy struct {
	PrivacyCard *PrivacyCard `json:"privacy_card,omitempty"`
}

type PrivacyCard struct {
	LastFour *string `json:"last_four,omitempty"`// Last four digits of the card number
	Memo     *string `json:"memo,omitempty"`     // Friendly name to identify the card
	Type     *Type   `json:"type,omitempty"`     // The type of card created by privacy.com
}

// Indicates the active payment processor whose configuration will be used for payments made
// from the account. If `NONE`, Canopy will not trigger payments to an external payment
// processor when they occur.
type PaymentProcessorName string
const (
	None PaymentProcessorName = "NONE"
	Repay PaymentProcessorName = "REPAY"
)

// The type of card created by privacy.com
type Type string
const (
	MerchantLocked Type = "MERCHANT_LOCKED"
	SingleUse Type = "SINGLE_USE"
	Unlocked Type = "UNLOCKED"
)
