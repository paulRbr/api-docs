// AccountStatement.java

package io.quicktype;

import java.time.OffsetDateTime;

/**
 * Statement for an account for a given billing cycle
 */
public class AccountStatement {
    private long accountID;
    private AccountOverview accountOverview;
    private AdditionalMinPayDetails additionalMinPayDetails;
    private BalanceSummary balanceSummary;
    private CycleSummary cycleSummary;
    private OffsetDateTime effectiveAsOfDate;
    private MinPayDue minPayDue;
    private OpenToBuy openToBuy;
    private Payoff payoff;
    private long statementID;

    /**
     * The Canopy-generated ID for the account
     */
    public long getAccountID() { return accountID; }
    public void setAccountID(long value) { this.accountID = value; }

    public AccountOverview getAccountOverview() { return accountOverview; }
    public void setAccountOverview(AccountOverview value) { this.accountOverview = value; }

    public AdditionalMinPayDetails getAdditionalMinPayDetails() { return additionalMinPayDetails; }
    public void setAdditionalMinPayDetails(AdditionalMinPayDetails value) { this.additionalMinPayDetails = value; }

    public BalanceSummary getBalanceSummary() { return balanceSummary; }
    public void setBalanceSummary(BalanceSummary value) { this.balanceSummary = value; }

    public CycleSummary getCycleSummary() { return cycleSummary; }
    public void setCycleSummary(CycleSummary value) { this.cycleSummary = value; }

    /**
     * The `Date-Time` you would like the system to return the data as of. IE tell me what the
     * account information was as if I had asked on `2020-10-20 00:00:00 EST`. If empty it
     * defaults to current time.
     */
    public OffsetDateTime getEffectiveAsOfDate() { return effectiveAsOfDate; }
    public void setEffectiveAsOfDate(OffsetDateTime value) { this.effectiveAsOfDate = value; }

    public MinPayDue getMinPayDue() { return minPayDue; }
    public void setMinPayDue(MinPayDue value) { this.minPayDue = value; }

    public OpenToBuy getOpenToBuy() { return openToBuy; }
    public void setOpenToBuy(OpenToBuy value) { this.openToBuy = value; }

    public Payoff getPayoff() { return payoff; }
    public void setPayoff(Payoff value) { this.payoff = value; }

    /**
     * The Canopy-generated ID for the statement
     */
    public long getStatementID() { return statementID; }
    public void setStatementID(long value) { this.statementID = value; }
}

// AccountOverview.java

package io.quicktype;

import java.time.OffsetDateTime;

public class AccountOverview {
    private String accountStatus;
    private String accountStatusSubtype;
    private OffsetDateTime promoExclusiveEnd;
    private OffsetDateTime promoInclusiveStart;
    private OffsetDateTime promoPurchaseWindowExclusiveEnd;
    private OffsetDateTime promoPurchaseWindowInclusiveStart;

    /**
     * The Status of the Account. Active upon account creation.
     */
    public String getAccountStatus() { return accountStatus; }
    public void setAccountStatus(String value) { this.accountStatus = value; }

    /**
     * The subtype of the Status of the Account. Null upon account creation.
     */
    public String getAccountStatusSubtype() { return accountStatusSubtype; }
    public void setAccountStatusSubtype(String value) { this.accountStatusSubtype = value; }

    /**
     * If applicable, the `Date-Time` the promo period for the account ends.
     */
    public OffsetDateTime getPromoExclusiveEnd() { return promoExclusiveEnd; }
    public void setPromoExclusiveEnd(OffsetDateTime value) { this.promoExclusiveEnd = value; }

    /**
     * If applicable, the `Date-Time` the promo period for the account starts.
     */
    public OffsetDateTime getPromoInclusiveStart() { return promoInclusiveStart; }
    public void setPromoInclusiveStart(OffsetDateTime value) { this.promoInclusiveStart = value; }

    /**
     * If applicable, the `Date-Time` the purchase window for the account ends.
     */
    public OffsetDateTime getPromoPurchaseWindowExclusiveEnd() { return promoPurchaseWindowExclusiveEnd; }
    public void setPromoPurchaseWindowExclusiveEnd(OffsetDateTime value) { this.promoPurchaseWindowExclusiveEnd = value; }

    /**
     * If applicable, the `Date-Time` the purchase window for the account ends.
     */
    public OffsetDateTime getPromoPurchaseWindowInclusiveStart() { return promoPurchaseWindowInclusiveStart; }
    public void setPromoPurchaseWindowInclusiveStart(OffsetDateTime value) { this.promoPurchaseWindowInclusiveStart = value; }
}

// AdditionalMinPayDetails.java

package io.quicktype;

public class AdditionalMinPayDetails {
    private long minPayChargesPrincipalCents;
    private long minPayDeferredCents;
    private long minPayFeesCents;
    private long minPayInterestCents;
    private long previousMinPayCents;

