type CreateChargeInput struct {
	EffectiveAt             *string                  `json:"effective_at,omitempty"`             // The `Date-Time` that the charge is made applicable to the account. Although a charge may; be made today, it can be set effective 10 days prior.
	ExternalFields          []ExternalField          `json:"external_fields,omitempty"`          // External fields can be used to associate this record to entities in external systems.
	IssuerProcessorMetadata *IssuerProcessorMetadata `json:"issuer_processor_metadata,omitempty"`
	LineItemStatus          *LineItemStatus          `json:"line_item_status,omitempty"`         // The status of a line item.
	MerchantData            MerchantData             `json:"merchant_data"`                      
	OriginalAmountCents     int64                    `json:"original_amount_cents"`              // The amount charged (in cents).
}

type ExternalField struct {
	Key   *string `json:"key,omitempty"`  // Key - i.e. Name of the External Party
	Value *string `json:"value,omitempty"`// Value - i.e. External Account ID
}

type IssuerProcessorMetadata struct {
	Lithic *Lithic `json:"lithic,omitempty"`
}

type Lithic struct {
	LastFour *int64 `json:"last_four,omitempty"`// Last four digits of the card against which the spend was made.
}

type MerchantData struct {
	ID          *string  `json:"id,omitempty"`          
	MccCode     *float64 `json:"mcc_code,omitempty"`    
	Name        *string  `json:"name,omitempty"`        
	PhoneNumber *string  `json:"phone_number,omitempty"`
}

// The status of a line item.
type LineItemStatus string
const (
	Authorized LineItemStatus = "AUTHORIZED"
	Declined LineItemStatus = "DECLINED"
	Invalid LineItemStatus = "INVALID"
	Offset LineItemStatus = "OFFSET"
	Pending LineItemStatus = "PENDING"
	Posted LineItemStatus = "POSTED"
	Valid LineItemStatus = "VALID"
	Void LineItemStatus = "VOID"
)
