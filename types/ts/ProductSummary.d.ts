/**
 * Summary of product information
 */
export interface ProductSummary {
  accounts_overview?: AccountsOverview;
}

export interface AccountsOverview {
  /**
   * Total number of accounts under the product.
   */
  account_count_total: number;
}
