package com.raylabz.opensimplex;

/**
 * Models a range of values.
 */
public class Range {

    private final double minimumValue;
    private final double maximumValue;

    /**
     * Instantiates a range.
     * @param minimumValue The minimum value of the range.
     * @param maximumValue The maximum value of the range.
     */
    public Range(double minimumValue, double maximumValue) {
        this.minimumValue = minimumValue;
        this.maximumValue = maximumValue;
    }

    /**
     * Retrieves the minimum value of the range.
     * @return Returns minimum value.
     */
    public double getMinimumValue() {
        return minimumValue;
    }

    /**
     * Retrieves the maximum value of the range.
     * @return Returns maximum value.
     */
    public double getMaximumValue() {
        return maximumValue;
    }

}
