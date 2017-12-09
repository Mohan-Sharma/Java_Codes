import java.util.*;
class LargestNoReturn
{
public static void main(String arr[])
{
Scanner in=new Scanner(System.in);
int a[]=new int[5];
int largest;
for(int i=0;i<a.length;i++)
{
System.out.println("enter no at "+i);
a[i]=in.nextInt();
}
largest=a[0];
for(int i=0;i<a.length;i++)
{
if(a[i]>largest)
largest=a[i];
}
System.out.println("Largest is "+largest);
}
}