package org.msharma.noviceproblems.multithreading;

class DaemonThread extends Thread implements Runnable
{
	public void run()
	{
		Thread th=Thread.currentThread();
		if(th.isDaemon())
		{
			System.out.println("run is invoked by "+getName()+" thread");
		}
		else
			System.out.println("new thread started normally");
		try{
			for(int i=0;i<=10;i++)
			{
				System.out.println("run :"+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e){}
		System.out.println("run completed");
	}
}

public class DaemonTest
{
	public static void main(String arr[])
	{
		System.out.println("Main invoked creating abc object");
		DaemonThread x = new DaemonThread();
		System.out.println("Launching run as independent thread");
		Thread th=new Thread(x);
		System.out.println("Starting methodOne new Thread as Daemon");
		th.setDaemon(true);
		th.start();
		try{
			for(int i=10;i>=0;i--)
			{
				System.out.println("main :"+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{}
		System.out.println("main completed");
		System.gc();
	}
}