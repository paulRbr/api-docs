/**
 * Statement for an account for a given billing cycle
 */
export interface AccountStatementSummary {
    /**
     * The Canopy-generated ID for the account
     */
    account_id:       string;
    balance_summary?: BalanceSummary;
    cycle_summary?:   CycleSummary;
    /**
     * The `Date-Time` you would like the system to return the data as of. IE tell me what the
     * account information was as if I had asked on `2020-10-20 00:00:00 EST`. If empty it
     * defaults to current time.
     */
    effective_as_of_date: string;
    min_pay_due_cents?:   MinPayDueCents;
    /**
     * The Canopy-generated ID for the statement
     */
    statement_id: string;
}

export interface BalanceSummary {
    /**
     * The total balance (in cents) associated with the account.
     */
    total_balance_cents: number;
}

export interface CycleSummary {
    /**
     * The inclusive ending `Date-Time` that defines which transations are part of this
     * statement.
     */
    cycle_exclusive_end: string;
    /**
     * The inclusive starting `Date-Time` that defines which transations are part of this
     * statement.
     */
    cycle_inclusive_start: string;
}

export interface MinPayDueCents {
    /**
     * Total amount due for the billing cycle, summing cycle principal, interest, deferred
     * interest, and fees outstanding.
     */
    min_pay_cents: number;
    /**
     * The `Date-Time` the payment for this billing cycle is due.
     */
    min_pay_due_at: string;
}
