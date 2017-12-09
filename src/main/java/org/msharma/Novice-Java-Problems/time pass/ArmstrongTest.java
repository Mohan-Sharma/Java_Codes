import java.util.*;
class ArmstrongTest
{
public static void main(String arr[])
{
Scanner in =new Scanner(System.in);
System.out.println("Enter the number to find the amstrong...");
int num=in.nextInt();
int n=num;
int check=0;
while(num>0)
{
int rem=num%10;
check=check+(int)Math.pow(rem,3);
num=num/10; 
}
if(check==n)
{
System.out.println(n+" is armstrong...");
}
else
System.out.println("it is not..");
}
}