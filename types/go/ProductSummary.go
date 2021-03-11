// Summary of product information
type ProductSummary struct {
	AccountsOverview *AccountsOverview `json:"accounts_overview,omitempty"`
}

type AccountsOverview struct {
	AccountCountTotal int64 `json:"account_count_total"`// Total number of accounts under the product.
}
