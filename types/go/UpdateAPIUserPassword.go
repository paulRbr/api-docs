type UpdateAPIUserPassword struct {
	CurrentPassword string `json:"current_password"`// The password of the user changing their password.
	NewPassword     string `json:"new_password"`    // The new password of the user changing their password.
	Token           string `json:"token"`           // A unique token included in Canopy's reset password email.
}
