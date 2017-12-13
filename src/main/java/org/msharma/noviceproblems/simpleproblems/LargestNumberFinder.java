package org.msharma.noviceproblems.simpleproblems;

import java.util.Scanner;

/**
 * This Example demonstrate how to find the largest number in an Array in Java
 */
class LargestNumberFinder
{
	public static void main(String arr[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int sizeOfArray = in.nextInt();
		int[] storage = new int[sizeOfArray];

		for(int i=0; i<sizeOfArray; i++)
		{
			System.out.println("Enter the element at " + i + " position");
			storage[i] = in.nextInt();

		}
		int max = storage[0];
		for(int i=0; i<sizeOfArray; i++)
		{
			if(storage[i] > max)
				max = storage[i];
		}
		System.out.println("Largest Number="+max);
	}
}