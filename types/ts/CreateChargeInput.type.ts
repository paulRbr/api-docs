export interface CreateChargeInput {
    /**
     * The `Date-Time` that the charge is made applicable to the account. Although a charge may
     * be made today, it can be set effective 10 days prior.
     */
    effective_at?: string;
    /**
     * External fields can be used to associate this record to entities in external systems.
     */
    external_fields?:           ExternalField[];
    issuer_processor_metadata?: IssuerProcessorMetadata;
    /**
     * The status of a line item.
     */
    line_item_status?: LineItemStatus;
    merchant_data:     MerchantData;
    /**
     * The amount charged (in cents).
     */
    original_amount_cents: number;
}

export interface ExternalField {
    /**
     * Key - i.e. Name of the External Party
     */
    key?: string;
    /**
     * Value - i.e. External Account ID
     */
    value?: string;
}

export interface IssuerProcessorMetadata {
    lithic?: Lithic;
}

export interface Lithic {
    /**
     * Last four digits of the card against which the spend was made.
     */
    last_four?: string;
}

/**
 * The status of a line item.
 */
export type LineItemStatus = 
    "AUTHORIZED" | 
    "DECLINED" | 
    "INVALID" | 
    "OFFSET" | 
    "PENDING" | 
    "POSTED" | 
    "VALID" | 
    "VOID";

export interface MerchantData {
    id?:           string;
    mcc_code?:     number;
    name?:         string;
    phone_number?: string;
}
