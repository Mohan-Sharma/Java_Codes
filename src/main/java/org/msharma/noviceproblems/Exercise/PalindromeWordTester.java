package org.msharma.noviceproblems.Exercise;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.StringTokenizer;

/**
 * Count the number of palindrome words available in the given text file
 */
class PalindromeWordTester
{
	public static void main(String arr[])
	{
		try
		{
			int count=0;
			BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(arr[0])));
			PrintStream out=new PrintStream(new FileOutputStream(arr[1]));
			while(true)
			{
				String line=br.readLine();
				if(line==null)
				break;
				else
				{
					StringTokenizer tr=new StringTokenizer(line," ");
					while(tr.hasMoreTokens())
					{
						String str=tr.nextToken();
						String rev="";
						System.out.println(str);
						for(int i=str.length()-1;i>=0;i--)
						{
							rev=rev+str.charAt(i);
							if(str.equals(rev))
							{
								count++;
								out.println(str);
							}
						}
					}
					out.println("No of palindrome word available = "+count);
					System.out.println(count);
					out.close();
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}