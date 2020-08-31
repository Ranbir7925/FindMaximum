package com.bridgelabz.findmaximum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
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
}
