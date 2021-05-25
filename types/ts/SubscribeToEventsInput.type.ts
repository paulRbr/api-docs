export interface SubscribeToEventsInput {
    /**
     * These are the specific types of events to which your organization may subscribe.
     * `Enabled` events will be sent to your callback URL following Canopy's standard event
     * subscription payload. Some event subscriptions may have additional configurations around
     * when they are triggered.
     */
    event_subscriptions?: EventSubscriptions;
    webhook_url:          string;
}

/**
 * These are the specific types of events to which your organization may subscribe.
 * `Enabled` events will be sent to your callback URL following Canopy's standard event
 * subscription payload. Some event subscriptions may have additional configurations around
 * when they are triggered.
 */
export interface EventSubscriptions {
    account_charge?:        AccountCharge;
    account_fee?:           AccountFee;
    account_payment?:       AccountPayment;
    account_payment_due?:   AccountPaymentDue;
    account_status_change?: AccountStatusChange;
}

export interface AccountCharge {
    /**
     * Receive a notification whenever a charge occurs for one of your accounts.
     */
    enabled?: boolean;
}

export interface AccountFee {
    /**
     * Receive a notification whenever a fee is incurred for one of your accounts.
     */
    enabled?: boolean;
}

export interface AccountPayment {
    /**
     * Receive a notification whenever a payment occurs for one of your accounts.
     */
    enabled?: boolean;
}

export interface AccountPaymentDue {
    /**
     * Receive a notification whenever a nonzero account `min_pay` is present for one of your
     * accounts, at each of the provided `days_before_due`.
     */
    enabled?: boolean;
}

export interface AccountStatusChange {
    /**
     * Receive a notification whenever a status change occurs for one of your accounts.
     */
    enabled?: boolean;
}
