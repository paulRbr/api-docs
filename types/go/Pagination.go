// Pagination Information.
type Pagination struct {
	EndingBefore  *string `json:"ending_before,omitempty"` // Use this to drive your next request if you want the previous page of results
	HasMore       *bool   `json:"has_more,omitempty"`      // Indicates whether there are additional values beyond the ending index of the paginated; results.
	StartingAfter *string `json:"starting_after,omitempty"`// Use this to drive your next request if you want the next page of results
}
