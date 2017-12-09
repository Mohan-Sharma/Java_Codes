import java.util.*;
import java.io.*;
class DectoBinary
{
public static void main(String arr[])
{
	Scanner in=new Scanner(System.in);
	System.out.println("enter the number");
	int num=in.nextInt();
	int a[]=new int[30];
	int index=0;
	while(num>0)
	{
		a[index++]=num%2;
		num=num/2;

	}
	for(int i=index-1;i>=0;i--)
	{
		System.out.println(a[i]);
	}
}
}