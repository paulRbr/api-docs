/**
 * Statements for the account.
 */
export interface StatementsList {
    /**
     * The Canopy-generated ID for the account
     */
    account_id?: string;
    /**
     * An array of statements included in the billing cycle.
     */
    statements_list?: StatementsListElement[];
}

export interface StatementsListElement {
    /**
     * The total available credit balance (in cents) for the account.
     */
    available_credit_balance?: number;
    /**
     * The inclusive ending `Date-Time` that defines which transactions are part of this
     * statement.
     */
    billing_cycle_end_date?: string;
    /**
     * The inclusive starting `Date-Time` that defines which transactions are part of this
     * statement.
     */
    billing_cycle_start_date?: string;
    /**
     * The minimum amount (in cents) due for this statement.
     */
    min_pay_amount_cents?: number;
    /**
     * The `Date-Time` at which the minimum payment is due.
     */
    min_pay_due_date?: string;
    /**
     * A Canopy-generated ID for the statement
     */
    statement_id?: string;
    /**
     * The total balance (in cents) associated with the account.
     */
    total_balance?: number;
}
