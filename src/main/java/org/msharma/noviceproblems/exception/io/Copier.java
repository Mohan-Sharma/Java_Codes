package org.msharma.noviceproblems.exception.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Demonstrates how to copy char by char from one file to another.
 * Provide the source and target file name as command line argument.
 */
class Copier
{
	public static void main(String arr[]) throws IOException
	{
		try(FileInputStream src=new FileInputStream(arr[0]); FileOutputStream target=new FileOutputStream(arr[1]))
		{
			while(true)
			{
				int ch=src.read();
				if(ch==-1)
					break;
				target.write(ch);
			}
			target.close();
		}
		System.out.println("Successfully copied");
	}

}