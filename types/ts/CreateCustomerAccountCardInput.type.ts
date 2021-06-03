export interface CreateCustomerAccountCardInput {
    lithic?: Lithic;
    /**
     * Spending limit of card (in cents).
     */
    spend_limit?: number;
}

export interface Lithic {
    /**
     * Friendly name to identify the card
     */
    memo?: string;
    /**
     * The state of the new card
     */
    state?: State;
    /**
     * The type of card created by Lithic
     */
    type?: Type;
}

/**
 * The state of the new card
 */
export type State = 
    "OPEN" | 
    "PAUSED";

/**
 * The type of card created by Lithic
 */
export type Type = 
    "MERCHANT_LOCKED" | 
    "SINGLE_USE" | 
    "UNLOCKED";
