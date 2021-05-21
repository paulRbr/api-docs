export interface CreateAPIUserInput {
    /**
     * The email address of this API User.
     */
    email: string;
    /**
     * Assign a role to users to dictate permissions and API access level . [Contact our
     * team](mailto:devs@canopyservicing.com?subject=API%20Access%20Request) for a full list of
     * options.
     */
    role: number;
}
