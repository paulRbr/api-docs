type AccountStatusHistoryItem struct {
	AccountOverview *AccountOverview `json:"account_overview,omitempty"`
	ChangedAt       *string          `json:"changed_at,omitempty"`      // The `Date-Time` which the account status was changed.
}

type AccountOverview struct {
	AccountStatus    string  `json:"account_status"`             // The Status of the Account.
	AccountSubstatus *string `json:"account_substatus,omitempty"`// The subtype of the Status of the Account.
}
