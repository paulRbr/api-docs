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
    issuer_processor?:  IssuerProcessor;
    payment_processor?: PaymentProcessor;
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
