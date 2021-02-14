/**
 * The Billing Cycle Object
 */
export interface BasePolicyConfigBillingCycle {
  /**
   * The amount of time you would like between the statement cut and the billing due date. IE
   * '25 days'.  Cannot exceed the start of the next billing cycle and generally needs to be
   * at least 21 days.
   */
  billing_due_date_interval: string;
  /**
   * The length of the billing cycle, after which a statement is generated, and a due date
   * assigned. IE '1 month' '3 months' or '7 days' (most common is monthly)
   */
  period: string;
}
