export interface CreateDebitOffsetInput {
    /**
     * The `Date-Time` that the debit offset is applicable to the account. Although the debit
     * offset is created in Canopy today, it can actually be effective as of a date in the past.
     * This should only be used for data migrations.
     */
    effective_at?: string;
    /**
     * External fields can be used to relate debit offsets created in Canopy to entities in your
     * or any external system.
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
