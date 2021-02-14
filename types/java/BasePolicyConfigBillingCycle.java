package io.quicktype;

/**
 * The Billing Cycle Object
 */
public class BasePolicyConfigBillingCycle {
    private String billingDueDateInterval;
    private String period;

    /**
     * The amount of time you would like between the statement cut and the billing due date. IE
     * '25 days'.  Cannot exceed the start of the next billing cycle and generally needs to be
     * at least 21 days.
     */
    public String getBillingDueDateInterval() { return billingDueDateInterval; }
    public void setBillingDueDateInterval(String value) { this.billingDueDateInterval = value; }

    /**
     * The length of the billing cycle, after which a statement is generated, and a due date
     * assigned. IE '1 month' '3 months' or '7 days' (most common is monthly)
     */
    public String getPeriod() { return period; }
    public void setPeriod(String value) { this.period = value; }
}
