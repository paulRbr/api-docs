// Metro 2 credit report overview
type AccountCreditReportsList struct {
	AccountID             string                 `json:"account_id"`                       // The Canopy-generated ID for the account
	BureauReportsIncluded *BureauReportsIncluded `json:"bureau_reports_included,omitempty"`
	CreditReportID        string                 `json:"credit_report_id"`                 // The Canopy-generated ID for the statement
	CycleSummary          *CycleSummary          `json:"cycle_summary,omitempty"`          
}

type BureauReportsIncluded struct {
	Equifax    *bool `json:"equifax,omitempty"`   // Indicates whether a Metro2 file to send to Equifax was generated as part of this report.; This is expected to be `true` if you have configured an Equifax Program Identifier for; your organization as of the time the report was generated.
	Experian   *bool `json:"experian,omitempty"`  // Indicates whether a Metro2 file to send to Experian was generated as part of this report.; This is expected to be `true` if you have configured an Experian Program Identifier for; your organization as of the time the report was generated.
	Transunion *bool `json:"transunion,omitempty"`// Indicates whether a Metro2 file to send to TransUnion was generated as part of this; report. This is expected to be `true` if you have configured an TransUnion Program; Identifier for your organization as of the time the report was generated.
}

type CycleSummary struct {
	CycleExclusiveEnd   string `json:"cycle_exclusive_end"`  // The exclusive ending `Date-Time` that defines the cycle for which the report was; generated.
	CycleInclusiveStart string `json:"cycle_inclusive_start"`// The inclusive starting `Date-Time` that defines the cycle for which the report was; generated.
}
