/**
 * Card data. Field names match the ones in Lithic's card schema
 */
export interface CustomerCards {
    lithic?: Lithic;
    /**
     * Spending limit of card (in cents). If not provided, spending is still subject to the
     * spend limit set at the issuer processor account (if any).
     */
    spend_limit?: number;
}

export interface Lithic {
    /**
     * Last four digits of the card
     */
    last_four?: string;
    /**
     * Friendly name to identify the card
     */
    memo?: string;
    /**
     * The current state of the card
     */
    state?: State;
    /**
     * Unique external identifier for the card
     */
    token?: string;
    /**
     * The type of card being returned
     */
    type?: Type;
}

/**
 * The current state of the card
 */
export type State = 
    "CLOSED" | 
    "OPEN" | 
    "PAUSED";

/**
 * The type of card being returned
 */
export type Type = 
    "MERCHANT_LOCKED" | 
    "SINGLE_USE" | 
    "UNLOCKED";
