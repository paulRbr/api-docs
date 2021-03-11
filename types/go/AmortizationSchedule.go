type AmortizationSchedule []AmortizationScheduleElement

// Amortization schedule
type AmortizationScheduleElement struct {
	AmCyclePaymentCents          float64  `json:"am_cycle_payment_cents"`                    // The amount in cents that was actually paid towards the loan during the billing cycle
	AmDeferredCents              float64  `json:"am_deferred_cents"`                         // The amount in cents allocated to deferred interest from this am payment
	AmEndPrincipalBalanceCents   *float64 `json:"am_end_principal_balance_cents,omitempty"`  // The ending principal balance on the loan after this payment
	AmEndTotalBalanceCents       float64  `json:"am_end_total_balance_cents"`                // The ending balance on the loan after this payment
	AmInterestCents              float64  `json:"am_interest_cents"`                         // The amount in cents allocated to interest from this am payment
	AmMinPayCents                float64  `json:"am_min_pay_cents"`                          // The amount due just for the am schedule. This accounts for principal, interest, and; deferred interest balance but does not include fees.
	AmPrincipalCents             float64  `json:"am_principal_cents"`                        // The amount in cents allocated to principal from this am payment
	AmStartPrincipalBalanceCents *float64 `json:"am_start_principal_balance_cents,omitempty"`// The starting principal balance on the loan before this payment
	AmStartTotalBalanceCents     float64  `json:"am_start_total_balance_cents"`              // The starting balance on the loan before this payment
	CycleExclusiveEnd            string   `json:"cycle_exclusive_end"`                       // The date-time the am cycle ends.
	LineItemID                   int64    `json:"line_item_id"`                              // The ID of this generated amortization schedule.
	MinPayDueAt                  string   `json:"min_pay_due_at"`                            // The date the minimum payment for the am schedule is due.
	PaidOnTime                   *bool    `json:"paid_on_time,omitempty"`                    // Indicates whether the amount for this am payment was paid on time; only present if the; date scheduled for the am payment has passed as of the time of the request.
}
