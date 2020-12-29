/**
 * The configured minimum payment required for a given pay period.
 */
export interface BasePolicyConfigMinPay {
  /**
   * The percentage of total balance calculated for min pay. (i.e. 20 means 20%)
   */
  percentage: number;
}
