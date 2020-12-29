package io.quicktype;

/**
 * The configured minimum payment required for a given pay period.
 */
public class BasePolicyConfigMinPay {
    private double percentage;

    /**
     * The percentage of total balance calculated for min pay. (i.e. 20 means 20%)
     */
    public double getPercentage() { return percentage; }
    public void setPercentage(double value) { this.percentage = value; }
}
