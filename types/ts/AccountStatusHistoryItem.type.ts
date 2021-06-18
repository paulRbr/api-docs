export interface AccountStatusHistoryItem {
    account_overview?: AccountOverview;
    /**
     * The `Date-Time` which the account status was changed.
     */
    changed_at?: string;
}

export interface AccountOverview {
    /**
     * The Status of the Account.
     */
    account_status: string;
    /**
     * The subtype of the Status of the Account.
     */
    account_substatus?: string;
}
