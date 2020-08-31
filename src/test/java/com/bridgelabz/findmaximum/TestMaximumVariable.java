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
    public void givenMaximumIntegerValueAt_FirstPosition_ShouldReturnSameNumber()
    {
        Integer maximum = maximumVariable.maximumIntegerValue(99,55,44);
        Assert.assertEquals((Integer)99,maximum);
    }

    @Test
    public void givenMaximumIntegerValueAt_SecondPosition_ShouldReturnSameNumber()
    {
        Integer maximum = maximumVariable.maximumIntegerValue(55,99,69);
        Assert.assertEquals((Integer)99,maximum);
    }

    @Test
    public void givenMaximumIntegerValueAt_ThirdPosition_ShouldReturnSameNumber()
    {
        Integer maximum = maximumVariable.maximumIntegerValue(55,69,99);
        Assert.assertEquals((Integer) 99,maximum);
    }

    @Test
    public void givenMaximumFloatValueAt_FirstPosition_ShouldReturnSameNumber()
    {
        Float maximum = maximumVariable.maximumFloatValue(8.8f,4.5f,9.1f);
        Assert.assertEquals((Float)9.1f,maximum);
    }
}
