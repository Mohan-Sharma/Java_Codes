import java.util.*;
import java.io.*;
class FactWithoutRec
{
	public static void main(String arr[])
	{
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the number..");
	int num=in.nextInt();
	int fact=1;
	while(num>0)
	{
	fact=fact*num;
	num--;
	}
	System.out.println("Factorial ="+fact);
	}
}