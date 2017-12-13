package org.msharma.noviceproblems.simpleprograms;

import java.util.Scanner;

/**
 * This Example demonstrates how to print reverse pyramid.
 	12321
 	 121
      1
 */
class ReversePyramid
{
	public static void main(String arr[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of pyramid ");
		int n = in.nextInt();
		int z = 1;
		for(int i=n; i>0; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j);
			}
			for(int j=i-1; j>0; j--)
			{
				System.out.print(j);
			}
			System.out.println();
			for(int j=1; j<=z; j++)
			{
				System.out.print(" ");
			}
			z++;
		}
	}
}