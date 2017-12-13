package org.msharma.noviceproblems.simpleproblems;

import java.util.Scanner;

/**
 * This Example demonstrates the how to find the length of string.
 */
class CharacterCount
{
	public static void main(String arr[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string..");
		String str=in.nextLine();
		System.out.println("No of character "+str.length());
	}
}