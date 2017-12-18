package org.msharma.noviceproblems.multithreading;

import java.util.Random;

class Joiner extends Thread
{
	int delay;
	public Joiner()
	{
		Random r=new Random();
		delay=r.nextInt(10);
	}
	public void run()
	{
		System.out.println("Joiner is started");
		try{
			System.out.println("dnt disturb Joiner sleeping for "+delay+" sec");
			Thread.sleep(delay*1000);
			System.out.println("Joiner is feeling fresh");
		}
		catch(InterruptedException e){
			System.out.println("Joiner is interrupted");
		}
	}
}
public class JoinTest
{
	public static void main(String arr[])
	{
		System.out.println("main Thread started creating object of Unpredicatble");
		Joiner th=new Joiner();
		System.out.println("giving Joiner 5 sec to complete");
		try{
			th.start();
			th.join(5000);
		}
		catch(Exception e){}
		System.out.println("Main woke up checking status of Joiner");
		if(th.isAlive())
		{
			System.out.println("Joiner taking to much time calling interrupt");
			th.interrupt();
		}
		else
			System.out.println("Joiner completed within time");
	}
}