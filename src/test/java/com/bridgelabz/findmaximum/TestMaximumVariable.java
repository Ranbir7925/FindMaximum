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
    public void givenMaximumFloatValueAt_FirstPosition_ShouldReturnSameValue()
    {
        Float maximum = maximumVariable.maximumFloatValue(9.1f,4.5f,8.8f);
        Assert.assertEquals((Float)9.1f,maximum);
    }

    @Test
    public void givenMaximumFloatValueAt_SecondPosition_ShouldReturnSameValue()
    {
        Float maximum = maximumVariable.maximumFloatValue(4.5f,9.1f,8.8f);
        Assert.assertEquals((Float)9.1f,maximum);
    }

    @Test
    public void givenMaximumFloatValueAt_ThirdPosition_ShouldReturnSameValue()
    {
        Float maximum = maximumVariable.maximumFloatValue(4.5f,8.8f,9.1f);
        Assert.assertEquals((Float)9.1f,maximum);
    }

    @Test
    public void givenMaximumStringValueAt_FirstPosition_ShouldReturnSameValue()
    {
        String maximum = maximumVariable.maximumStringValue("Peach","Apple","Banana");
        Assert.assertEquals("Peach" ,maximum);
    }

    @Test
    public void givenMaximumStringValueAt_SecondPosition_ShouldReturnSameValue()
    {
        String maximum = maximumVariable.maximumStringValue("Apple","Peach","Banana");
        Assert.assertEquals("Peach" ,maximum);
    }
}
