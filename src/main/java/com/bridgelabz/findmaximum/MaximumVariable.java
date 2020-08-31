package com.bridgelabz.findmaximum;
public class MaximumVariable
{
    /**
     *METHOD TO FIND OUT MAXIMUM AMONG 3 INTEGERS
     * @param firstNumber takes 1st Integer Value
     * @param secondNumber takes 2nd Integer Value
     * @param thirdNUmber takes 3rd Integer Value
     * @return maximum Integer value
     */
    public Integer maximumIntegerValue(Integer firstNumber,Integer secondNumber,Integer thirdNUmber)
    {
        if (firstNumber.compareTo(secondNumber) > 0 && firstNumber.compareTo(thirdNUmber) > 0)
            return firstNumber;
        else if (secondNumber.compareTo(thirdNUmber) > 0 && secondNumber.compareTo(firstNumber) > 0)
            return secondNumber;
        else
            return thirdNUmber;

    }

    /**
     *
     * @param firstNumber takes 1st Float Value
     * @param secondNumber takes 2nd Float Value
     * @param thirdNUmber takes 3rd Float Value
     * @return maximum Float value
     */
    public Float maximumFloatValue(Float firstNumber, Float secondNumber, Float thirdNUmber)
    {
        if (firstNumber.compareTo(secondNumber) > 0 && firstNumber.compareTo(thirdNUmber) > 0)
            return firstNumber;
        else if (secondNumber.compareTo(thirdNUmber) > 0 && secondNumber.compareTo(firstNumber) > 0)
            return secondNumber;
        else
            return thirdNUmber;
    }
    /**
     *
     * @param firstString takes 1st String Value
     * @param secondString takes 2nd String Value
     * @param thirdString takes 3rd String Value
     * @return maximum String value
     */
    public String maximumStringValue(String firstString, String secondString, String thirdString)
    {
        if (firstString.compareTo(secondString) > 0 && firstString.compareTo(thirdString) > 0)
            return firstString;
        else if (secondString.compareTo(thirdString) > 0 && secondString.compareTo(firstString) > 0)
            return secondString;
        else
            return thirdString;
    }
}
