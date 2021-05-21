export interface UpdateAPIUserPassword {
    /**
     * The password of the user changing their password.
     */
    current_password: string;
    /**
     * The new password of the user changing their password.
     */
    new_password: string;
    /**
     * A unique token included in Canopy's reset password email.
     */
    token: string;
}
