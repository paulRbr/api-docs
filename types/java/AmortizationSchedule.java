package io.quicktype;

/**
 * Amortization schedule
 */
public class AmortizationSchedule {
    private double amCyclePaymentCents;
    private double amDeferredCents;
    private Double amEndPrincipalBalanceCents;
    private double amEndTotalBalanceCents;
    private double amInterestCents;
    private double amMinPayCents;
    private double amPrincipalCents;
    private Double amStartPrincipalBalanceCents;
    private double amStartTotalBalanceCents;
    private String cycleExclusiveEnd;
    private long lineItemID;
    private String minPayDueAt;
    private Boolean paidOnTime;

    /**
     * The amount in cents that was actually paid towards the loan during the billing cycle
     */
    public double getAmCyclePaymentCents() { return amCyclePaymentCents; }
    public void setAmCyclePaymentCents(double value) { this.amCyclePaymentCents = value; }

    /**
     * The amount in cents allocated to deferred interest from this am payment
     */
    public double getAmDeferredCents() { return amDeferredCents; }
    public void setAmDeferredCents(double value) { this.amDeferredCents = value; }

    /**
     * The ending principal balance on the loan after this payment
     */
    public Double getAmEndPrincipalBalanceCents() { return amEndPrincipalBalanceCents; }
    public void setAmEndPrincipalBalanceCents(Double value) { this.amEndPrincipalBalanceCents = value; }

    /**
     * The ending balance on the loan after this payment
     */
    public double getAmEndTotalBalanceCents() { return amEndTotalBalanceCents; }
    public void setAmEndTotalBalanceCents(double value) { this.amEndTotalBalanceCents = value; }

    /**
     * The amount in cents allocated to interest from this am payment
     */
    public double getAmInterestCents() { return amInterestCents; }
    public void setAmInterestCents(double value) { this.amInterestCents = value; }

    /**
     * The amount due just for the am schedule. This accounts for principal, interest, and
     * deferred interest balance but does not include fees.
     */
    public double getAmMinPayCents() { return amMinPayCents; }
    public void setAmMinPayCents(double value) { this.amMinPayCents = value; }

    /**
     * The amount in cents allocated to principal from this am payment
     */
    public double getAmPrincipalCents() { return amPrincipalCents; }
    public void setAmPrincipalCents(double value) { this.amPrincipalCents = value; }

    /**
     * The starting principal balance on the loan before this payment
     */
    public Double getAmStartPrincipalBalanceCents() { return amStartPrincipalBalanceCents; }
    public void setAmStartPrincipalBalanceCents(Double value) { this.amStartPrincipalBalanceCents = value; }

    /**
     * The starting balance on the loan before this payment
     */
    public double getAmStartTotalBalanceCents() { return amStartTotalBalanceCents; }
    public void setAmStartTotalBalanceCents(double value) { this.amStartTotalBalanceCents = value; }

    /**
     * The date-time the am cycle ends.
     */
    public String getCycleExclusiveEnd() { return cycleExclusiveEnd; }
    public void setCycleExclusiveEnd(String value) { this.cycleExclusiveEnd = value; }

    /**
     * The ID of this generated amortization schedule.
     */
    public long getLineItemID() { return lineItemID; }
    public void setLineItemID(long value) { this.lineItemID = value; }

    /**
     * The date the minimum payment for the am schedule is due.
     */
    public String getMinPayDueAt() { return minPayDueAt; }
    public void setMinPayDueAt(String value) { this.minPayDueAt = value; }

    /**
     * Indicates whether the amount for this am payment was paid on time; only present if the
     * date scheduled for the am payment has passed as of the time of the request.
     */
    public Boolean getPaidOnTime() { return paidOnTime; }
    public void setPaidOnTime(Boolean value) { this.paidOnTime = value; }
}
