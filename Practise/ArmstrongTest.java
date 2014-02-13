import java.util.*;
class ArmstrongTest
{
public static void main(String arr[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter the number to be checked...");
int num=in.nextInt();
int n=num;
int c=0;
while(num>0)
{
int rem=num%10;
c=c+(int)Math.pow(rem,3);
num=num/10;
}
if(c==n)
System.out.println("It is Armstrong");
else
System.out.println("It is not");
}
}