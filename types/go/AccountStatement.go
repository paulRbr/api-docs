// Statement for an account for a given billing cycle
type AccountStatement struct {
	AccountID               string                   `json:"account_id"`                          // The Canopy-generated ID for the account
	AccountOverview         *AccountOverview         `json:"account_overview,omitempty"`          
	AdditionalMinPayDetails *AdditionalMinPayDetails `json:"additional_min_pay_details,omitempty"`
	BalanceSummary          *BalanceSummary          `json:"balance_summary,omitempty"`           
	CycleSummary            *CycleSummary            `json:"cycle_summary,omitempty"`             
	EffectiveAsOfDate       string                   `json:"effective_as_of_date"`                // The `Date-Time` you would like the system to return the data as of. IE tell me what the; account information was as if I had asked on `2020-10-20 00:00:00 EST`. If empty it; defaults to current time.
	LineItems               []LineItem               `json:"line_items,omitempty"`                // A snapshot of all line items that occurred during the cycle and were `VALID` at the time; of Statement cut.
	MinPayDue               *MinPayDue               `json:"min_pay_due,omitempty"`               
	OpenToBuy               *OpenToBuy               `json:"open_to_buy,omitempty"`               
	Payoff                  *Payoff                  `json:"payoff,omitempty"`                    
	StatementID             string                   `json:"statement_id"`                        // The Canopy-generated ID for the statement
}

type AccountOverview struct {
	AccountStatus                     *string `json:"account_status,omitempty"`                       // The Status of the Account. Active upon account creation.
	AccountStatusSubtype              *string `json:"account_status_subtype,omitempty"`               // The subtype of the Status of the Account. Null upon account creation.
	PromoExclusiveEnd                 *string `json:"promo_exclusive_end,omitempty"`                  // If applicable, the `Date-Time` the promo period for the account ends.
	PromoInclusiveStart               *string `json:"promo_inclusive_start,omitempty"`                // If applicable, the `Date-Time` the promo period for the account starts.
	PromoPurchaseWindowExclusiveEnd   *string `json:"promo_purchase_window_exclusive_end,omitempty"`  // If applicable, the `Date-Time` the purchase window for the account ends.
	PromoPurchaseWindowInclusiveStart *string `json:"promo_purchase_window_inclusive_start,omitempty"`// If applicable, the `Date-Time` the purchase window for the account ends.
}

type AdditionalMinPayDetails struct {
	MinPayAmDeferredInterestCents *int64 `json:"min_pay_am_deferred_interest_cents,omitempty"`// The current AM deferred interest balance of the line item. Canopy tracks deferred; interest during an amortization period separately from deferred interest accrued during a; revolving period.
	MinPayAmInterestCents         *int64 `json:"min_pay_am_interest_cents,omitempty"`         // Total am interest due for the billing cycle.
	MinPayChargesPrincipalCents   int64  `json:"min_pay_charges_principal_cents"`             // Total principal due for the billing cycle.
	MinPayDeferredCents           int64  `json:"min_pay_deferred_cents"`                      // Total deferred interest due for the billing cycle.
	MinPayFeesCents               int64  `json:"min_pay_fees_cents"`                          // Total fees due for the billing cycle.
	MinPayInterestCents           int64  `json:"min_pay_interest_cents"`                      // Total interest due for the billing cycle.
	PreviousMinPayCents           int64  `json:"previous_min_pay_cents"`                      // Previous amounts due, including fees. This is a subset of min_pay_cents.
}

type BalanceSummary struct {
	AmDeferredInterestBalanceCents *int64 `json:"am_deferred_interest_balance_cents,omitempty"`// The total deferred interest balance (in cents) associated with the account.
	AmInterestBalanceCents         *int64 `json:"am_interest_balance_cents,omitempty"`         // Total AM interest balance for the account.
	ChargesPrincipalCents          *int64 `json:"charges_principal_cents,omitempty"`           // Total principal balance for the account.
	DeferredInterestBalanceCents   *int64 `json:"deferred_interest_balance_cents,omitempty"`   // Total deferred interest balance for the account.
	FeesBalanceCents               *int64 `json:"fees_balance_cents,omitempty"`                // Total fee balance for the account.
	InterestBalanceCents           *int64 `json:"interest_balance_cents,omitempty"`            // Total interest balance for the account.
	LoansPrincipalCents            *int64 `json:"loans_principal_cents,omitempty"`             // Total principal balance for loans for the account.
	TotalBalanceCents              *int64 `json:"total_balance_cents,omitempty"`               // The total balance (in cents) associated with the account.
}

