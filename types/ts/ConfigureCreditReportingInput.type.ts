export interface ConfigureCreditReportingInput {
    /**
     * If included, a metro2 report will be generated for your organization which uses this code
     * to report to Experian.
     */
    equifax_program_identifier?: number;
    /**
     * If included, a metro2 report will be generated for your organization which uses this code
     * to report to Experian.
     */
    experian_program_identifier?: number;
    /**
     * The date your program started reporting credit to the bureaus.
     */
    program_date?: string;
    /**
     * Reporter address city.
     */
    reporter_address_city?: string;
    /**
     * Reporter address line one.
     */
    reporter_address_line_one?: string;
    /**
     * Reporter address line two.
     */
    reporter_address_line_two?: string;
    /**
     * Reporter address state.
     */
    reporter_address_state?: string;
    /**
     * Reporter address, five digit zipcode or nine digit 'ZIP+4'.
     */
    reporter_address_zip?: string;
    /**
     * Your organization's name, as reporting to the credit bureaus.
     */
    reporter_name?: string;
    /**
     * Reporter's phone number in E.164 format.
     */
    reporter_phone_number?: string;
    /**
     * If included, a metro2 report will be generated for your organization which uses this code
     * to report to TransUnion.
     */
    transunion_program_identifier?: number;
}
