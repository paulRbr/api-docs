// InterestPolicy.java

package io.quicktype;

import java.time.OffsetTime;

/**
 * The Interest Policy Object
 */
public class InterestPolicy {
    private DayCalcType dayCalcType;
    private OffsetTime interestCalcTime;
    private Method method;
    private Type type;

    /**
     * Affects the base calculation by determining how many days there are in a given year.
     */
    public DayCalcType getDayCalcType() { return dayCalcType; }
    public void setDayCalcType(DayCalcType value) { this.dayCalcType = value; }

    /**
     * Interest for this policy is calculated at this time every X interval.
     */
    public OffsetTime getInterestCalcTime() { return interestCalcTime; }
    public void setInterestCalcTime(OffsetTime value) { this.interestCalcTime = value; }

    /**
     * The actual base formula used to calculate and assign interest.
     */
    public Method getMethod() { return method; }
    public void setMethod(Method value) { this.method = value; }

    public Type getType() { return type; }
    public void setType(Type value) { this.type = value; }
}

// DayCalcType.java

package io.quicktype;

import java.io.IOException;

/**
 * Affects the base calculation by determining how many days there are in a given year.
 */
public enum DayCalcType {
    THE_365;

    public String toValue() {
        switch (this) {
            case THE_365: return "365";
        }
        return null;
    }

    public static DayCalcType forValue(String value) throws IOException {
        if (value.equals("365")) return THE_365;
        throw new IOException("Cannot deserialize DayCalcType");
    }
}

// Method.java

package io.quicktype;

import java.io.IOException;

/**
 * The actual base formula used to calculate and assign interest.
 */
public enum Method {
    AVERAGE_DAILY_BALANCE;

    public String toValue() {
        switch (this) {
            case AVERAGE_DAILY_BALANCE: return "average daily balance";
        }
        return null;
    }

    public static Method forValue(String value) throws IOException {
        if (value.equals("average daily balance")) return AVERAGE_DAILY_BALANCE;
        throw new IOException("Cannot deserialize Method");
    }
}

// Type.java

package io.quicktype;

import java.io.IOException;

public enum Type {
    COMPOUND;

    public String toValue() {
        switch (this) {
            case COMPOUND: return "compound";
        }
        return null;
    }

    public static Type forValue(String value) throws IOException {
        if (value.equals("compound")) return COMPOUND;
        throw new IOException("Cannot deserialize Type");
    }
}
