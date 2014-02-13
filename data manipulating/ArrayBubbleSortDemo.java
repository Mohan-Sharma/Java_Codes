import java.util.Scanner;
class BubbleSortAlgo
{
public static void bubbleSort(int arr[])
{
int i,j,t=0;
for(i=0;i<arr.length;i++)
{
for(j=1;j<(arr.length-i);j++)
{
if(arr[j-1]>arr[j])
{
t=arr[j-1];
arr[j-1]=arr[j];
arr[j]=t;
}
}
}
}
}
class ArrayBubbleSortDemo
{
public static void main(String aa[])
{
int x[];
Scanner in=new Scanner(System.in);
System.out.println("Enter the size of the array");
int s=in.nextInt();
x=new int[s];
for(int i=0;i<s;i++)
{
System.out.println("Enter the element at "+i+1+ "position: ");
x[i]=in.nextInt();
} 
for(int i=0;i<s;i++)
{
System.out.println("Elements enter at position- "+1+i+" :"+x[i]+"\t");
}
BubbleSortAlgo.bubbleSort(x);
System.out.println("After sorting:");
for(int i=0;i<s;i++)
{
System.out.println(x[i]+"\t");
}
}
}