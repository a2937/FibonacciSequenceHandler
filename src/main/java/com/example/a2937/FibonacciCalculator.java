package com.example.a2937;

/**
 * A calculator that returns either the raw
 * Fibonacci sequence s
 */
public class FibonacciCalculator
{

    /**
     * Gets the fibonacci sequence
     * up to the nth term. Each number in the sequence
     * is separated by a comma.
     *
     * If it is negative, an empty string is returned.
     * @param term the nth term
     * @return the fibonacci sequence
     */
    public static String getFibonacciSequence(int term)
    {
        if(term < 0)
        {
            return "";
        }
        else if(term == 0)
        {
            return "0";
        }
        else if(term == 1)
        {
            return "0,1";
        }
        else
            {
                StringBuilder builder = new StringBuilder();
            builder.append(0).append(',');


            builder.append(1).append(',');

            int secondPreviousNumber = 0;
            int previousNumber = 1;

            int currentNumber = 1;

            for (int i = 0; i < term - 2; i++)
            {
                builder.append(currentNumber);
                if(i != term - 3)
                {
                    builder.append(',');
                }
                secondPreviousNumber = previousNumber;
                previousNumber = (currentNumber);
                currentNumber = previousNumber + secondPreviousNumber;
            }

                return builder.toString();
        }


    }

    /**
     * Gets the sum of the fibonacci
     * sequence up to the nth term.
     * If the nth term is negative, zero is returned.
     *
     * @param term : the term
     * @return the fibonacci sum
     */
    public static int getFibonacciSum(int term)
    {
        if(term < 0)
        {
            return 0;
        }
        else
        {
            String fibSequence = getFibonacciSequence(term + 2);
            int fibNumber= Integer.parseInt(fibSequence.substring(fibSequence.lastIndexOf(',') + 1));
            return fibNumber - 1;
        }
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args)
    {
        System.out.println(getFibonacciSequence(8));
    }





}
