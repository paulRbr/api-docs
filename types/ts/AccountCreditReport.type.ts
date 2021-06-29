/**
 * Metro2 Credit Report for an account for a given billing cycle
 */
export interface AccountCreditReport {
    /**
     * The Canopy-generated ID for the account
     */
    account_id: string;
    /**
     * Contains the status code that properly identifies the current condition of the account as
     * of the Date of Account Information.
     */
    account_status: AccountStatus;
    /**
     * Report the specific code that identifies the account classification.
     */
    account_type: AccountType;
    /**
     * Signifies date of most recent update to accounts. If accounts are updated on different
     * dates, use most recent. A future date should not be reported.
     */
    activity_date?: string;
    /**
     * Report the dollar amount of the monthly payment actually received for this reporting
     * period in whole dollars only.
     */
    actual_payment_amount: number;
    /**
     * Report the total amount of payments that are 30 days or more past due in whole dollars
     * only.
     */
    amount_past_due: number;
    /**
     * Allows the reporting of a condition that is required for legal compliance.
     */
    compliance_condition_code?: ComplianceConditionCode;
    /**
     * The account_id for the individual reported. This is the canonical Canopy account id.
     */
    consumer_account_number: string;
    consumer_primary:        ConsumerPrimary;
    /**
     * Total amount (in truncated dollars) that the account can borrow.
     */
    credit_limit: number;
    /**
     * The Canopy-generated ID for the statement
     */
    credit_report_id: string;
    /**
     * Report the outstanding current dollar balance on the account as of the Date of Account
     * Information.
     */
    current_balance: number;
    /**
     * For all portfolio types, contains the date the account was closed to further purchases,
     * paid in full, transferred or sold.
     */
    date_closed?: string;
    /**
     * Contains the date the media was generated. A future date should not be reported.
     */
    date_created: string;
    /**
     * Date of reporting.
     */
    date_of_account_info: string;
    /**
     * Report the date the account was originally opened. Retain the original Date Opened
     * regardless of future activity, such as transfer, refinance, lost or stolen card, etc.
     */
    date_opened: string;
    /**
     * Indicates the first date of delinquency in a given cycle.
     */
    first_delinquency_date?: string;
    /**
     * If a revolving account, highest credit is the peak balance within the statement cycle. If
     * an installment account, it is the original loan amount.
     */
    highest_credit: number;
    /**
     * Report the date the most recent payment was received, whether full or partial payment is
     * made.
     */
    last_payment_date?: string;
    /**
     * For Status Codes 64 and 97 (all portfolio types), report the original amount charged to
     * loss, regardless of the declining balance. Whole dollars
     */
    original_charge_off_amount: number;
    /**
     * Contains up to 24 months of consecutive payment activity for the previous 24 reporting
     * periods prior to the Date of Account Information being reported.
     */
    payment_history_profile?: string;
    /**
     * The Payment Rating contains a code that properly identifies whether the account was
     * current, past due, in collections or charged off prior to the status and within the
     * current month’s reporting period.
     */
    payment_rating?: PaymentRating;
    /**
     * Contains the one-character abbreviation for type of portfolio
     */
    portfolio_type: PortfolioType;
    /**
     * Contains the date your reporting format was developed.
     */
    program_date?: string;
    /**
     * Contains the last date your reporting format was revised.
     */
    program_revision_date?: string;
    /**
     * Equifax Metro2 credit report
     */
    report_equifax?: string;
    /**
     * Experian Metro2 credit report
     */
    report_experian?: string;
    /**
     * Transunion Metro2 credit report
     */
    report_transunion?: string;
    /**
     * Contains the complete mailing address of the processing company; i.e., street address,
     * city, state and zip code.
     */
    reporter_address?: string;
    /**
     * Contains the name of the processing company sending the data; i.e., data furnisher or
     * processor.
     */
    reporter_name?: string;
    /**
     * Contains the telephone number (Area Code + number) of the company sending the data; i.e.,
     * data furnisher or processor.
     */
    reporter_telephone_number?: string;
    /**
     * Report the dollar amount of the scheduled monthly payment due for this reporting period,
     * whether principal, interest only or a combination of the two.
     */
    scheduled_monthly_payment_amount: number;
    /**
     * Used in conjunction with Account Status and Payment Rating to further define the account
     * (e.g., closed accounts or adjustments pending).
     */
    special_comment_code?: SpecialCommentCode;
    /**
     * Contains the duration of credit extended, or LOC if revolving account
     */
    terms_duration: string;
    /**
     * Report the frequency for payments due.
     */
    terms_frequency: TermsFrequency;
}

/**
 * Contains the status code that properly identifies the current condition of the account as
 * of the Date of Account Information.
 */
export type AccountStatus = 
    "DF" | 
    "11" | 
    "13" | 
    "64" | 
    "71" | 
    "78" | 
    "80" | 
    "82" | 
    "83" | 
    "84" | 
    "97";

/**
 * Report the specific code that identifies the account classification.
 */
export type AccountType = 
    "01" | 
    "15" | 
    "18";

/**
 * Allows the reporting of a condition that is required for legal compliance.
 */
export type ComplianceConditionCode = 
    "XA";

export interface ConsumerPrimary {
    /**
     * Address city.
     */
    address_city: string;
    /**
     * Address line one.
     */
    address_line_one: string;
    /**
     * Address line two.
     */
    address_line_two?: string;
    /**
     * Address state.
     */
    address_state: string;
    /**
     * Five digit zipcode or nine digit 'ZIP+4'
     */
    address_zip: string;
    /**
     * Contains a value that indicates a special condition of the account that applies to the
     * associated consumer.
     */
    consumer_indicator_code?: string;
    /**
     * Customer's date of birth in ISO 8601 format
     */
    date_of_birth: string;
    /**
     * Defines the relationship of the primary consumer to the account and designates the
     * account as joint, individual, etc., in compliance with the Equal Credit Opportunity Act.
     */
    ecoa_code: EcoaCode;
    /**
     * Customer's first name. Primary account holder or controlling officer name for Business
     * customers.
     */
    name_first: string;
    /**
     * Customer's last name. Primary account holder or controlling officer name for Business
     * customers.
     */
    name_last: string;
    /**
     * Customer's middle name. Primary account holder or controlling officer name for Business
     * customers.
     */
    name_middle?: string;
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

/**
 * Defines the relationship of the primary consumer to the account and designates the
 * account as joint, individual, etc., in compliance with the Equal Credit Opportunity Act.
 */
export type EcoaCode = 
    "T" | 
    "1" | 
    "2" | 
    "3" | 
    "5" | 
    "7" | 
    "W" | 
    "X" | 
    "Z";

/**
 * The Payment Rating contains a code that properly identifies whether the account was
 * current, past due, in collections or charged off prior to the status and within the
 * current month’s reporting period.
 */
export type PaymentRating = 
    "G" | 
    "L" | 
    "0" | 
    "1" | 
    "2" | 
    "3" | 
    "4" | 
    "5" | 
    "6";

/**
 * Contains the one-character abbreviation for type of portfolio
 */
export type PortfolioType = 
    "C" | 
    "I" | 
    "M" | 
    "O" | 
    "R";

/**
 * Used in conjunction with Account Status and Payment Rating to further define the account
 * (e.g., closed accounts or adjustments pending).
 */
export type SpecialCommentCode = 
    "AP" | 
    "AU" | 
    "M";

/**
 * Report the frequency for payments due.
 */
export type TermsFrequency = 
    "B" | 
    "E" | 
    "L" | 
    "M" | 
    "P" | 
    "Q" | 
    "S" | 
    "T" | 
    "W" | 
    "Y";
