import java.util.Scanner;
class DemoSearch
{
public static int linearSearchArray(int arr[],int element)
{
for(int i=0;i<arr.length;i++)
{
if(arr[i]==element)
return i;
}
return -1;
}
}
class ArrayLinearSearch
{
public static void main(String arr[])
{
int a[],b;
Scanner in=new Scanner(System.in);
System.out.println("Enter the size of the array");
int s=in.nextInt();
a=new int[s];
for(int i=0;i<s;i++)
{
System.out.println("Enter the element at "+i+1+ "position: ");
a[i]=in.nextInt();
} 
for(int i=0;i<s;i++)
{
System.out.println("Elements enter at position- "+1+i+" :"+a[i]+"\t");
}
System.out.println("Enter the element to be searched:");
b=in.nextInt();
int index=DemoSearch.linearSearchArray(a,b);
if(index==-1)
System.out.println(b+"not found in the array");
else
System.out.println(b+"found at "+index+" index in the array");
}
}