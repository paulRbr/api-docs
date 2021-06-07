export interface UpdateCustomerAccountCardInput {
    lithic?: Lithic;
    /**
     * Spending limit of card (in cents). If not provided, spending is still subject to the
     * spend limit set at the issuer processor account (if any).
     */
    spend_limit?: number;
}

export interface Lithic {
    /**
     * Friendly name to identify the card
     */
    memo?: string;
    /**
     * The new state of the card. **Note: "CLOSED" cannot be undone.**
     */
    state?: State;
    /**
     * External identifier for card in Lithic.
     */
    token: string;
}

/**
 * The new state of the card. **Note: "CLOSED" cannot be undone.**
 */
export type State = 
    "CLOSED" | 
    "OPEN" | 
    "PAUSED";
