package org.msharma.noviceproblems.simpleproblems;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * This Example demonstrates the use of {@link StringTokenizer} to count number of repeating tokens in Java
 */
class CountSameToken
{
	public static void main(String arr[])
	{
		int count=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the input String..");
		String str1=in.nextLine();
		System.out.println("Enter the string which is to be counted in the input string..");
		String str2=in.nextLine();
		StringTokenizer tr=new StringTokenizer(str1," ");
		while(tr.hasMoreTokens())
		{
			String str3=tr.nextToken();
			if(str3.equalsIgnoreCase(str2))
			{
				count++;
			}
		}
		System.out.println("No of repeating token= "+count);
	}

}