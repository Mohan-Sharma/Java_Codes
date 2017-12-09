import java.util.*;
class FactTestUsingRecursion
{
public int fact(int num)
{
if(num==1)
return 1;
else 
return fact(num-1)*num;
}
public static void main(String arr[])
{
FactTestUsingRecursion a=new FactTestUsingRecursion();
Scanner in=new Scanner(System.in);
System.out.println("Enter limit");
int n=in.nextInt();

System.out.println(a.fact(n));
}
}