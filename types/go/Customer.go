type Customer struct {
	AddressCity     *string          `json:"address_city,omitempty"`    // Address city.
	AddressLineOne  *string          `json:"address_line_one,omitempty"`// Address line one.
	AddressLineTwo  *string          `json:"address_line_two,omitempty"`// Address line two.
	AddressState    *string          `json:"address_state,omitempty"`   // Address state.
	AddressZip      *string          `json:"address_zip,omitempty"`     // Five digit zipcode or nine digit 'ZIP+4'
	BusinessDetails *BusinessDetails `json:"business_details,omitempty"`
	CustomerID      string           `json:"customer_id"`               // A Canopy-generated ID for the customer.
	DateOfBirth     *string          `json:"date_of_birth,omitempty"`   // Customer's date of birth in ISO 8601 format
	Email           *string          `json:"email,omitempty"`           // The email address of this Customer
	NameFirst       *string          `json:"name_first,omitempty"`      // Customer's first name. Primary account holder or controlling officer name for Business; customers.
	NameLast        *string          `json:"name_last,omitempty"`       // Customer's last name. Primary account holder or controlling officer name for Business; customers.
	NameMiddle      *string          `json:"name_middle,omitempty"`     // Customer's middle name. Primary account holder or controlling officer name for Business; customers.
	NamePrefix      *string          `json:"name_prefix,omitempty"`     // Prefix to the customer's name. Primary account holder or controlling officer name for; Business customers.
	NameSuffix      *string          `json:"name_suffix,omitempty"`     // Suffix to the customer's name
	PhoneNumber     *string          `json:"phone_number,omitempty"`    // Customer's phone number in E.164 format
	Ssn             *string          `json:"ssn,omitempty"`             // Social security number of the customer
}

type BusinessDetails struct {
	BusinessEin       *string `json:"business_ein,omitempty"`       // EIN of the business
	BusinessLegalName *string `json:"business_legal_name,omitempty"`// The legal name of the Business
	DoingBusinessAs   *string `json:"doing_business_as,omitempty"`  // The DBA name of the Business
}
