// The configured minimum payment required for a given pay period.
type BasePolicyConfigMinPay struct {
	Percentage float64 `json:"percentage"`// The percentage of total balance calculated for min pay. (i.e. 20 means 20%)
}
