package org.msharma.noviceproblems.Practise;

class Swapper
{
	int x, y;
	public Swapper(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public void display()
	{
		System.out.println("x= "+x);
		System.out.println("y= "+y);
	}
	public void swap()
	{
		int z=x;
		x=y;
		y=z;
	}
	public static void main(String arr[])
	{
		Swapper z=new Swapper(5,6);
		z.display();
		z.swap();
		z.display();
	}
}