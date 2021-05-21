type RegisterAPIUserInput struct {
	EmailConfirm string `json:"email_confirm"`// The email address of the user being updated.
	NameFirst    string `json:"name_first"`   // The first name of the API user.
	NameLast     string `json:"name_last"`    // The last name of the API user.
	NewPassword  string `json:"new_password"` // The new password of the API user.
	Phone        string `json:"phone"`        // The phone number to add to the API User's information.
	Token        string `json:"token"`        // A unique token included in Canopy's register user email.
}
