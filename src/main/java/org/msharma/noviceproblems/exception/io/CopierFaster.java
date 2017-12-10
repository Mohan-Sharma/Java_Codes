package org.msharma.noviceproblems.exception.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * Demonstrates how to copy faster by reading line by line from source to target file.
 * Provide the source and target file name as command line argument.
 */
class CopierFaster
{
	public static void main(String arr[]) throws IOException
	{
		try (BufferedReader src=new BufferedReader(new InputStreamReader(new FileInputStream(arr[0])));
			PrintStream target=new PrintStream(new FileOutputStream(arr[1])))
		{
			long t1=System.currentTimeMillis();
			while(true)
			{
				String str=src.readLine();
				if(str==null)
					break;
				target.println(str);
			}
			target.close();
			long t2=System.currentTimeMillis();
			long t=t2-t1;
			System.out.println("Successfully copied in "+t+" sec");
		}
	}
}