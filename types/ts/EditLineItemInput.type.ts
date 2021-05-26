export interface EditLineItemInput {
    /**
     * The new status which you would like to set for the line item
     */
    line_item_status?: LineItemStatus;
}

/**
 * The new status which you would like to set for the line item
 */
export type LineItemStatus = 
    "AUTHORIZED" | 
    "DECLINED" | 
    "INVALID" | 
    "OFFSET" | 
    "PENDING" | 
    "POSTED" | 
    "VALID" | 
    "VOID";
