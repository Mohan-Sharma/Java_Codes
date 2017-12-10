import java.util.*;
class FactWithRec
{
	public int fact(int n)
	{
		if(n==1)
			return 1;
		else
			return fact(n-1)*n;

	}
	public static void main(String arr[])
	{
		FactWithRec a=new FactWithRec();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number..");
		int num=in.nextInt();
		System.out.println(a.fact(num));
	}
}