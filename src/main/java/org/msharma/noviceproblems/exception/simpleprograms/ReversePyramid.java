import java.util.*;
class ReversePyramid
{
public static void main(String arr[])
{
Scanner in=new Scanner(System.in);
System.out.println("enter the length of pyramid ");
int n=in.nextInt();
for(int i=n;i>0;i--)
{
for(int j=0;j<i;j++)
{
System.out.print(j+1);
}
System.out.println();
}
}
}