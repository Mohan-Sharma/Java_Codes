import java.util.*;
class BinarySearch
{
public static void main(String arr[])
{
int n;
int a[];
Scanner in=new Scanner(System.in);
System.out.println("Enter the number of elements in the array...");
n=in.nextInt();
a=new int[n];
System.out.println("Enter the elments in the array...");
for(int i=0;i<a.length;i++)
{
System.out.println("Enter the element at position : "+(i+1));
a[i]=in.nextInt();
}
int first=0;int last=n-1;
System.out.println("Enter the element to be searched...");
int elem=in.nextInt();
int mid=(first+last)/2;
while(first<=last)
{
if(elem<a[mid])
{
last=mid-1;
}
else if(elem==a[mid])
{
System.out.println("Element found at location : "+(mid+1));
break;
}
else
{
first=mid+1;
mid=first+last;
}
}
if(first>last)
System.out.println("Element doesnot exists in the list...");
}
}