package com.bridgelabz.findmaximum;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximumVariable
{
    @Test
    public void testWelcomeMessage()
    {
        MaximumVariable maximumVariable = new MaximumVariable();
        String message = maximumVariable.welcomeMessage("Welcome to find maximum value");
        Assert.assertEquals("Welcome",message);
    }
}
