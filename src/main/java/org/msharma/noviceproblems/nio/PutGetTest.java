package org.msharma.noviceproblems.nio;

import java.nio.ByteBuffer;
import java.util.Scanner;

class PutGetTest
{
	public static void main(String arr[])
	{
		//for single btye
		Scanner in=new Scanner(System.in);
		ByteBuffer buffer=ByteBuffer.allocate(10);
		for(int i=0;i<buffer.capacity();i++)
		{
			System.out.println("Enter the element at :"+(i+1)+" position");
			buffer.put((byte)in.nextInt());
		}
		System.out.println("Displaying the contents of the underlying array...");
		for(int i=0;i<buffer.capacity();i++)
		{
			System.out.println((int)buffer.get(i));
		}
		//for block of byte
		in=new Scanner(System.in);
		byte b[]=new byte[10];
		for(int i=0;i<b.length;i++)
		{
			System.out.println("Enter the element at :"+(i+1)+" position");
			b[i]=(byte)in.nextInt();
		}
		buffer = ByteBuffer.wrap(b);
		System.out.println("Entering the datas into the buffer");
		for(int i=0;i<buffer.capacity();i++)
		{
			buffer.put(b[i]);
		}
		System.out.println("Successfully inserted....");
		System.out.println("Displaying the contents of the byte array from the buffer....");
		for(int i=0;i<buffer.capacity();i++)
		{
			System.out.println("Element at position "+(i+1)+" is "+(int)buffer.get(i));
		}
	}
}