type CreateCustomerAccountCardInput struct {
	Lithic     *Lithic `json:"lithic,omitempty"`     
	SpendLimit *int64  `json:"spend_limit,omitempty"`// Spending limit of card (in cents).
}

type Lithic struct {
	Memo  *string `json:"memo,omitempty"` // Friendly name to identify the card
	State *State  `json:"state,omitempty"`// The state of the new card
	Type  *Type   `json:"type,omitempty"` // The type of card created by Lithic
}

// The state of the new card
type State string
const (
	Open State = "OPEN"
	Paused State = "PAUSED"
)

// The type of card created by Lithic
type Type string
const (
	MerchantLocked Type = "MERCHANT_LOCKED"
	SingleUse Type = "SINGLE_USE"
	Unlocked Type = "UNLOCKED"
)
