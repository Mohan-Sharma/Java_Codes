import java.util.Scanner;
class BinarySearchAlgo
{
public static int binarySearch(int arr[],int element)
{
int start,end,mid;
start=0;
end=arr.length-1;
while(start<=end)
{
mid=(start+end)/2;
if(arr[mid]==element)
{
return mid;
}
else if(arr[mid]<element)
{
start=mid+1;
}
else
{
end=mid-1;
}
}
return -1;
}
}
class ArrayBinarySearchDemo
{
public static void main(String arr[])
{
int a[];
Scanner in=new Scanner(System.in);
System.out.println("Enter the size of the array");
int s=in.nextInt();
a=new int[s];
for(int i=0;i<s;i++)
{
System.out.println("Enter the element at index- "+i+1+" :");
a[i]=in.nextInt();
}
for(int i=0;i<s;i++)
{
System.out.println("Elements entered at index: "+i+1+ "is:"+a[i]+"\t");
}
System.out.println("enter the element to be searched:");
int b=in.nextInt();
int index=BinarySearchAlgo.binarySearch(a,b);
if(index==-1)
{
System.out.println(b+" not found int he array");
}
else
System.out.println(b+ "found at index:" +index+" in the array");
}
}