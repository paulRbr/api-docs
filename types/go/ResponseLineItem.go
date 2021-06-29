type ResponseLineItem struct {
	AccountID  string `json:"account_id"`  // A Canopy-generated ID for the account.
	LineItemID string `json:"line_item_id"`// A Canopy-generated ID for the line item.
	ProductID  string `json:"product_id"`  // A Canopy-generated ID for the product.
}
