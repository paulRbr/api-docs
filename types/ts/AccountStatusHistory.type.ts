export interface AccountStatusHistory {
    /**
     * An array of information for all account status changes within the requested range.
     */
    results?: Result[];
}

export interface Result {
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
