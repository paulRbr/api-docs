// Metro2 Credit Report for an account for a given billing cycle
type AccountCreditReport struct {
	AccountID                     string                   `json:"account_id"`                         // The Canopy-generated ID for the account
	AccountStatus                 AccountStatus            `json:"account_status"`                     // Contains the status code that properly identifies the current condition of the account as; of the Date of Account Information.
	AccountType                   AccountType              `json:"account_type"`                       // Report the specific code that identifies the account classification.
	ActivityDate                  *string                  `json:"activity_date,omitempty"`            // Signifies date of most recent update to accounts. If accounts are updated on different; dates, use most recent. A future date should not be reported.
	ActualPaymentAmount           int64                    `json:"actual_payment_amount"`              // Report the dollar amount of the monthly payment actually received for this reporting; period in whole dollars only.
	AmountPastDue                 int64                    `json:"amount_past_due"`                    // Report the total amount of payments that are 30 days or more past due in whole dollars; only.
	ComplianceConditionCode       *ComplianceConditionCode `json:"compliance_condition_code,omitempty"`// Allows the reporting of a condition that is required for legal compliance.
	ConsumerAccountNumber         string                   `json:"consumer_account_number"`            // The account_id for the individual reported. This is the canonical Canopy account id.
	ConsumerPrimary               ConsumerPrimary          `json:"consumer_primary"`                   
	CreditLimit                   int64                    `json:"credit_limit"`                       // Total amount (in truncated dollars) that the account can borrow.
	CreditReportID                string                   `json:"credit_report_id"`                   // The Canopy-generated ID for the statement
	CurrentBalance                int64                    `json:"current_balance"`                    // Report the outstanding current dollar balance on the account as of the Date of Account; Information.
	DateClosed                    *string                  `json:"date_closed,omitempty"`              // For all portfolio types, contains the date the account was closed to further purchases,; paid in full, transferred or sold.
	DateCreated                   string                   `json:"date_created"`                       // Contains the date the media was generated. A future date should not be reported.
	DateOfAccountInfo             string                   `json:"date_of_account_info"`               // Date of reporting.
	DateOpened                    string                   `json:"date_opened"`                        // Report the date the account was originally opened. Retain the original Date Opened; regardless of future activity, such as transfer, refinance, lost or stolen card, etc.
	FirstDelinquencyDate          *string                  `json:"first_delinquency_date,omitempty"`   // Indicates the first date of delinquency in a given cycle.
	HighestCredit                 int64                    `json:"highest_credit"`                     // If a revolving account, highest credit is the peak balance within the statement cycle. If; an installment account, it is the original loan amount.
	LastPaymentDate               *string                  `json:"last_payment_date,omitempty"`        // Report the date the most recent payment was received, whether full or partial payment is; made.
	OriginalChargeOffAmount       int64                    `json:"original_charge_off_amount"`         // For Status Codes 64 and 97 (all portfolio types), report the original amount charged to; loss, regardless of the declining balance. Whole dollars
	PaymentHistoryProfile         *string                  `json:"payment_history_profile,omitempty"`  // Contains up to 24 months of consecutive payment activity for the previous 24 reporting; periods prior to the Date of Account Information being reported.
	PaymentRating                 *PaymentRating           `json:"payment_rating,omitempty"`           // The Payment Rating contains a code that properly identifies whether the account was; current, past due, in collections or charged off prior to the status and within the; current month’s reporting period.
	PortfolioType                 PortfolioType            `json:"portfolio_type"`                     // Contains the one-character abbreviation for type of portfolio
	ProgramDate                   *string                  `json:"program_date,omitempty"`             // Contains the date your reporting format was developed.
	ProgramRevisionDate           *string                  `json:"program_revision_date,omitempty"`    // Contains the last date your reporting format was revised.
	ReportEquifax                 *string                  `json:"report_equifax,omitempty"`           // Equifax Metro2 credit report
	ReportExperian                *string                  `json:"report_experian,omitempty"`          // Experian Metro2 credit report
	ReportTransunion              *string                  `json:"report_transunion,omitempty"`        // Transunion Metro2 credit report
	ReporterAddress               *string                  `json:"reporter_address,omitempty"`         // Contains the complete mailing address of the processing company; i.e., street address,; city, state and zip code.
	ReporterName                  *string                  `json:"reporter_name,omitempty"`            // Contains the name of the processing company sending the data; i.e., data furnisher or; processor.
	ReporterTelephoneNumber       *string                  `json:"reporter_telephone_number,omitempty"`// Contains the telephone number (Area Code + number) of the company sending the data; i.e.,; data furnisher or processor.
	ScheduledMonthlyPaymentAmount int64                    `json:"scheduled_monthly_payment_amount"`   // Report the dollar amount of the scheduled monthly payment due for this reporting period,; whether principal, interest only or a combination of the two.
	SpecialCommentCode            *SpecialCommentCode      `json:"special_comment_code,omitempty"`     // Used in conjunction with Account Status and Payment Rating to further define the account; (e.g., closed accounts or adjustments pending).
	TermsDuration                 string                   `json:"terms_duration"`                     // Contains the duration of credit extended, or LOC if revolving account
	TermsFrequency                TermsFrequency           `json:"terms_frequency"`                    // Report the frequency for payments due.
}

