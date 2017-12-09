import java.util.*;
class FactTest
{
public static void main(String arr[])
{
int fact=1;
Scanner in=new Scanner(System.in);
System.out.println("Enter limit");
int n=in.nextInt();
while(n>0)
{
fact=fact*n;
n--;
}
System.out.println(fact);
}
}