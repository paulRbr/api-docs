export interface CreatePaymentInput {
    /**
     * The `Date-Time` that the payment is applicable to the account. Although the payment is
     * created in Canopy today, it can actually be effective 10 days prior.
     */
    effective_at?: string;
    /**
     * External fields can be used to relate payments created in Canopy to entities in your or
     * any external system.
     */
    external_fields?: ExternalField[];
    /**
     * The payment amount in cents.
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
