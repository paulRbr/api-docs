export interface UpdateCustomerAccountCardInput {
    lithic?: Lithic;
}

export interface Lithic {
    /**
     * Friendly name to identify the card
     */
    memo?: string;
    /**
     * The state of the new card. **Note: "CLOSED" cannot be undone.**
     */
    state?: State;
    /**
     * External identifier for card in Lithic.
     */
    token: string;
}

/**
 * The state of the new card. **Note: "CLOSED" cannot be undone.**
 */
export type State = 
    "CLOSED" | 
    "OPEN" | 
    "PAUSED";
