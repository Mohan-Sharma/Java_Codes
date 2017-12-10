package org.msharma.noviceproblems.exception.gc_finalize;

/**
 * Demonstration of Garbage Collector in Java
 */
class mortal
{
	static mortal immortal=null;
	String name;
	public mortal(String n)
	{
		name=n;
		System.out.println("A mortal named "+name+" is born");
	}
	public void finalize()
	{
		System.out.println("Call of death has come for "+name);
		immortal=this;
		System.out.println(name+" has saved himself from the claws of death");
	}
	public void describe()
	{
		System.out.println("Hi im "+name);
		System.out.println("I have become immortal");
	}
}

class God
{
	public static void main(String arr[]) throws Exception
	{
		System.out.println("Sending a mortal name markendey to earth");
		mortal a=new mortal("Markendey");
		Thread.sleep(2000);
		System.out.println("Life of markendey is over calling him back");
		a=null;
		System.gc();
		Thread.sleep(2000);
		System.out.println("Yumraj returned giving him time to rest");
		System.out.println("Checking if any mortal left");
		if(mortal.immortal!=null)
			mortal.immortal.describe();
	}
}
