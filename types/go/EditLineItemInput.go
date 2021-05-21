type EditLineItemInput struct {
	LineItemStatus *LineItemStatus `json:"line_item_status,omitempty"`// The new status which you would like to set for the line item
}

// The new status which you would like to set for the line item
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
