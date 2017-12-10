package org.msharma.noviceproblems.exception;

/**
 * Example to demonstrate how to re-throw exception in Java.
 */
class RethrowTest
{
	public static int divide(int a,int b) throws Exception
	{
		try
		{
			return a/b;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Rethrowing exception");
			throw(ae);
		}
	}
	public static void main(String arr[]) throws Exception
	{
		if(arr.length<2)
			throw(new Exception("Two arguments must be provided"));
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int c = divide(a,b);
		System.out.println("Result is " + c);
	}
}