type CycleSummary struct {
	CycleAmDeferredInterestCents     *int64  `json:"cycle_am_deferred_interest_cents,omitempty"`    // Total interest accrued during the billing cycle. Canopy tracks deferred interest during; an amortization period separately from deferred interest accrued during a revolving; period.
	CycleAmInterestCents             *int64  `json:"cycle_am_interest_cents,omitempty"`             // The current AM interest balance of the line item. Canopy tracks interest during an; amortization period separately from deferred interest accrued during a revolving period.
	CycleChargeReturnsCents          *int64  `json:"cycle_charge_returns_cents,omitempty"`          // Sum of all returns that occurred on the account during the billing cycle.
	CycleChargesCents                *int64  `json:"cycle_charges_cents,omitempty"`                 // Sum of all charges that occurred on the account during the billing cycle.
	CycleCreditAdjustmentsCents      *int64  `json:"cycle_credit_adjustments_cents,omitempty"`      // Sum of all credit adjustment amounts that occurred on the account during the billing; cycle.
	CycleDebitAdjustmentsCents       *int64  `json:"cycle_debit_adjustments_cents,omitempty"`       // Sum of all debit adjustment amounts that occurred on the account during the billing cycle.
	CycleDeferredInterestCents       *int64  `json:"cycle_deferred_interest_cents,omitempty"`       // Total interest accrued during the billing cycle.
	CycleExclusiveEnd                *string `json:"cycle_exclusive_end,omitempty"`                 // The inclusive ending `Date-Time` that defines which transations are part of this; statement.
	CycleInclusiveStart              *string `json:"cycle_inclusive_start,omitempty"`               // The inclusive starting `Date-Time` that defines which transations are part of this; statement.
	CycleInterestCents               *int64  `json:"cycle_interest_cents,omitempty"`                // Total interest accrued during the billing cycle.
	CycleLateFeesCents               *int64  `json:"cycle_late_fees_cents,omitempty"`               // Total late fees incurred during the billing cycle.
	CycleLoansCents                  *int64  `json:"cycle_loans_cents,omitempty"`                   // Sum of all loans amounts that were initiated on the account during the billing cycle.
	CyclePaymentReversalsCents       *int64  `json:"cycle_payment_reversals_cents,omitempty"`       // Sum of all payment reversal amounts that occurred on the account during the billing cycle.
	CyclePaymentReversalsFeesCents   *int64  `json:"cycle_payment_reversals_fees_cents,omitempty"`  // Total payment reversal fees incurred during the billing cycle.
	CyclePaymentsCents               *int64  `json:"cycle_payments_cents,omitempty"`                // Sum of all payments that occurred on the account during the billing cycle.
	CycleWaivedDeferredInterestCents *int64  `json:"cycle_waived_deferred_interest_cents,omitempty"`// Total deferred interest that was forgiven on the account during the billing cycle.
}

type LineItem struct {
	AccountID               int64                    `json:"account_id"`                         // The account associated with the line item
	CreatedAt               *string                  `json:"created_at,omitempty"`               // The `Date-Time` which the line item was created.
	EffectiveAt             *string                  `json:"effective_at,omitempty"`             // The `Date-Time` that this line item became/becomes active
	ExternalFields          []ExternalField          `json:"external_fields,omitempty"`          // An array of static references to fields in a third party system.
	IssuerProcessorMetadata *IssuerProcessorMetadata `json:"issuer_processor_metadata,omitempty"`
	LineItemID              int64                    `json:"line_item_id"`                       // The ID associated with the line item
	LineItemOverview        *LineItemOverview        `json:"line_item_overview,omitempty"`       
	LineItemSummary         *LineItemSummary         `json:"line_item_summary,omitempty"`        
	MerchantData            *MerchantData            `json:"merchant_data,omitempty"`            // Merchant information if applicable.
	ProductID               int64                    `json:"product_id"`                         // the Product ID of the account
}

type ExternalField struct {
	Key   *string `json:"key,omitempty"`  // Key - i.e. Name of the External Party
	Value *string `json:"value,omitempty"`// Value - i.e. External Account ID
}

type IssuerProcessorMetadata struct {
	Privacy *Privacy `json:"privacy,omitempty"`
}

type Privacy struct {
	LastFour *int64 `json:"last_four,omitempty"`// Last four digits of the card against which the spend was made.
}

type LineItemOverview struct {
	Description    *string         `json:"description,omitempty"`     // A description of this particular line item if any. More common for adjustments.
	LineItemStatus *LineItemStatus `json:"line_item_status,omitempty"`// the corresponding Status for a line item
	LineItemType   LineItemType    `json:"line_item_type"`            // The Line Item Type. i.e. `CHARGE`, `PAYMENT`.
}

