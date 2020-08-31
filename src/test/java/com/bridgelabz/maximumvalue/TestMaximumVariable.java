package com.bridgelabz.maximumvalue;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestMaximumVariable
{

    @Test
    public void givenMaximumIntegerValueAt_FirstPosition_ShouldReturnSameNumber()
    {
        Integer maximum = new MaximumVariable<>(Arrays.asList(99,34,56,22,4,69,90,95,2,1)).maximumValue();
        Assert.assertEquals((Integer)99,maximum);
    }


    @Test
    public void givenMaximumFloatValueAt_FirstPosition_ShouldReturnSameValue()
    {
        Float maximum = new MaximumVariable<>(Arrays.asList(2.4f,5.4f,0.4f,7.9f,6.9f,9.9f,2.0f)).maximumValue();
        Assert.assertEquals((Float)9.9f,maximum);
    }

    @Test
    public void givenMaximumStringValueAt_FirstPosition_ShouldReturnSameValue()
    {
        String maximum = new MaximumVariable<>(Arrays.asList("Apple","Peach","Banana","Dog","Snake","Red")).maximumValue();
        Assert.assertEquals("Snake" ,maximum);
    }

}
