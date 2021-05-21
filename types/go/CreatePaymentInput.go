type CreatePaymentInput struct {
	EffectiveAt         *string         `json:"effective_at,omitempty"`   // The `Date-Time` that the payment is applicable to the account. Although the payment is; created in Canopy today, it can actually be effective 10 days prior.
	ExternalFields      []ExternalField `json:"external_fields,omitempty"`// External fields can be used to relate payments created in Canopy to entities in your or; any external system.
	OriginalAmountCents int64           `json:"original_amount_cents"`    // The payment amount in cents.
}

type ExternalField struct {
	Key   *string `json:"key,omitempty"`  // Key - i.e. Name of the External Party
	Value *string `json:"value,omitempty"`// Value - i.e. External Account ID
}
