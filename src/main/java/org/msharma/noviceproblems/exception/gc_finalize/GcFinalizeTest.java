package org.msharma.noviceproblems.exception.gc_finalize;

/**
 * How GarbageCollector works
 */
class TestMe
{
	protected static int counter;
	private int no;
	public TestMe()
	{
		no = ++counter;
		System.out.println("object no " + no + " is created");
	}
	public void finalize()
	{
		System.out.println("Object no " + no + " is destroyed");
		counter--;
	}
}
public class GcFinalizeTest
{
	public static void main(String arr[]) throws Exception
	{
		System.out.println("instantiating TestMe");
		TestMe testMe = new TestMe();
		new TestMe();
		System.out.println("Object created calling gc()");
		System.gc();
		System.out.println("Giving time to gc()");
		Thread.sleep(1000);
		System.out.println("gc started checking if any object left");
		System.out.println("There are "+TestMe.counter+" objects left");
	}
}