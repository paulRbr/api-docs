type UpdateProductMigrationModeInput struct {
	MigrationMode *bool `json:"migration_mode,omitempty"`// If migration mode is on, Canopy will not autogenerate statements for this account.
}
