import java.util.*;
class pyramidOfSeriesNo
{
public static void main(String arr[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter limit");
int n=in.nextInt();
System.out.println("Enter the series sequence");
int x=in.nextInt();
int y=0;
for(int i=0;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(y);
y=y+x;
}
System.out.println();
}
}
}