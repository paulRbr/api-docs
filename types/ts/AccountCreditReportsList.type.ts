/**
 * Metro 2 credit report overview
 */
export interface AccountCreditReportsList {
    /**
     * The Canopy-generated ID for the account
     */
    account_id:               string;
    bureau_reports_included?: BureauReportsIncluded;
    /**
     * The Canopy-generated ID for the statement
     */
    credit_report_id: string;
    cycle_summary?:   CycleSummary;
}

export interface BureauReportsIncluded {
    /**
     * Indicates whether a Metro2 file to send to Equifax was generated as part of this report.
     * This is expected to be `true` if you have configured an Equifax Program Identifier for
     * your organization as of the time the report was generated.
     */
    equifax?: boolean;
    /**
     * Indicates whether a Metro2 file to send to Experian was generated as part of this report.
     * This is expected to be `true` if you have configured an Experian Program Identifier for
     * your organization as of the time the report was generated.
     */
    experian?: boolean;
    /**
     * Indicates whether a Metro2 file to send to TransUnion was generated as part of this
     * report. This is expected to be `true` if you have configured an TransUnion Program
     * Identifier for your organization as of the time the report was generated.
     */
    transunion?: boolean;
}

export interface CycleSummary {
    /**
     * The exclusive ending `Date-Time` that defines the cycle for which the report was
     * generated.
     */
    cycle_exclusive_end: string;
    /**
     * The inclusive starting `Date-Time` that defines the cycle for which the report was
     * generated.
     */
    cycle_inclusive_start: string;
}
