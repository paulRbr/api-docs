type CreateCustomerAccountCardInput struct {
	Lithic     *Lithic `json:"lithic,omitempty"`     
	SpendLimit *int64  `json:"spend_limit,omitempty"`// Spending limit of card (in cents). If not provided, spending is still subject to the; spend limit set at the issuer processor account (if any).
}

type Lithic struct {
	CardProgramToken *string `json:"card_program_token,omitempty"`// Token belonging to the card program under which to create the card.
	Memo             *string `json:"memo,omitempty"`              // Friendly name to identify the card
	State            *State  `json:"state,omitempty"`             // The state of the new card
	Type             *Type   `json:"type,omitempty"`              // The type of card created by Lithic
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
