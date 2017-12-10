package org.msharma.noviceproblems.exception.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Demonstrates how to read data from input source to buffer and write data from buffer to output source.
 * Provide the source and target file name as command line argument.
 */
class EfficientCopier
{
	public static void main(String arr[]) throws IOException
	{
		try(
			FileInputStream src=new FileInputStream(arr[0]);
			FileOutputStream target=new FileOutputStream(arr[1]))
		{
			long t1=System.currentTimeMillis();
			byte data[]=new byte[src.available()];
			src.read(data);
			target.write(data);
			target.close();
			long t2=System.currentTimeMillis();
			long t=t2-t1;
			System.out.println("Successfully copied in "+t+" sec");
		}
	}
}