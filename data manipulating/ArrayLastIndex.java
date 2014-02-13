import java.util.Scanner;
class DemoSearch
{
public static int lastIndexArray(int arr[],int element)
{
int j=arr.length-1;
return j;
}
}
class ArrayLastIndex
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
System.out.println("Enter the last element to be searched:");
b=in.nextInt();
int index=DemoSearch.lastIndexArray(a,b);
if(index==-1)
System.out.println(b+"not found in the array");
else
System.out.println(b+"found at "+index+" index in the array");
}
}