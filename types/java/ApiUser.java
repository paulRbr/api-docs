package io.quicktype;

public class APIUser {
    private String apiUserID;
    private String email;
    private String nameFirst;
    private String nameLast;
    private String organizationName;
    private String phone;
    private long role;

    /**
     * The unique ID in Canopy for this API user
     */
    public String getAPIUserID() { return apiUserID; }
    public void setAPIUserID(String value) { this.apiUserID = value; }

    /**
     * The email address of this API User
     */
    public String getEmail() { return email; }
    public void setEmail(String value) { this.email = value; }

    /**
     * The first name of the API user.
     */
    public String getNameFirst() { return nameFirst; }
    public void setNameFirst(String value) { this.nameFirst = value; }

    /**
     * The last name of the API user.
     */
    public String getNameLast() { return nameLast; }
    public void setNameLast(String value) { this.nameLast = value; }

    /**
     * The organization to which the API user belongs.
     */
    public String getOrganizationName() { return organizationName; }
    public void setOrganizationName(String value) { this.organizationName = value; }

    /**
     * Phone number of the API user
     */
    public String getPhone() { return phone; }
    public void setPhone(String value) { this.phone = value; }

    /**
     * The role of this user in the API
     */
    public long getRole() { return role; }
    public void setRole(long value) { this.role = value; }
}
