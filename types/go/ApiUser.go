type APIUser struct {
	APIUserID        string  `json:"api_user_id"`         // The unique ID in Canopy for this API user
	Email            string  `json:"email"`               // The email address of this API User
	NameFirst        *string `json:"name_first,omitempty"`// The first name of the API user.
	NameLast         *string `json:"name_last,omitempty"` // The last name of the API user.
	OrganizationName string  `json:"organization_name"`   // The organization to which the API user belongs.
	Phone            *string `json:"phone,omitempty"`     // Phone number of the API user
	Role             int64   `json:"role"`                // The role of this user in the API
}
