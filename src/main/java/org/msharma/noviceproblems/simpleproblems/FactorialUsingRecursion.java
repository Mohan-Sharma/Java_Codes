package org.msharma.noviceproblems.simpleproblems;

import java.util.Scanner;

/**
 * This Example demonstrates how to find the factorial using recursion.
 */
class FactorialUsingRecursion
{
	public int factorialFinder(int number)
	{
		if(number == 1)
			return 1;
		else
			return factorialFinder(number-1) * number;

	}

	public static void main(String arr[])
	{
		FactorialUsingRecursion factorialUsingRecursion = new FactorialUsingRecursion();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number..");
		int number = in.nextInt();
		System.out.println(factorialUsingRecursion.factorialFinder(number));
	}
}