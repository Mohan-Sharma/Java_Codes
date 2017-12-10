import java.util.*;
class DecimalToBinary
{
public static void main(String arr[])
{
int a[]=new int[20];
int index=0;
Scanner in=new Scanner(System.in);
int num=in.nextInt();
while(num>0)
{
a[index++]=num%2;
num=num/2;
}
for(int i=index-1;i>=0;i--)
{
System.out.print(a[i]);
}
}
}