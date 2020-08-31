package com.bridgelabz.findmaximum;
public class MaximumVariable
{
    /**
     *
     * @param firstValue takes 1st Value
     * @param secondValue takes 2nd Value
     * @param thirdValue takes 3rd Value
     * @return maximum value
     */
    public static < T extends Comparable > T maximumValue(T firstValue, T secondValue, T thirdValue)
    {
        if (firstValue.compareTo(secondValue) > 0 && firstValue.compareTo(thirdValue) > 0)
            return firstValue;
        else if (secondValue.compareTo(thirdValue) > 0 && secondValue.compareTo(firstValue) > 0)
            return secondValue;
        else
            return thirdValue;
    }

}
