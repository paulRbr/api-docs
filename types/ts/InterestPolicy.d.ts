/**
 * The Interest Policy Object
 */
export interface InterestPolicy {
  /**
   * Affects the base calculation by determining how many days there are in a given year.
   */
  day_calc_type: DayCalcType;
  /**
   * Interest for this policy is calculated at this time every X interval.
   */
  interest_calc_time: string;
  /**
   * The actual base formula used to calculate and assign interest.
   */
  method: Method;
  type: Type;
}

/**
 * Affects the base calculation by determining how many days there are in a given year.
 */
export enum DayCalcType {
  The365 = "365",
}

/**
 * The actual base formula used to calculate and assign interest.
 */
export enum Method {
  AverageDailyBalance = "average daily balance",
}

export enum Type {
  Compound = "compound",
}
