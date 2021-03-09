// Statement for an account for a given billing cycle
type AccountStatement struct {
	AccountID               int64                    `json:"account_id"`                          // The Canopy-generated ID for the account
	AccountOverview         *AccountOverview         `json:"account_overview,omitempty"`          
	AdditionalMinPayDetails *AdditionalMinPayDetails `json:"additional_min_pay_details,omitempty"`
	BalanceSummary          *BalanceSummary          `json:"balance_summary,omitempty"`           
	CycleSummary            *CycleSummary            `json:"cycle_summary,omitempty"`             
	EffectiveAsOfDate       string                   `json:"effective_as_of_date"`                // The `Date-Time` you would like the system to return the data as of. IE tell me what the; account information was as if I had asked on `2020-10-20 00:00:00 EST`. If empty it; defaults to current time.
	MinPayDue               *MinPayDue               `json:"min_pay_due,omitempty"`               
	OpenToBuy               *OpenToBuy               `json:"open_to_buy,omitempty"`               
	Payoff                  *Payoff                  `json:"payoff,omitempty"`                    
	StatementID             int64                    `json:"statement_id"`                        // The Canopy-generated ID for the statement
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
