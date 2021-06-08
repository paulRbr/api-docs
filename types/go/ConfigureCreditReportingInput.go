type ConfigureCreditReportingInput struct {
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
