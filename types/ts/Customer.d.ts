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
   * Address zip code
   */
  address_zip?: string;
  /**
   * A Canopy-generated unique ID for the customer
   */
  customer_id: number;
  /**
   * Customer's date of birth
   */
  date_of_birth?: Date;
  /**
   * The email address of this customer
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
   * Prefix to the customer's name
   */
  name_suffix?: string;
  /**
   * Phone number of the customer
   */
  phone_number?: string;
  /**
   * Social security number of the customer
   */
  ssn?: string;
}
