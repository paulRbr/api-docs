// Note.java

package io.quicktype;

public class Note {
    private long accountID;
    private Author author;
    private String createdDate;
    private String message;
    private long noteID;

    /**
     * The ID of the account to which the Note is assigned
     */
    public long getAccountID() { return accountID; }
    public void setAccountID(long value) { this.accountID = value; }

    /**
     * The API User who authored the note
     */
    public Author getAuthor() { return author; }
    public void setAuthor(Author value) { this.author = value; }

    /**
     * The date and time the note was created.
     */
    public String getCreatedDate() { return createdDate; }
    public void setCreatedDate(String value) { this.createdDate = value; }

    /**
     * The contents of the note.
     */
    public String getMessage() { return message; }
    public void setMessage(String value) { this.message = value; }

    /**
     * A Canopy-generated unique ID for the note
     */
    public long getNoteID() { return noteID; }
    public void setNoteID(long value) { this.noteID = value; }
}

// Author.java

package io.quicktype;

/**
 * The API User who authored the note
 */
public class Author {
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
