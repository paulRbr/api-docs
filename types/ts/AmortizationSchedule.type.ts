/**
 * Amortization schedule
 */
export interface AmortizationSchedule {
    /**
     * The amount in cents that was actually paid towards the loan during the billing cycle
     */
    am_cycle_payment_cents: number;
    /**
     * The amount in cents allocated to deferred interest from this am payment
     */
    am_deferred_cents: number;
    /**
     * The ending principal balance on the loan after this payment
     */
    am_end_principal_balance_cents?: number;
    /**
     * The ending balance on the loan after this payment
     */
    am_end_total_balance_cents: number;
    /**
     * The amount in cents allocated to interest from this am payment
     */
    am_interest_cents: number;
    /**
     * The amount due just for the am schedule. This accounts for principal, interest, and
     * deferred interest balance but does not include fees.
     */
    am_min_pay_cents: number;
    /**
     * The amount in cents allocated to principal from this am payment
     */
    am_principal_cents: number;
    /**
     * The starting principal balance on the loan before this payment
     */
    am_start_principal_balance_cents?: number;
    /**
     * The starting balance on the loan before this payment
     */
    am_start_total_balance_cents: number;
    /**
     * The date-time the am cycle ends.
     */
    cycle_exclusive_end: string;
    /**
     * The ID of this generated amortization schedule.
     */
    line_item_id: number;
    /**
     * The date the minimum payment for the am schedule is due.
     */
    min_pay_due_at: string;
    /**
     * Indicates whether the amount for this am payment was paid on time; only present if the
     * date scheduled for the am payment has passed as of the time of the request.
     */
    paid_on_time?: boolean;
}
