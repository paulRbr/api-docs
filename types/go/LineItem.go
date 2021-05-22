type LineItem struct {
	AccountID              string                  `json:"account_id"`                        // The account associated with the line item
	CreatedAt              *string                 `json:"created_at,omitempty"`              // The `Date-Time` which the line item was created.
	EffectiveAt            *string                 `json:"effective_at,omitempty"`            // The `Date-Time` that this line item became/becomes active
	ExternalFields         []ExternalField         `json:"external_fields,omitempty"`         // An array of static references to fields in a third party system.
	IssuerProcessorDetails *IssuerProcessorDetails `json:"issuer_processor_details,omitempty"`
	LineItemID             string                  `json:"line_item_id"`                      // The ID associated with the line item
	LineItemOverview       *LineItemOverview       `json:"line_item_overview,omitempty"`      
	LineItemSummary        *LineItemSummary        `json:"line_item_summary,omitempty"`       
	MerchantData           *MerchantData           `json:"merchant_data,omitempty"`           // Merchant information if applicable.
	ProductID              int64                   `json:"product_id"`                        // the Product ID of the account
}

type ExternalField struct {
	Key   *string `json:"key,omitempty"`  // Key - i.e. Name of the External Party
	Value *string `json:"value,omitempty"`// Value - i.e. External Account ID
}

type IssuerProcessorDetails struct {
	Lithic *Lithic `json:"lithic,omitempty"`
}

type Lithic struct {
	CardToken        *string `json:"card_token,omitempty"`       // The external unique identifier of the card related to this line item.
	LastFour         *int64  `json:"last_four,omitempty"`        // Last four digits of the card against which the spend was made.
	TransactionToken *string `json:"transaction_token,omitempty"`// The external unique identifier of the transaction.
}

type LineItemOverview struct {
	Description    *string `json:"description,omitempty"`     // A description of this particular line item if any. More common for adjustments.
	LineItemStatus *string `json:"line_item_status,omitempty"`// the corresponding Status for a line item
	LineItemType   string  `json:"line_item_type"`            // The Line Item Type. i.e. `CHARGE`, `PAYMENT`.
}

type LineItemSummary struct {
	AmDeferredInterestBalanceCents *int64 `json:"am_deferred_interest_balance_cents,omitempty"`// The current AM deferred interest balance of the line item. Canopy tracks deferred; interest during an amortization period separately from deferred interest accrued during a; revolving period.
	AmInterestBalanceCents         *int64 `json:"am_interest_balance_cents,omitempty"`         // The current AM interest balance of the line item. Canopy tracks interest during an; amortization period separately from deferred interest accrued during a revolving period.
	BalanceCents                   *int64 `json:"balance_cents,omitempty"`                     // The current balance of the line item, which accounts for interest accrued per the; `product's` interest policy and the `account's` interest rate attribute.
	DeferredInterestBalanceCents   *int64 `json:"deferred_interest_balance_cents,omitempty"`   // The current deferred interest balance of the line item.
	InterestBalanceCents           *int64 `json:"interest_balance_cents,omitempty"`            // The current interest balance of the line item.
	OriginalAmountCents            *int64 `json:"original_amount_cents,omitempty"`             // The originating amount of money (in cents) relating to this line item.
	PrincipalCents                 *int64 `json:"principal_cents,omitempty"`                   // The principal balance of the line item.
	TotalInterestPaidToDateCents   *int64 `json:"total_interest_paid_to_date_cents,omitempty"` // The sum (in cents) of all payments towards interest charges, if any, applied to this line; item to date
}

// Merchant information if applicable.
type MerchantData struct {
	ID          *string  `json:"id,omitempty"`          
	MccCode     *float64 `json:"mcc_code,omitempty"`    
	Name        *string  `json:"name,omitempty"`        
	PhoneNumber *string  `json:"phone_number,omitempty"`
}
