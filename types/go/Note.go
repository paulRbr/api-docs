type Note struct {
	AccountID   string `json:"account_id"`  // A Canopy-generated ID for the account.
	Author      Author `json:"author"`      // The API User who authored the note
	CreatedDate string `json:"created_date"`// The date and time the note was created.
	Message     string `json:"message"`     // The contents of the note.
	NoteID      string `json:"note_id"`     // A Canopy-generated ID for the note.
}

// The API User who authored the note
type Author struct {
	APIUserID        string  `json:"api_user_id"`         // The unique ID in Canopy for this API user
	Email            string  `json:"email"`               // The email address of this API User
	NameFirst        *string `json:"name_first,omitempty"`// The first name of the API user.
	NameLast         *string `json:"name_last,omitempty"` // The last name of the API user.
	OrganizationName string  `json:"organization_name"`   // The organization to which the API user belongs.
	Phone            *string `json:"phone,omitempty"`     // Phone number of the API user
	Role             int64   `json:"role"`                // The role of this user in the API
}
