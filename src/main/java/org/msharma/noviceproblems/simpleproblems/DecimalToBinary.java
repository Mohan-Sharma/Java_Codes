package org.msharma.noviceproblems.simpleproblems;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Convert Decimal to Binary in Java
 */
class DecimalToBinary
{
	public static void main(String arr[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number");
		int num = in.nextInt();
		int number = num;
		int index = 0;
		int numberOfDigits = 0;
		while(number > 0)
		{
			numberOfDigits++;
			number = number / 10;
		}
		int[] storage = new int[numberOfDigits];

		while(num>0)
		{
			storage[index++]=num%2;
			num=num/2;

		}

		System.out.println(Arrays.toString(storage));
	}
}