type UpdateCustomerAccountCardInput struct {
	Lithic     *Lithic `json:"lithic,omitempty"`     
	SpendLimit *int64  `json:"spend_limit,omitempty"`// Spending limit of card (in cents). If not provided, spending is still subject to the; spend limit set at the issuer processor account (if any).
}

type Lithic struct {
	Memo  *string `json:"memo,omitempty"` // Friendly name to identify the card
	State *State  `json:"state,omitempty"`// The new state of the card. **Note: "CLOSED" cannot be undone.**
	Token string  `json:"token"`          // External identifier for card in Lithic.
}

// The new state of the card. **Note: "CLOSED" cannot be undone.**
type State string
const (
	Closed State = "CLOSED"
	Open State = "OPEN"
	Paused State = "PAUSED"
)
