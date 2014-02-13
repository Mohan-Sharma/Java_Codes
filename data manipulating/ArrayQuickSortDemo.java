import java.util.Scanner;
class QuickSortAlgo
{
public static void quickSort(int arr[],int lb,int ub)
{
int a=lb;
int b=ub;
if(a>=b)
{
return;
}
int mid=arr[(a+b)/2];
while(a<b)
{
while(a<b && arr[a]<mid)
{
a++;
}
while(a<b && arr[b]>mid)
{
b--;
}
if(a<b)
{
int t=arr[a];
arr[a]=arr[b];
arr[b]=t;
}
}
if(b<a)
{
int t=b;
b=a;
a=t;
}
quickSort(arr,lb,a);
quickSort(arr,a==lb?a+1:a,b);
}
}
class ArrayQuickSortDemo
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
QuickSortAlgo.quickSort(x,0,x.length-1);
System.out.println("After sorting:");
for(int i=0;i<s;i++)
{
System.out.println(x[i]+"\t");
}
}
}