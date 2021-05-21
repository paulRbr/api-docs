export interface RegisterAPIUserInput {
    /**
     * The email address of the user being updated.
     */
    email_confirm: string;
    /**
     * The first name of the API user.
     */
    name_first: string;
    /**
     * The last name of the API user.
     */
    name_last: string;
    /**
     * The new password of the API user.
     */
    new_password: string;
    /**
     * The phone number to add to the API User's information.
     */
    phone: string;
    /**
     * A unique token included in Canopy's register user email.
     */
    token: string;
}
