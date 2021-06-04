type Organization struct {
	Config               *Config              `json:"config,omitempty"`     // Configurations for API integrations within your organization.
	CreatedAt            string               `json:"created_at"`           // The `Date-Time` that this product was created on the server.
	OrganizationID       string               `json:"organization_id"`      // The Canopy-generated ID for the product.
	OrganizationOverview OrganizationOverview `json:"organization_overview"`// A series of static fields about the product.
}

// Configurations for API integrations within your organization.
type Config struct {
	CreditReporting  *CreditReporting  `json:"credit_reporting,omitempty"` 
	IssuerProcessor  *IssuerProcessor  `json:"issuer_processor,omitempty"` 
	PaymentProcessor *PaymentProcessor `json:"payment_processor,omitempty"`
}

type CreditReporting struct {
	EquifaxProgramIdentifier    *int64  `json:"equifax_program_identifier,omitempty"`   // If included, a metro2 report will be generated for your organization which uses this code; to report to Experian.
	ExperianProgramIdentifier   *int64  `json:"experian_program_identifier,omitempty"`  // If included, a metro2 report will be generated for your organization which uses this code; to report to Experian.
	ProgramDate                 *string `json:"program_date,omitempty"`                 // The date your program started reporting credit to the bureaus.
	ReporterAddressCity         *string `json:"reporter_address_city,omitempty"`        // Reporter address city.
	ReporterAddressLineOne      *string `json:"reporter_address_line_one,omitempty"`    // Reporter address line one.
	ReporterAddressLineTwo      *string `json:"reporter_address_line_two,omitempty"`    // Reporter address line two.
	ReporterAddressState        *string `json:"reporter_address_state,omitempty"`       // Reporter address state.
	ReporterAddressZip          *string `json:"reporter_address_zip,omitempty"`         // Reporter address, five digit zipcode or nine digit 'ZIP+4'.
	ReporterName                *string `json:"reporter_name,omitempty"`                // Your organization's name, as reporting to the credit bureaus.
	ReporterPhoneNumber         *string `json:"reporter_phone_number,omitempty"`        // Reporter's phone number in E.164 format.
	TransunionProgramIdentifier *int64  `json:"transunion_program_identifier,omitempty"`// If included, a metro2 report will be generated for your organization which uses this code; to report to TransUnion.
}

type IssuerProcessor struct {
	Name        *string `json:"name,omitempty"`         // The active issuer-processor for your organization.
	ValidAPIKey *bool   `json:"valid_api_key,omitempty"`// Indicates whether there is a valid API key configured for your issuer-processor.
}

type PaymentProcessor struct {
	Name        *string      `json:"name,omitempty"`        // The active payment processor for your organization.
	RepayConfig *RepayConfig `json:"repay_config,omitempty"`// Indicates the details for Repay configuration, if available, for your organization.
}

// Indicates the details for Repay configuration, if available, for your organization.
type RepayConfig struct {
	ValidMerchantID *bool `json:"valid_merchant_id,omitempty"`// Indicates whether a valid merchant ID has been configured for your organization. The; merchant ID itself is hidden from our response.
}

// A series of static fields about the product.
type OrganizationOverview struct {
	OrganizationName string  `json:"organization_name"`    // Name of Organization, i.e. LeverCard 3000.
	WebhookURL       *string `json:"webhook_url,omitempty"`// A URL to which events pertaining to your organization get posted
}
