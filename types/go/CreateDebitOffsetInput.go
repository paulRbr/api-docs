type CreateDebitOffsetInput struct {
	EffectiveAt         *string         `json:"effective_at,omitempty"`   // The `Date-Time` that the debit offset is applicable to the account. Although the debit; offset is created in Canopy today, it can actually be effective as of a date in the past.; This should only be used for data migrations.
	ExternalFields      []ExternalField `json:"external_fields,omitempty"`// External fields can be used to relate debit offsets created in Canopy to entities in your; or any external system.
	OriginalAmountCents int64           `json:"original_amount_cents"`    // The payment amount in cents.
}

type ExternalField struct {
	Key   *string `json:"key,omitempty"`  // Key - i.e. Name of the External Party
	Value *string `json:"value,omitempty"`// Value - i.e. External Account ID
}
