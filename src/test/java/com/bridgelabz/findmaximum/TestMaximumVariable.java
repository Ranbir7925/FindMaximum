package com.bridgelabz.findmaximum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMaximumVariable
{
   MaximumVariable maximumVariable=null;
   @Before
   public void createObjectOf_MaximumVariableClass()
   {
        maximumVariable = new MaximumVariable();
   }

    @Test
    public void givenMaximumNumberAt_FirstPosition_ShouldReturnSameNumber()
    {
        Integer maximum = maximumVariable.maximumValue(99,55,44);
        Assert.assertEquals((Integer)99,maximum);
    }

    @Test
    public void givenMaximumNumberAt_SecondPosition_ShouldReturnSameNumber()
    {
        Integer maximum = maximumVariable.maximumValue(55,99,69);
        Assert.assertEquals((Integer)99,maximum);
    }

    @Test
    public void givenMaximumNumberAt_ThirdPosition_ShouldReturnSameNumber()
    {
        Integer maximum = maximumVariable.maximumValue(55,69,99);
        Assert.assertEquals((Integer) 99,maximum);
    }
}
