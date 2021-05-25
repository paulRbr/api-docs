type SubscribeToEventsInput struct {
	EventSubscriptions *EventSubscriptions `json:"event_subscriptions,omitempty"`// These are the specific types of events to which your organization may subscribe.; `Enabled` events will be sent to your callback URL following Canopy's standard event; subscription payload. Some event subscriptions may have additional configurations around; when they are triggered.
	WebhookURL         string              `json:"webhook_url"`                  
}

// These are the specific types of events to which your organization may subscribe.
// `Enabled` events will be sent to your callback URL following Canopy's standard event
// subscription payload. Some event subscriptions may have additional configurations around
// when they are triggered.
type EventSubscriptions struct {
	AccountCharge       *AccountCharge       `json:"account_charge,omitempty"`       
	AccountFee          *AccountFee          `json:"account_fee,omitempty"`          
	AccountPayment      *AccountPayment      `json:"account_payment,omitempty"`      
	AccountPaymentDue   *AccountPaymentDue   `json:"account_payment_due,omitempty"`  
	AccountStatusChange *AccountStatusChange `json:"account_status_change,omitempty"`
}

type AccountCharge struct {
	Enabled *bool `json:"enabled,omitempty"`// Receive a notification whenever a charge occurs for one of your accounts.
}

type AccountFee struct {
	Enabled *bool `json:"enabled,omitempty"`// Receive a notification whenever a fee is incurred for one of your accounts.
}

type AccountPayment struct {
	Enabled *bool `json:"enabled,omitempty"`// Receive a notification whenever a payment occurs for one of your accounts.
}

type AccountPaymentDue struct {
	Enabled *bool `json:"enabled,omitempty"`// Receive a notification whenever a nonzero account `min_pay` is present for one of your; accounts, at each of the provided `days_before_due`.
}

type AccountStatusChange struct {
	Enabled *bool `json:"enabled,omitempty"`// Receive a notification whenever a status change occurs for one of your accounts.
}
