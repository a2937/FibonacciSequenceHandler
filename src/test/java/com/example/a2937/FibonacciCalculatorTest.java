package com.example.a2937;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciCalculatorTest {


    @Test
    public void ProvideNegativeNumberForFibSequence()
    {
        Assert.assertEquals("",FibonacciCalculator.getFibonacciSequence(-1));
    }

    @Test
    public void ProvideZeroForFibSequence()
    {
        Assert.assertEquals("0",FibonacciCalculator.getFibonacciSequence(0));
    }

    @Test
    public void ProvideOneForFibSequence()
    {
        Assert.assertEquals("0,1",FibonacciCalculator.getFibonacciSequence(1));
    }

    @Test
    public void getFibonacciSequenceForFive()
    {
        Assert.assertEquals("0,1,1,2,3",FibonacciCalculator.getFibonacciSequence(5));
    }

    @Test
    public void getSumForNegativeNumber()
    {
        Assert.assertEquals(0,FibonacciCalculator.getFibonacciSum(-5));
    }

    @Test
    public void getFibonacciSumForFive()
    {
        Assert.assertEquals(7,FibonacciCalculator.getFibonacciSum(5));
    }
}