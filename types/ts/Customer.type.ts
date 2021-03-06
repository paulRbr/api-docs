export interface Customer {
    /**
     * Address city.
     */
    address_city?: string;
    /**
     * Address line one.
     */
    address_line_one?: string;
    /**
     * Address line two.
     */
    address_line_two?: string;
    /**
     * Address state.
     */
    address_state?: string;
    /**
     * Five digit zipcode or nine digit 'ZIP+4'
     */
    address_zip?:      string;
    business_details?: BusinessDetails;
    /**
     * A Canopy-generated ID for the customer.
     */
    customer_id: string;
    /**
     * Customer's date of birth in ISO 8601 format
     */
    date_of_birth?: string;
    /**
     * The email address of this Customer
     */
    email?: string;
    /**
     * Customer's first name. Primary account holder or controlling officer name for Business
     * customers.
     */
    name_first?: string;
    /**
     * Customer's last name. Primary account holder or controlling officer name for Business
     * customers.
     */
    name_last?: string;
    /**
     * Customer's middle name. Primary account holder or controlling officer name for Business
     * customers.
     */
    name_middle?: string;
    /**
     * Prefix to the customer's name. Primary account holder or controlling officer name for
     * Business customers.
     */
    name_prefix?: string;
    /**
     * Suffix to the customer's name
     */
    name_suffix?: string;
    /**
     * Customer's phone number in E.164 format
     */
    phone_number?: string;
    /**
     * Social security number of the customer
     */
    ssn?: string;
}

export interface BusinessDetails {
    /**
     * EIN of the business
     */
    business_ein?: string;
    /**
     * The legal name of the Business
     */
    business_legal_name?: string;
    /**
     * The DBA name of the Business
     */
    doing_business_as?: string;
}
