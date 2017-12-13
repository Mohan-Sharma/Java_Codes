package org.msharma.noviceproblems.simpleprograms;

import java.util.Scanner;

/**
 * This example demonstrates how to find the largest word in a sentence in Java
 */
class LargestWordReturn
{
	public static void main(String arr[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = in.nextLine();
		String line=str.trim();
		String[] word=line.split("\\s+");
		String largest=word[0];
		for(int i=0;i<word.length;i++)
		{
			if(word[i].length() > largest.length())
				largest = word[i];
		}
		System.out.println("Largest word is " + largest + " is of " + largest.length() + " length");
	}
}