    /**
     * Total principal due for the billing cycle.
     */
    public long getMinPayChargesPrincipalCents() { return minPayChargesPrincipalCents; }
    public void setMinPayChargesPrincipalCents(long value) { this.minPayChargesPrincipalCents = value; }

    /**
     * Total deferred interest due for the billing cycle.
     */
    public long getMinPayDeferredCents() { return minPayDeferredCents; }
    public void setMinPayDeferredCents(long value) { this.minPayDeferredCents = value; }

    /**
     * Total fees due for the billing cycle.
     */
    public long getMinPayFeesCents() { return minPayFeesCents; }
    public void setMinPayFeesCents(long value) { this.minPayFeesCents = value; }

    /**
     * Total interest due for the billing cycle.
     */
    public long getMinPayInterestCents() { return minPayInterestCents; }
    public void setMinPayInterestCents(long value) { this.minPayInterestCents = value; }

    /**
     * Previous amounts due, including fees. This is a subset of min_pay_cents.
     */
    public long getPreviousMinPayCents() { return previousMinPayCents; }
    public void setPreviousMinPayCents(long value) { this.previousMinPayCents = value; }
}

// BalanceSummary.java

package io.quicktype;

public class BalanceSummary {
    private Long chargesPrincipalCents;
    private Long deferredInterestBalanceCents;
    private Long feesBalanceCents;
    private Long interestBalanceCents;
    private Long loansPrincipalCents;
    private Long totalBalanceCents;

    /**
     * Total principal balance for the account.
     */
    public Long getChargesPrincipalCents() { return chargesPrincipalCents; }
    public void setChargesPrincipalCents(Long value) { this.chargesPrincipalCents = value; }

    /**
     * Total deferred interest balance for the account.
     */
    public Long getDeferredInterestBalanceCents() { return deferredInterestBalanceCents; }
    public void setDeferredInterestBalanceCents(Long value) { this.deferredInterestBalanceCents = value; }

    /**
     * Total fee balance for the account.
     */
    public Long getFeesBalanceCents() { return feesBalanceCents; }
    public void setFeesBalanceCents(Long value) { this.feesBalanceCents = value; }

    /**
     * Total interest balance for the account.
     */
    public Long getInterestBalanceCents() { return interestBalanceCents; }
    public void setInterestBalanceCents(Long value) { this.interestBalanceCents = value; }

    /**
     * Total principal balance for loans for the account.
     */
    public Long getLoansPrincipalCents() { return loansPrincipalCents; }
    public void setLoansPrincipalCents(Long value) { this.loansPrincipalCents = value; }

    /**
     * The total balance (in cents) associated with the account.
     */
    public Long getTotalBalanceCents() { return totalBalanceCents; }
    public void setTotalBalanceCents(Long value) { this.totalBalanceCents = value; }
}

// CycleSummary.java

package io.quicktype;

import java.time.OffsetDateTime;

public class CycleSummary {
    private Long cycleChargeReturnsCents;
    private Long cycleChargesCents;
    private Long cycleCreditAdjustmentsCents;
    private Long cycleDebitAdjustmentsCents;
    private Long cycleDeferredInterestCents;
    private OffsetDateTime cycleExclusiveEnd;
    private Long cycleForgivenDeferredInterestCents;
    private OffsetDateTime cycleInclusiveStart;
    private Long cycleInterestCents;
    private Long cycleLateFeesCents;
    private Long cycleLoansCents;
    private Long cyclePaymentReversalsCents;
    private Long cyclePaymentReversalsFeesCents;
    private Long cyclePaymentsCents;

    /**
     * Sum of all returns that occurred on the account during the billing cycle.
     */
    public Long getCycleChargeReturnsCents() { return cycleChargeReturnsCents; }
    public void setCycleChargeReturnsCents(Long value) { this.cycleChargeReturnsCents = value; }

    /**
     * Sum of all charges that occurred on the account during the billing cycle.
     */
    public Long getCycleChargesCents() { return cycleChargesCents; }
    public void setCycleChargesCents(Long value) { this.cycleChargesCents = value; }

    /**
     * Sum of all credit adjustment amounts that occurred on the account during the billing
     * cycle.
     */
    public Long getCycleCreditAdjustmentsCents() { return cycleCreditAdjustmentsCents; }
    public void setCycleCreditAdjustmentsCents(Long value) { this.cycleCreditAdjustmentsCents = value; }

    /**
     * Sum of all debit adjustment amounts that occurred on the account during the billing cycle.
     */
    public Long getCycleDebitAdjustmentsCents() { return cycleDebitAdjustmentsCents; }
    public void setCycleDebitAdjustmentsCents(Long value) { this.cycleDebitAdjustmentsCents = value; }

