type AccountStatusHistory struct {
	Results []Result `json:"results,omitempty"`// An array of information for all account status changes within the requested range.
}

type Result struct {
	AccountOverview *AccountOverview `json:"account_overview,omitempty"`
	ChangedAt       *string          `json:"changed_at,omitempty"`      // The `Date-Time` which the account status was changed.
}

type AccountOverview struct {
	AccountStatus    string  `json:"account_status"`             // The Status of the Account.
	AccountSubstatus *string `json:"account_substatus,omitempty"`// The subtype of the Status of the Account.
}
