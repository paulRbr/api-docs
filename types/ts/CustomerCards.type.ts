/**
 * Card data. Field names match the ones in Privacy's card schema
 */
export interface CustomerCards {
    privacy?: Privacy;
}

export interface Privacy {
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
export enum State {
    Closed = "CLOSED",
    Open = "OPEN",
    Paused = "PAUSED",
}

/**
 * The type of card being returned
 */
export enum Type {
    MerchantLocked = "MERCHANT_LOCKED",
    SingleUse = "SINGLE_USE",
    Unlocked = "UNLOCKED",
}
