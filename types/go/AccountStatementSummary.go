// Statement for an account for a given billing cycle
type AccountStatementSummary struct {
	AccountID         string          `json:"account_id"`                 // The Canopy-generated ID for the account
	BalanceSummary    *BalanceSummary `json:"balance_summary,omitempty"`  
	CycleSummary      *CycleSummary   `json:"cycle_summary,omitempty"`    
	EffectiveAsOfDate string          `json:"effective_as_of_date"`       // The `Date-Time` you would like the system to return the data as of. IE tell me what the; account information was as if I had asked on `2020-10-20 00:00:00 EST`. If empty it; defaults to current time.
	MinPayDueCents    *MinPayDueCents `json:"min_pay_due_cents,omitempty"`
	StatementID       string          `json:"statement_id"`               // The Canopy-generated ID for the statement
}

type BalanceSummary struct {
	TotalBalanceCents int64 `json:"total_balance_cents"`// The total balance (in cents) associated with the account.
}

type CycleSummary struct {
	CycleExclusiveEnd   string `json:"cycle_exclusive_end"`  // The inclusive ending `Date-Time` that defines which transations are part of this; statement.
	CycleInclusiveStart string `json:"cycle_inclusive_start"`// The inclusive starting `Date-Time` that defines which transations are part of this; statement.
}

type MinPayDueCents struct {
	MinPayCents int64  `json:"min_pay_cents"` // Total amount due for the billing cycle, summing cycle principal, interest, deferred; interest, and fees outstanding.
	MinPayDueAt string `json:"min_pay_due_at"`// The `Date-Time` the payment for this billing cycle is due.
}
