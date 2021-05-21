// Statements for the account.
type StatementsList struct {
	AccountID      *string                 `json:"account_id,omitempty"`     // The Canopy-generated ID for the account
	StatementsList []StatementsListElement `json:"statements_list,omitempty"`// An array of statements included in the billing cycle.
}

type StatementsListElement struct {
	AvailableCreditBalance *float64 `json:"available_credit_balance,omitempty"`// The total available credit balance (in cents) for the account.
	BillingCycleEndDate    *string  `json:"billing_cycle_end_date,omitempty"`  // The inclusive ending `Date-Time` that defines which transactions are part of this; statement.
	BillingCycleStartDate  *string  `json:"billing_cycle_start_date,omitempty"`// The inclusive starting `Date-Time` that defines which transactions are part of this; statement.
	MinPayAmountCents      *float64 `json:"min_pay_amount_cents,omitempty"`    // The minimum amount (in cents) due for this statement.
	MinPayDueDate          *string  `json:"min_pay_due_date,omitempty"`        // The `Date-Time` at which the minimum payment is due.
	StatementID            *string  `json:"statement_id,omitempty"`            // A Canopy-generated ID for the statement
	TotalBalance           *float64 `json:"total_balance,omitempty"`           // The total balance (in cents) associated with the account.
}
