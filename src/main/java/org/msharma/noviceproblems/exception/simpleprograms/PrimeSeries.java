import java.util.*;
class PrimeSeries
{
public static void main(String arr[])
{
Scanner in=new Scanner(System.in);
System.out.println("prime number upto");
int num=in.nextInt();
for(int i=2;i<num;i++)
{
int flag=0;
for(int j=2;j<i;j++)
{
if(i%j==0)
{
flag=1;
break;
}
}
if(flag==0)
System.out.println(i+" is prime");
else 
System.out.println(i+" is not prime");
 }}
}