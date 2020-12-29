// ProductSummary.java

package io.quicktype;

/**
 * Summary of product information
 */
public class ProductSummary {
    private AccountsOverview accountsOverview;

    public AccountsOverview getAccountsOverview() { return accountsOverview; }
    public void setAccountsOverview(AccountsOverview value) { this.accountsOverview = value; }
}

// AccountsOverview.java

package io.quicktype;

public class AccountsOverview {
    private long accountCountTotal;

    /**
     * Total number of accounts under the product.
     */
    public long getAccountCountTotal() { return accountCountTotal; }
    public void setAccountCountTotal(long value) { this.accountCountTotal = value; }
}
