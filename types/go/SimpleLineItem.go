type SimpleLineItem struct {
	AccountID               string                   `json:"account_id"`                         // A Canopy-generated ID for the account.
	CreatedAt               string                   `json:"created_at"`                         // The `Date-Time` which the line item was created.
	EffectiveAt             string                   `json:"effective_at"`                       // The `Date-Time` that this line item became/becomes active
	ExternalFields          []ExternalField          `json:"external_fields,omitempty"`          // An array of static references to fields in a third party system.
	IssuerProcessorMetadata *IssuerProcessorMetadata `json:"issuer_processor_metadata,omitempty"`
	LineItemID              string                   `json:"line_item_id"`                       // A Canopy-generated ID for the line item.
	LineItemOverview        *LineItemOverview        `json:"line_item_overview,omitempty"`       
	LineItemSummary         *LineItemSummary         `json:"line_item_summary,omitempty"`        
	MerchantData            *MerchantData            `json:"merchant_data,omitempty"`            // Merchant information if applicable.
	ProductID               string                   `json:"product_id"`                         // A Canopy-generated ID for the product.
}

type ExternalField struct {
	Key   *string `json:"key,omitempty"`  // Key - i.e. Name of the External Party
	Value *string `json:"value,omitempty"`// Value - i.e. External Account ID
}

type IssuerProcessorMetadata struct {
	Privacy *Privacy `json:"privacy,omitempty"`
}

type Privacy struct {
	LastFour *int64 `json:"last_four,omitempty"`// Last four digits of the card against which the spend was made.
}

type LineItemOverview struct {
	Description    *string        `json:"description,omitempty"`     // A description of this particular line item if any. More common for adjustments.
	LineItemStatus LineItemStatus `json:"line_item_status"`          // the corresponding Status for a line item
	LineItemType   LineItemType   `json:"line_item_type"`            // The Line Item Type. i.e. `CHARGE`, `PAYMENT`.
	LinkedLineItem *string        `json:"linked_line_item,omitempty"`// Line item ID of the linked line item -- example: the original payment that was reversed; in a payment reversal.
}

type LineItemSummary struct {
	OriginalAmountCents int64 `json:"original_amount_cents"`// The originating amount of money (in cents) relating to this line item.
}

// Merchant information if applicable.
type MerchantData struct {
	ID          *string  `json:"id,omitempty"`          
	MccCode     *float64 `json:"mcc_code,omitempty"`    
	Name        *string  `json:"name,omitempty"`        
	PhoneNumber *string  `json:"phone_number,omitempty"`
}

// the corresponding Status for a line item
type LineItemStatus string
const (
	Authorized LineItemStatus = "AUTHORIZED"
	Declined LineItemStatus = "DECLINED"
	Invalid LineItemStatus = "INVALID"
	Offset LineItemStatus = "OFFSET"
	Pending LineItemStatus = "PENDING"
	Posted LineItemStatus = "POSTED"
	Reversed LineItemStatus = "REVERSED"
	Rolled LineItemStatus = "ROLLED"
	SplitInvalid LineItemStatus = "SPLIT_INVALID"
	SplitValid LineItemStatus = "SPLIT_VALID"
	Valid LineItemStatus = "VALID"
	Void LineItemStatus = "VOID"
)

// The Line Item Type. i.e. `CHARGE`, `PAYMENT`.
type LineItemType string
const (
	Charge LineItemType = "CHARGE"
	CreditOffset LineItemType = "CREDIT_OFFSET"
	DebitOffset LineItemType = "DEBIT_OFFSET"
	DeferredInterest LineItemType = "DEFERRED_INTEREST"
	Fee LineItemType = "FEE"
	FeeSurcharge LineItemType = "FEE_SURCHARGE"
	Interest LineItemType = "INTEREST"
	LateFee LineItemType = "LATE_FEE"
	Loan LineItemType = "LOAN"
	MinDue LineItemType = "MIN_DUE"
	MonthFee LineItemType = "MONTH_FEE"
	OrigFee LineItemType = "ORIG_FEE"
	Payment LineItemType = "PAYMENT"
	PaymentSplit LineItemType = "PAYMENT_SPLIT"
	ProductInterest LineItemType = "PRODUCT_INTEREST"
	PromoEnd LineItemType = "PROMO_END"
	PurchaseWindowEnd LineItemType = "PURCHASE_WINDOW_END"
	ReturnCheckFee LineItemType = "RETURN_CHECK_FEE"
	Statement LineItemType = "STATEMENT"
	YearFee LineItemType = "YEAR_FEE"
)
