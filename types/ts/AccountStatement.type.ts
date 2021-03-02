/**
 * Statement for an account for a given billing cycle
 */
export interface AccountStatement {
    /**
     * The Canopy-generated ID for the account
     */
    account_id:                  number;
    account_overview?:           AccountOverview;
    additional_min_pay_details?: AdditionalMinPayDetails;
    balance_summary?:            BalanceSummary;
    cycle_summary?:              CycleSummary;
    /**
     * The `Date-Time` you would like the system to return the data as of. IE tell me what the
     * account information was as if I had asked on `2020-10-20 00:00:00 EST`. If empty it
     * defaults to current time.
     */
    effective_as_of_date: string;
    min_pay_due?:         MinPayDue;
    open_to_buy?:         OpenToBuy;
    payoff?:              Payoff;
    /**
     * The Canopy-generated ID for the statement
     */
    statement_id: number;
}

export interface AccountOverview {
    /**
     * The Status of the Account. Active upon account creation.
     */
    account_status?: string;
    /**
     * The subtype of the Status of the Account. Null upon account creation.
     */
    account_status_subtype?: string;
    /**
     * If applicable, the `Date-Time` the promo period for the account ends.
     */
    promo_exclusive_end?: string;
    /**
     * If applicable, the `Date-Time` the promo period for the account starts.
     */
    promo_inclusive_start?: string;
    /**
     * If applicable, the `Date-Time` the purchase window for the account ends.
     */
    promo_purchase_window_exclusive_end?: string;
    /**
     * If applicable, the `Date-Time` the purchase window for the account ends.
     */
    promo_purchase_window_inclusive_start?: string;
}

export interface AdditionalMinPayDetails {
    /**
     * The current AM deferred interest balance of the line item. Canopy tracks deferred
     * interest during an amortization period separately from deferred interest accrued during a
     * revolving period.
     */
    min_pay_am_deferred_interest_cents?: number;
    /**
     * Total am interest due for the billing cycle.
     */
    min_pay_am_interest_cents?: number;
    /**
     * Total principal due for the billing cycle.
     */
    min_pay_charges_principal_cents: number;
    /**
     * Total deferred interest due for the billing cycle.
     */
    min_pay_deferred_cents: number;
    /**
     * Total fees due for the billing cycle.
     */
    min_pay_fees_cents: number;
    /**
     * Total interest due for the billing cycle.
     */
    min_pay_interest_cents: number;
    /**
     * Previous amounts due, including fees. This is a subset of min_pay_cents.
     */
    previous_min_pay_cents: number;
}

export interface BalanceSummary {
    /**
     * The total deferred interest balance (in cents) associated with the account.
     */
    am_deferred_interest_balance_cents?: number;
    /**
     * Total AM interest balance for the account.
     */
    am_interest_balance_cents?: number;
    /**
     * Total principal balance for the account.
     */
    charges_principal_cents?: number;
    /**
     * Total deferred interest balance for the account.
     */
    deferred_interest_balance_cents?: number;
    /**
     * Total fee balance for the account.
     */
    fees_balance_cents?: number;
    /**
     * Total interest balance for the account.
     */
    interest_balance_cents?: number;
    /**
     * Total principal balance for loans for the account.
     */
    loans_principal_cents?: number;
    /**
     * The total balance (in cents) associated with the account.
     */
    total_balance_cents?: number;
}

export interface CycleSummary {
    /**
     * Total interest accrued during the billing cycle. Canopy tracks deferred interest during
     * an amortization period separately from deferred interest accrued during a revolving
     * period.
     */
    cycle_am_deferred_interest_cents?: number;
    /**
     * The current AM interest balance of the line item. Canopy tracks interest during an
     * amortization period separately from deferred interest accrued during a revolving period.
     */
    cycle_am_interest_cents?: number;
    /**
     * Sum of all returns that occurred on the account during the billing cycle.
     */
    cycle_charge_returns_cents?: number;
    /**
     * Sum of all charges that occurred on the account during the billing cycle.
     */
    cycle_charges_cents?: number;
    /**
     * Sum of all credit adjustment amounts that occurred on the account during the billing
     * cycle.
     */
    cycle_credit_adjustments_cents?: number;
    /**
     * Sum of all debit adjustment amounts that occurred on the account during the billing cycle.
     */
    cycle_debit_adjustments_cents?: number;
    /**
     * Total interest accrued during the billing cycle.
     */
    cycle_deferred_interest_cents?: number;
    /**
     * The inclusive ending `Date-Time` that defines which transations are part of this
     * statement.
     */
    cycle_exclusive_end?: string;
    /**
     * The inclusive starting `Date-Time` that defines which transations are part of this
     * statement.
     */
    cycle_inclusive_start?: string;
    /**
     * Total interest accrued during the billing cycle.
     */
    cycle_interest_cents?: number;
    /**
     * Total late fees incurred during the billing cycle.
     */
    cycle_late_fees_cents?: number;
    /**
     * Sum of all loans amounts that were initiated on the account during the billing cycle.
     */
    cycle_loans_cents?: number;
    /**
     * Sum of all payment reversal amounts that occurred on the account during the billing cycle.
     */
    cycle_payment_reversals_cents?: number;
    /**
     * Total payment reversal fees incurred during the billing cycle.
     */
    cycle_payment_reversals_fees_cents?: number;
    /**
     * Sum of all payments that occurred on the account during the billing cycle.
     */
    cycle_payments_cents?: number;
    /**
     * Total deferred interest that was forgiven on the account during the billing cycle.
     */
    cycle_waived_deferred_interest_cents?: number;
}

export interface MinPayDue {
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

export interface OpenToBuy {
    /**
     * The total available credit balance (in cents) for the account.
     */
    available_credit_cents?: number;
    /**
     * Total Amount (in cents) that this account can borrow.
     */
    credit_limit_cents?: number;
    /**
     * If applicable, the total amount of available funds for continued purchase following a
     * purchase window pattern, where payments made do not replenish amount available for
     * purchase.
     */
    open_to_buy_cents?: number;
    /**
     * Sum of all charges that occurred on the account since account origination.
     */
    total_charges_cents?: number;
}

export interface Payoff {
    /**
     * The total amount slated to pay off the account over the lifecycle of the loan.
     */
    expected_remaining_payment_amount_cents?: number;
    /**
     * The total amount needed to pay off the loan at this exact moment.
     */
    total_payoff_cents?: number;
}
