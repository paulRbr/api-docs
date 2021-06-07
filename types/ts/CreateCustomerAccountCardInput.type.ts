export interface CreateCustomerAccountCardInput {
    lithic?: Lithic;
    /**
     * Spending limit of card (in cents). If not provided, spending is still subject to the
     * spend limit set at the issuer processor account (if any).
     */
    spend_limit?: number;
}

export interface Lithic {
    /**
     * Token belonging to the card program under which to create the card.
     */
    card_program_token?: string;
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