type LineItemSummary struct {
	AmDeferredInterestBalanceCents *int64 `json:"am_deferred_interest_balance_cents,omitempty"`// The current AM deferred interest balance of the line item. Canopy tracks deferred; interest during an amortization period separately from deferred interest accrued during a; revolving period.
	AmInterestBalanceCents         *int64 `json:"am_interest_balance_cents,omitempty"`         // The current AM interest balance of the line item. Canopy tracks interest during an; amortization period separately from deferred interest accrued during a revolving period.
	BalanceCents                   int64  `json:"balance_cents"`                               // The current balance of the line item, which accounts for interest accrued per the; `product's` interest policy and the `account's` interest rate attribute.
	DeferredInterestBalanceCents   int64  `json:"deferred_interest_balance_cents"`             // he current deferred interest balance of the line item.
	InterestBalanceCents           int64  `json:"interest_balance_cents"`                      // The current interest balance of the line item.
	OriginalAmountCents            int64  `json:"original_amount_cents"`                       // The originating amount of money (in cents) relating to this line item.
	PrincipalCents                 int64  `json:"principal_cents"`                             // The principal balance of the line item.
	TotalInterestPaidToDateCents   int64  `json:"total_interest_paid_to_date_cents"`           // The sum (in cents) of all payments towards interest charges, if any, applied to this line; item to date
}

// Merchant information if applicable.
type MerchantData struct {
	ID          *string  `json:"id,omitempty"`          
	MccCode     *float64 `json:"mcc_code,omitempty"`    
	Name        *string  `json:"name,omitempty"`        
	PhoneNumber *string  `json:"phone_number,omitempty"`
}

type MinPayDue struct {
	MinPayCents int64  `json:"min_pay_cents"` // Total amount due for the billing cycle, summing cycle principal, interest, deferred; interest, and fees outstanding.
	MinPayDueAt string `json:"min_pay_due_at"`// The `Date-Time` the payment for this billing cycle is due.
}

type OpenToBuy struct {
	AvailableCreditCents *int64 `json:"available_credit_cents,omitempty"`// The total available credit balance (in cents) for the account.
	CreditLimitCents     *int64 `json:"credit_limit_cents,omitempty"`    // Total Amount (in cents) that this account can borrow.
	OpenToBuyCents       *int64 `json:"open_to_buy_cents,omitempty"`     // If applicable, the total amount of available funds for continued purchase following a; purchase window pattern, where payments made do not replenish amount available for; purchase.
	TotalChargesCents    *int64 `json:"total_charges_cents,omitempty"`   // Sum of all charges that occurred on the account since account origination.
}

type Payoff struct {
	ExpectedRemainingPaymentAmountCents *int64 `json:"expected_remaining_payment_amount_cents,omitempty"`// The total amount slated to pay off the account over the lifecycle of the loan.
	TotalPayoffCents                    *int64 `json:"total_payoff_cents,omitempty"`                     // The total amount needed to pay off the loan at this exact moment.
}

// the corresponding Status for a line item
type LineItemStatus string
const (
	Authorized LineItemStatus = "AUTHORIZED"
	Invalid LineItemStatus = "INVALID"
	Offset LineItemStatus = "OFFSET"
	Pending LineItemStatus = "PENDING"
	Posted LineItemStatus = "POSTED"
	Reversed LineItemStatus = "REVERSED"
	Rolled LineItemStatus = "ROLLED"
	SplitInvalid LineItemStatus = "SPLIT_INVALID"
	SplitValid LineItemStatus = "SPLIT_VALID"
	Valid LineItemStatus = "VALID"
	Void LineItemStatus = "VOID"
)

// The Line Item Type. i.e. `CHARGE`, `PAYMENT`.
type LineItemType string
const (
	Charge LineItemType = "CHARGE"
	CreditOffset LineItemType = "CREDIT_OFFSET"
	DebitOffset LineItemType = "DEBIT_OFFSET"
	DeferredInterest LineItemType = "DEFERRED_INTEREST"
	Fee LineItemType = "FEE"
	Interest LineItemType = "INTEREST"
	LateFee LineItemType = "LATE_FEE"
	Loan LineItemType = "LOAN"
	MinDue LineItemType = "MIN_DUE"
	MonthFee LineItemType = "MONTH_FEE"
	Payment LineItemType = "PAYMENT"
	PaymentSplit LineItemType = "PAYMENT_SPLIT"
	ProductInterest LineItemType = "PRODUCT_INTEREST"
	PromoEnd LineItemType = "PROMO_END"
	PurchaseWindowEnd LineItemType = "PURCHASE_WINDOW_END"
	ReturnCheckFee LineItemType = "RETURN_CHECK_FEE"
	Statement LineItemType = "STATEMENT"
	YearFee LineItemType = "YEAR_FEE"
)
