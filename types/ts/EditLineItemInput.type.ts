export interface EditLineItemInput {
    /**
     * The new status which you would like to set for the line item
     */
    line_item_status?: LineItemStatus;
}

/**
 * The new status which you would like to set for the line item
 */
export enum LineItemStatus {
    Authorized = "AUTHORIZED",
    Declined = "DECLINED",
    Invalid = "INVALID",
    Offset = "OFFSET",
    Pending = "PENDING",
    Posted = "POSTED",
    Valid = "VALID",
    Void = "VOID",
}
