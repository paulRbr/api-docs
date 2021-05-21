type CreateCustomerAccountCardInput struct {
	Privacy *Privacy `json:"privacy,omitempty"`
}

type Privacy struct {
	Memo  *string `json:"memo,omitempty"` // Friendly name to identify the card
	State *State  `json:"state,omitempty"`// The state of the new card
	Type  *Type   `json:"type,omitempty"` // The type of card created by privacy.com
}

// The state of the new card
type State string
const (
	Open State = "OPEN"
	Paused State = "PAUSED"
)

// The type of card created by privacy.com
type Type string
const (
	MerchantLocked Type = "MERCHANT_LOCKED"
	SingleUse Type = "SINGLE_USE"
	Unlocked Type = "UNLOCKED"
)
