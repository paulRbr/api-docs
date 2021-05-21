export interface CreateCustomerAccountCardInput {
    privacy?: Privacy;
}

export interface Privacy {
    /**
     * Friendly name to identify the card
     */
    memo?: string;
    /**
     * The state of the new card
     */
    state?: State;
    /**
     * The type of card created by privacy.com
     */
    type?: Type;
}

/**
 * The state of the new card
 */
export enum State {
    Open = "OPEN",
    Paused = "PAUSED",
}

/**
 * The type of card created by privacy.com
 */
export enum Type {
    MerchantLocked = "MERCHANT_LOCKED",
    SingleUse = "SINGLE_USE",
    Unlocked = "UNLOCKED",
}
