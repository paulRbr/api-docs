/**
 * Pagination Information.
 */
export interface Pagination {
    /**
     * Use this to drive your next request if you want the previous page of results
     */
    ending_before?: string;
    /**
     * Indicates whether there are additional values beyond the ending index of the paginated
     * results.
     */
    has_more?: boolean;
    /**
     * Use this to drive your next request if you want the next page of results
     */
    starting_after?: string;
}