    /**
     * Total interest accrued during the billing cycle.
     */
    public Long getCycleDeferredInterestCents() { return cycleDeferredInterestCents; }
    public void setCycleDeferredInterestCents(Long value) { this.cycleDeferredInterestCents = value; }

    /**
     * The inclusive ending `Date-Time` that defines which transations are part of this
     * statement.
     */
    public OffsetDateTime getCycleExclusiveEnd() { return cycleExclusiveEnd; }
    public void setCycleExclusiveEnd(OffsetDateTime value) { this.cycleExclusiveEnd = value; }

    /**
     * Total deferred interest that was forgiven on the account during the billing cycle.
     */
    public Long getCycleForgivenDeferredInterestCents() { return cycleForgivenDeferredInterestCents; }
    public void setCycleForgivenDeferredInterestCents(Long value) { this.cycleForgivenDeferredInterestCents = value; }

    /**
     * The inclusive starting `Date-Time` that defines which transations are part of this
     * statement.
     */
    public OffsetDateTime getCycleInclusiveStart() { return cycleInclusiveStart; }
    public void setCycleInclusiveStart(OffsetDateTime value) { this.cycleInclusiveStart = value; }

    /**
     * Total interest accrued during the billing cycle.
     */
    public Long getCycleInterestCents() { return cycleInterestCents; }
    public void setCycleInterestCents(Long value) { this.cycleInterestCents = value; }

    /**
     * Total late fees incurred during the billing cycle.
     */
    public Long getCycleLateFeesCents() { return cycleLateFeesCents; }
    public void setCycleLateFeesCents(Long value) { this.cycleLateFeesCents = value; }

    /**
     * Sum of all loans amounts that were initiated on the account during the billing cycle.
     */
    public Long getCycleLoansCents() { return cycleLoansCents; }
    public void setCycleLoansCents(Long value) { this.cycleLoansCents = value; }

    /**
     * Sum of all payment reversal amounts that occurred on the account during the billing cycle.
     */
    public Long getCyclePaymentReversalsCents() { return cyclePaymentReversalsCents; }
    public void setCyclePaymentReversalsCents(Long value) { this.cyclePaymentReversalsCents = value; }

    /**
     * Total payment reversal fees incurred during the billing cycle.
     */
    public Long getCyclePaymentReversalsFeesCents() { return cyclePaymentReversalsFeesCents; }
    public void setCyclePaymentReversalsFeesCents(Long value) { this.cyclePaymentReversalsFeesCents = value; }

    /**
     * Sum of all payments that occurred on the account during the billing cycle.
     */
    public Long getCyclePaymentsCents() { return cyclePaymentsCents; }
    public void setCyclePaymentsCents(Long value) { this.cyclePaymentsCents = value; }
}

// MinPayDue.java

package io.quicktype;

import java.time.OffsetDateTime;

public class MinPayDue {
    private long minPayCents;
    private OffsetDateTime minPayDueAt;

    /**
     * Total amount due for the billing cycle, summing cycle principal, interest, deferred
     * interest, and fees outstanding.
     */
    public long getMinPayCents() { return minPayCents; }
    public void setMinPayCents(long value) { this.minPayCents = value; }

    /**
     * The `Date-Time` the payment for this billing cycle is due.
     */
    public OffsetDateTime getMinPayDueAt() { return minPayDueAt; }
    public void setMinPayDueAt(OffsetDateTime value) { this.minPayDueAt = value; }
}

// OpenToBuy.java

package io.quicktype;

public class OpenToBuy {
    private Long availableCreditCents;
    private Long creditLimitCents;
    private Long openToBuyCents;
    private Long totalChargesCents;

    /**
     * The total available credit balance (in cents) for the account.
     */
    public Long getAvailableCreditCents() { return availableCreditCents; }
    public void setAvailableCreditCents(Long value) { this.availableCreditCents = value; }

    /**
     * Total Amount (in cents) that this account can borrow.
     */
    public Long getCreditLimitCents() { return creditLimitCents; }
    public void setCreditLimitCents(Long value) { this.creditLimitCents = value; }

    /**
     * If applicable, the total amount of available funds for continued purchase following a
     * purchase window pattern, where payments made do not replenish amount available for
     * purchase.
     */
    public Long getOpenToBuyCents() { return openToBuyCents; }
    public void setOpenToBuyCents(Long value) { this.openToBuyCents = value; }

    /**
     * Sum of all charges that occurred on the account since account origination.
     */
    public Long getTotalChargesCents() { return totalChargesCents; }
    public void setTotalChargesCents(Long value) { this.totalChargesCents = value; }
}

// Payoff.java

package io.quicktype;

public class Payoff {
    private Long totalPayoffCents;

    /**
     * The total amount slated to pay off the account over the lifecycle of the loan.
     */
    public Long getTotalPayoffCents() { return totalPayoffCents; }
    public void setTotalPayoffCents(Long value) { this.totalPayoffCents = value; }
}
