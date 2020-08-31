package com.bridgelabz.maximumvalue;

import org.junit.Assert;
import org.junit.Test;
public class TestMaximumVariable
{

    @Test
    public void givenMaximumIntegerValueAt_FirstPosition_ShouldReturnSameNumber()
    {
        Integer maximum = new MaximumVariable<>(99,69,55).maximumValue();
        Assert.assertEquals((Integer)99,maximum);
    }

    @Test
    public void givenMaximumIntegerValueAt_SecondPosition_ShouldReturnSameNumber()
    {
        Integer maximum = new MaximumVariable<>(55,99,69).maximumValue();
        Assert.assertEquals((Integer)99,maximum);
    }

    @Test
    public void givenMaximumIntegerValueAt_ThirdPosition_ShouldReturnSameNumber()
    {
        Integer maximum = new MaximumVariable<>(55,69,99).maximumValue();
        Assert.assertEquals((Integer) 99,maximum);
    }

    @Test
    public void givenMaximumFloatValueAt_FirstPosition_ShouldReturnSameValue()
    {
        Float maximum = new MaximumVariable<>(9.1f,4.5f,8.8f).maximumValue();
        Assert.assertEquals((Float)9.1f,maximum);
    }

    @Test
    public void givenMaximumFloatValueAt_SecondPosition_ShouldReturnSameValue()
    {
        Float maximum = new MaximumVariable<>(4.5f,9.1f,8.8f).maximumValue();
        Assert.assertEquals((Float)9.1f,maximum);
    }

    @Test
    public void givenMaximumFloatValueAt_ThirdPosition_ShouldReturnSameValue()
    {
        Float maximum = new MaximumVariable<>(4.5f,8.8f,9.1f).maximumValue();
        Assert.assertEquals((Float)9.1f,maximum);
    }

    @Test
    public void givenMaximumStringValueAt_FirstPosition_ShouldReturnSameValue()
    {
        String maximum = new MaximumVariable<>("Peach","Apple","Banana").maximumValue();
        Assert.assertEquals("Peach" ,maximum);
    }

    @Test
    public void givenMaximumStringValueAt_SecondPosition_ShouldReturnSameValue()
    {
        String maximum = new MaximumVariable<>("Apple","Peach","Banana").maximumValue();
        Assert.assertEquals("Peach" ,maximum);
    }

    @Test
    public void givenMaximumStringValueAt_ThirdPosition_ShouldReturnSameValue()
    {
        String maximum = new MaximumVariable<>("Apple","Banana","Peach").maximumValue();
        Assert.assertEquals("Peach" ,maximum);
    }
}
