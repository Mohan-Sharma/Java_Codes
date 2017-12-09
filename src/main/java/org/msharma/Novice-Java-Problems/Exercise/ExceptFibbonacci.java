import java.util.*;
class ExceptFibbonacci
{
	public static void main(String arr[])
	{
		Set mySet=new HashSet();
		Set fibboSet=new HashSet();
		for(int i=0;i<=100;i++)
		{
			mySet.add(i);
		}
		int first=0;int second=1;int sum=0;
		System.out.print("Fibbonacci series : ");
		while(first<100)
		{
			sum=first+second;
			System.out.print(first+" , ");
			fibboSet.add(first);
			first=second;second=sum;
		}
		System.out.println();
		mySet.removeAll(fibboSet);
		System.out.println("Excluding fibbonacci series : "+mySet);
	}
}