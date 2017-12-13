package org.msharma.noviceproblems.simpleprograms;

import java.util.Scanner;

/**
 * This example prints sequence number as pyramid in Java
 *  0
 	3 6
 	9 12 15
 	18 21 24 27
 */
class pyramidOfSeriesNo
{
	public static void main(String arr[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of rows to print : ");
		int rows = in.nextInt();
		System.out.println("Enter the series sequence");
		int sequenceNumber = in.nextInt();
		int y=0;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(y);
				System.out.print(" ");
				y += sequenceNumber;
			}
			System.out.println();
		}
	}
}