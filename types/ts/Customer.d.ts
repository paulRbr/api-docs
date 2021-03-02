export interface Customer {
    /**
     * Address city
     */
    address_city?: string;
    /**
     * Address line one
     */
    address_line_one?: string;
    /**
     * Address line two
     */
    address_line_two?: string;
    /**
     * Address state
     */
    address_state?: string;
    /**
     * Five digit zipcode or nine digit 'ZIP+4'
     */
    address_zip?: string;
    /**
     * A Canopy-generated unique ID for the customer
     */
    customer_id: number;
    /**
     * Customer's date of birth in ISO 8601 format
     */
    date_of_birth?: string;
    /**
     * The email address of this Customer
     */
    email?: string;
    /**
     * Customer's first name
     */
    name_first?: string;
    /**
     * Customer's last name
     */
    name_last?: string;
    /**
     * Customer's middle name
     */
    name_middle?: string;
    /**
     * Prefix to the customer's name
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
