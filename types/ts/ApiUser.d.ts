export interface APIUser {
  /**
   * The unique ID in Canopy for this API user
   */
  api_user_id: number;
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
  role: Role;
}

/**
 * The role of this user in the API
 */
export enum Role {
  Admin = "ADMIN",
  Operations = "OPERATIONS",
  Servicing = "SERVICING",
}
