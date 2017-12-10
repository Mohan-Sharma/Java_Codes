import java.util.*;
import java.io.*;
class LargeNumReturn
{
	public static void main(String arr[])
	{
		int a[];
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int s=in.nextInt();
		a=new int[s];
		for(int i=0;i<s;i++)
		{
			System.out.println("Enter the element at "+i+" position");
			a[i]=in.nextInt();

		}
		Arrays.sort(a);
		System.out.println("Largest Number = "+a[(a.length)-1]);
		System.out.println("Second Largest Number = "+a[(a.length)-2]);

		

	}
}