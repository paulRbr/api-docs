export interface Organization {
    /**
     * Configurations for API integrations within your organization.
     */
    config?: Config;
    /**
     * The `Date-Time` that this product was created on the server.
     */
    created_at: string;
    /**
     * The Canopy-generated ID for the product.
     */
    organization_id: string;
    /**
     * A series of static fields about the product.
     */
    organization_overview: OrganizationOverview;
}

/**
 * Configurations for API integrations within your organization.
 */
export interface Config {
    credit_reporting?:  CreditReporting;
    issuer_processor?:  IssuerProcessor;
    payment_processor?: PaymentProcessor;
}

export interface CreditReporting {
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

export interface IssuerProcessor {
    /**
     * The active issuer-processor for your organization.
     */
    name?: string;
    /**
     * Indicates whether there is a valid API key configured for your issuer-processor.
     */
    valid_api_key?: boolean;
}

export interface PaymentProcessor {
    /**
     * The active payment processor for your organization.
     */
    name?: string;
    /**
     * Indicates the details for Repay configuration, if available, for your organization.
     */
    repay_config?: RepayConfig;
}

/**
 * Indicates the details for Repay configuration, if available, for your organization.
 */
export interface RepayConfig {
    /**
     * Indicates whether a valid merchant ID has been configured for your organization. The
     * merchant ID itself is hidden from our response.
     */
    valid_merchant_id?: boolean;
}

/**
 * A series of static fields about the product.
 */
export interface OrganizationOverview {
    /**
     * Name of Organization, i.e. LeverCard 3000.
     */
    organization_name: string;
    /**
     * A URL to which events pertaining to your organization get posted
     */
    webhook_url?: string;
}
