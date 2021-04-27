// The Interest Policy Object
type InterestPolicy struct {
	DayCalcType      DayCalcType `json:"day_calc_type"`     // Affects the base calculation by determining how many days there are in a given year.
	InterestCalcTime string      `json:"interest_calc_time"`// Interest for this policy is calculated at this time every X interval.
	Method           Method      `json:"method"`            // The actual base formula used to calculate and assign interest.
	Type             Type        `json:"type"`              
}

// Affects the base calculation by determining how many days there are in a given year.
type DayCalcType string
const (
	The365 DayCalcType = "365"
)

// The actual base formula used to calculate and assign interest.
type Method string
const (
	AverageDailyBalance Method = "average daily balance"
)

type Type string
const (
	Compound Type = "compound"
)
