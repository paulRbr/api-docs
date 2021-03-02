// AccountStatementSummary.java

package io.quicktype;

/**
 * Statement for an account for a given billing cycle
 */
public class AccountStatementSummary {
    private long accountID;
    private BalanceSummary balanceSummary;
    private CycleSummary cycleSummary;
    private String effectiveAsOfDate;
    private MinPayDueCents minPayDueCents;
    private long statementID;

    /**
     * The Canopy-generated ID for the account
     */
    public long getAccountID() { return accountID; }
    public void setAccountID(long value) { this.accountID = value; }

    public BalanceSummary getBalanceSummary() { return balanceSummary; }
    public void setBalanceSummary(BalanceSummary value) { this.balanceSummary = value; }

    public CycleSummary getCycleSummary() { return cycleSummary; }
    public void setCycleSummary(CycleSummary value) { this.cycleSummary = value; }

    /**
     * The `Date-Time` you would like the system to return the data as of. IE tell me what the
     * account information was as if I had asked on `2020-10-20 00:00:00 EST`. If empty it
     * defaults to current time.
     */
    public String getEffectiveAsOfDate() { return effectiveAsOfDate; }
    public void setEffectiveAsOfDate(String value) { this.effectiveAsOfDate = value; }

    public MinPayDueCents getMinPayDueCents() { return minPayDueCents; }
    public void setMinPayDueCents(MinPayDueCents value) { this.minPayDueCents = value; }

    /**
     * The Canopy-generated ID for the statement
     */
    public long getStatementID() { return statementID; }
    public void setStatementID(long value) { this.statementID = value; }
}

// BalanceSummary.java

package io.quicktype;

public class BalanceSummary {
    private long totalBalanceCents;

    /**
     * The total balance (in cents) associated with the account.
     */
    public long getTotalBalanceCents() { return totalBalanceCents; }
    public void setTotalBalanceCents(long value) { this.totalBalanceCents = value; }
}

// CycleSummary.java

package io.quicktype;

public class CycleSummary {
    private String cycleExclusiveEnd;
    private String cycleInclusiveStart;

    /**
     * The inclusive ending `Date-Time` that defines which transations are part of this
     * statement.
     */
    public String getCycleExclusiveEnd() { return cycleExclusiveEnd; }
    public void setCycleExclusiveEnd(String value) { this.cycleExclusiveEnd = value; }

    /**
     * The inclusive starting `Date-Time` that defines which transations are part of this
     * statement.
     */
    public String getCycleInclusiveStart() { return cycleInclusiveStart; }
    public void setCycleInclusiveStart(String value) { this.cycleInclusiveStart = value; }
}

// MinPayDueCents.java

package io.quicktype;

public class MinPayDueCents {
    private long minPayCents;
    private String minPayDueAt;

    /**
     * Total amount due for the billing cycle, summing cycle principal, interest, deferred
     * interest, and fees outstanding.
     */
    public long getMinPayCents() { return minPayCents; }
    public void setMinPayCents(long value) { this.minPayCents = value; }

    /**
     * The `Date-Time` the payment for this billing cycle is due.
     */
    public String getMinPayDueAt() { return minPayDueAt; }
    public void setMinPayDueAt(String value) { this.minPayDueAt = value; }
}
