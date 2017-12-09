import java.util.*;
class PalindromeSeries
{
public static void main(String arr[])
{
Scanner in=new Scanner(System.in);
int n[]=new int[10];
for(int i=0;i<n.length;i++)
{
int b,c=0;
System.out.println("Enter the number at: "+i);
n[i]=in.nextInt();
int num=n[i];
while(num>0)
{
b=num%10;
c=c*10+b;
num=num/10;
}
if(n[i]==c)
System.out.println(n[i]+" is palindrome");
else
System.out.println(n[i]+" is not palindrome");
}
}
}