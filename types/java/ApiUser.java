// APIUser.java

package io.quicktype;

public class APIUser {
    private long apiUserID;
    private String email;
    private String nameFirst;
    private String nameLast;
    private String organizationName;
    private String phone;
    private Role role;

    /**
     * The unique ID in Canopy for this API user
     */
    public long getAPIUserID() { return apiUserID; }
    public void setAPIUserID(long value) { this.apiUserID = value; }

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
    public Role getRole() { return role; }
    public void setRole(Role value) { this.role = value; }
}

// Role.java

package io.quicktype;

import java.io.IOException;

/**
 * The role of this user in the API
 */
public enum Role {
    ADMIN, OPERATIONS, SERVICING;

    public String toValue() {
        switch (this) {
            case ADMIN: return "ADMIN";
            case OPERATIONS: return "OPERATIONS";
            case SERVICING: return "SERVICING";
        }
        return null;
    }

    public static Role forValue(String value) throws IOException {
        if (value.equals("ADMIN")) return ADMIN;
        if (value.equals("OPERATIONS")) return OPERATIONS;
        if (value.equals("SERVICING")) return SERVICING;
        throw new IOException("Cannot deserialize Role");
    }
}
