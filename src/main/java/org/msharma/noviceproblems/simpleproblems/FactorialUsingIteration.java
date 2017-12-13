package org.msharma.noviceproblems.simpleproblems;

import java.util.Scanner;

/**
 * This Example demonstrates how to find factorial using iteration in Java
 */
class FactorialUsingIteration
{
	public static void main(String arr[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number..");
		int num = in.nextInt();
		int fact = 1;
		while(num > 0)
		{
			fact *= num;
			num--;
		}
		System.out.println("Factorial = " + fact);
	}
}