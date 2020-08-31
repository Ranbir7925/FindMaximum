package com.bridgelabz.findmaximum;
public class MaximumVariable
{

    public Integer maximumIntegerValue(Integer firstNumber,Integer secondNumber,Integer thirdNUmber)
    {
        if (firstNumber.compareTo(secondNumber) > 0 && firstNumber.compareTo(thirdNUmber) > 0)
            return firstNumber;
        else if (secondNumber.compareTo(thirdNUmber) > 0 && secondNumber.compareTo(firstNumber) > 0)
            return secondNumber;
        else
            return thirdNUmber;

    }

    public Float maximumFloatValue(Float firstNumber, Float secondNumber, Float thirdNUmber)
    {
        if (firstNumber.compareTo(secondNumber) > 0 && firstNumber.compareTo(thirdNUmber) > 0)
            return firstNumber;
        else if (secondNumber.compareTo(thirdNUmber) > 0 && secondNumber.compareTo(firstNumber) > 0)
            return secondNumber;
        else
            return thirdNUmber;
    }
}
