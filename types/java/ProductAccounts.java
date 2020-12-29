package io.quicktype;

public class ProductAccounts {
    private long[] currentAccounts;

    /**
     * Array of Accounts that are currently using this Product
     */
    public long[] getCurrentAccounts() { return currentAccounts; }
    public void setCurrentAccounts(long[] value) { this.currentAccounts = value; }
}
