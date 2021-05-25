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
    type:   Type;
}

/**
 * Affects the base calculation by determining how many days there are in a given year.
 */
export type DayCalcType = 
    "365";

/**
 * The actual base formula used to calculate and assign interest.
 */
export type Method = 
    "average daily balance";

export type Type = 
    "compound";
