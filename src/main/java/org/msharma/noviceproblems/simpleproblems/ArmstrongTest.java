package org.msharma.noviceproblems.simpleproblems;

import java.util.Scanner;

/**
 * Find Armstrong number in Java.
 */
class ArmstrongTest
{
	public static void main(String arr[])
	{
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the number to find the armstrong...");
		int num = in.nextInt();
		int originalNumber = num;
		int newNumberConstructed=0;
		int numberOfDigits = 0;
		while(num > 0)
		{
			numberOfDigits++;
			num = num / 10;
		}
		num = originalNumber;
		while(num > 0)
		{
			int rem = num % 10;
			newNumberConstructed = newNumberConstructed + (int)Math.pow(rem,numberOfDigits);
			num = num / 10;
		}
		if(newNumberConstructed == originalNumber)
		{
			System.out.println(originalNumber +" is armstrong...");
		}
		else
			System.out.println("it is not..");
	}
}