type ConsumerPrimary struct {
	AddressCity           string   `json:"address_city"`                     // Address city.
	AddressLineOne        string   `json:"address_line_one"`                 // Address line one.
	AddressLineTwo        *string  `json:"address_line_two,omitempty"`       // Address line two.
	AddressState          string   `json:"address_state"`                    // Address state.
	AddressZip            string   `json:"address_zip"`                      // Five digit zipcode or nine digit 'ZIP+4'
	ConsumerIndicatorCode *string  `json:"consumer_indicator_code,omitempty"`// Contains a value that indicates a special condition of the account that applies to the; associated consumer.
	DateOfBirth           string   `json:"date_of_birth"`                    // Customer's date of birth in ISO 8601 format
	EcoaCode              EcoaCode `json:"ecoa_code"`                        // Defines the relationship of the primary consumer to the account and designates the; account as joint, individual, etc., in compliance with the Equal Credit Opportunity Act.
	NameFirst             string   `json:"name_first"`                       // Customer's first name. Primary account holder or controlling officer name for Business; customers.
	NameLast              string   `json:"name_last"`                        // Customer's last name. Primary account holder or controlling officer name for Business; customers.
	NameMiddle            *string  `json:"name_middle,omitempty"`            // Customer's middle name. Primary account holder or controlling officer name for Business; customers.
	NameSuffix            *string  `json:"name_suffix,omitempty"`            // Suffix to the customer's name
	PhoneNumber           *string  `json:"phone_number,omitempty"`           // Customer's phone number in E.164 format
	Ssn                   *string  `json:"ssn,omitempty"`                    // Social security number of the customer
}

// Contains the status code that properly identifies the current condition of the account as
// of the Date of Account Information.
type AccountStatus string
const (
	Df AccountStatus = "DF"
	The11 AccountStatus = "11"
	The13 AccountStatus = "13"
	The64 AccountStatus = "64"
	The71 AccountStatus = "71"
	The78 AccountStatus = "78"
	The80 AccountStatus = "80"
	The82 AccountStatus = "82"
	The83 AccountStatus = "83"
	The84 AccountStatus = "84"
	The97 AccountStatus = "97"
)

// Report the specific code that identifies the account classification.
type AccountType string
const (
	The01 AccountType = "01"
	The15 AccountType = "15"
	The18 AccountType = "18"
)

// Allows the reporting of a condition that is required for legal compliance.
type ComplianceConditionCode string
const (
	Xa ComplianceConditionCode = "XA"
)

// Defines the relationship of the primary consumer to the account and designates the
// account as joint, individual, etc., in compliance with the Equal Credit Opportunity Act.
type EcoaCode string
const (
	EcoaCode1 EcoaCode = "1"
	EcoaCode2 EcoaCode = "2"
	EcoaCode3 EcoaCode = "3"
	EcoaCode5 EcoaCode = "5"
	EcoaCodeT EcoaCode = "T"
	EcoaCodeW EcoaCode = "W"
	The7 EcoaCode = "7"
	X EcoaCode = "X"
	Z EcoaCode = "Z"
)

// The Payment Rating contains a code that properly identifies whether the account was
// current, past due, in collections or charged off prior to the status and within the
// current month’s reporting period.
type PaymentRating string
const (
	G PaymentRating = "G"
	PaymentRating1 PaymentRating = "1"
	PaymentRating2 PaymentRating = "2"
	PaymentRating3 PaymentRating = "3"
	PaymentRating5 PaymentRating = "5"
	PaymentRatingL PaymentRating = "L"
	The0 PaymentRating = "0"
	The4 PaymentRating = "4"
	The6 PaymentRating = "6"
)

// Contains the one-character abbreviation for type of portfolio
type PortfolioType string
const (
	C PortfolioType = "C"
	I PortfolioType = "I"
	O PortfolioType = "O"
	PortfolioTypeM PortfolioType = "M"
	R PortfolioType = "R"
)

// Used in conjunction with Account Status and Payment Rating to further define the account
// (e.g., closed accounts or adjustments pending).
type SpecialCommentCode string
const (
	Ap SpecialCommentCode = "AP"
	Au SpecialCommentCode = "AU"
	SpecialCommentCodeM SpecialCommentCode = "M"
)

// Report the frequency for payments due.
type TermsFrequency string
const (
	B TermsFrequency = "B"
	E TermsFrequency = "E"
	P TermsFrequency = "P"
	Q TermsFrequency = "Q"
	S TermsFrequency = "S"
	TermsFrequencyL TermsFrequency = "L"
	TermsFrequencyM TermsFrequency = "M"
	TermsFrequencyT TermsFrequency = "T"
	TermsFrequencyW TermsFrequency = "W"
	Y TermsFrequency = "Y"
)
