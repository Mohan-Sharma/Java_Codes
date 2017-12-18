package org.msharma.noviceproblems.multithreading;

class TestMe
{
	public TestMe()
	{
		Thread th=Thread.currentThread();
		System.out.println("object of A is created by "+th.getName()+" thread");
	}
	public void finalize()
	{
		Thread th=Thread.currentThread();
		System.out.println("Object of A is destroyed by "+th.getName()+" thread");
	}
}
class ThreadTest
{
	static{
		Thread th=Thread.currentThread();
		System.out.println("ThreadTest is loaded by "+th.getName()+" thread");
		System.out.println("creating object of A");
		new TestMe();
		System.gc();
		System.out.println("Changing the name of the main Thread");
		th.setName("First");
		System.out.println("name changed");
		System.out.println("Suspending the thread");
		try
		{
			th.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String arr[])
	{
		Thread th=Thread.currentThread();
		System.out.println("main() is loaded by "+th.getName()+" thread");
	}
}