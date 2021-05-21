type CustomerCards []CustomerCard

// Card data. Field names match the ones in Privacy's card schema
type CustomerCard struct {
	Privacy *Privacy `json:"privacy,omitempty"`
}

type Privacy struct {
	LastFour *string `json:"last_four,omitempty"`// Last four digits of the card
	Memo     *string `json:"memo,omitempty"`     // Friendly name to identify the card
	State    *State  `json:"state,omitempty"`    // The current state of the card
	Token    *string `json:"token,omitempty"`    // Unique external identifier for the card
	Type     *Type   `json:"type,omitempty"`     // The type of card being returned
}

// The current state of the card
type State string
const (
	Closed State = "CLOSED"
	Open State = "OPEN"
	Paused State = "PAUSED"
)

// The type of card being returned
type Type string
const (
	MerchantLocked Type = "MERCHANT_LOCKED"
	SingleUse Type = "SINGLE_USE"
	Unlocked Type = "UNLOCKED"
)
