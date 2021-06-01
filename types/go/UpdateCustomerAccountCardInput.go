type UpdateCustomerAccountCardInput struct {
	Lithic *Lithic `json:"lithic,omitempty"`
}

type Lithic struct {
	Memo  *string `json:"memo,omitempty"` // Friendly name to identify the card
	State *State  `json:"state,omitempty"`// The state of the new card. **Note: "CLOSED" cannot be undone.**
	Token string  `json:"token"`          // External identifier for card in Lithic.
}

// The state of the new card. **Note: "CLOSED" cannot be undone.**
type State string
const (
	Closed State = "CLOSED"
	Open State = "OPEN"
	Paused State = "PAUSED"
)
