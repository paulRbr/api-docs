export interface Note {
    /**
     * A Canopy-generated ID for the account.
     */
    account_id: string;
    /**
     * The API User who authored the note
     */
    author?: Author;
    /**
     * The date and time the note was created.
     */
    created_date: string;
    /**
     * The contents of the note.
     */
    message?: string;
    /**
     * A Canopy-generated ID for the note.
     */
    note_id: string;
}

/**
 * The API User who authored the note
 */
export interface Author {
    /**
     * The unique ID in Canopy for this API user
     */
    api_user_id: string;
    /**
     * The email address of this API User
     */
    email: string;
    /**
     * The first name of the API user.
     */
    name_first?: string;
    /**
     * The last name of the API user.
     */
    name_last?: string;
    /**
     * The organization to which the API user belongs.
     */
    organization_name: string;
    /**
     * Phone number of the API user
     */
    phone?: string;
    /**
     * The role of this user in the API
     */
    role: number;
}
