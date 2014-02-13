import java.util.*;
class Palindrome
{
public static void main(String arr[])
{
int b,c=0;
Scanner in=new Scanner(System.in);
System.out.println("Enter the number");
int n=in.nextInt();
int num=n;
while(n>0)
{
b=n%10;
c=c*10+b;
n=n/10;
}
if(num==c)
System.out.println(num+" is palindrome");
else
System.out.println(num+" is not palindrome");
}
}