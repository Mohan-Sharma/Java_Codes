import java.util.Scanner;
class ArrayInsertionSortAlgo
{
public static void insertion_srt(int arr[])
{
  for (int i = 1; i < arr.length; i++)
{
  int j = i;
  int B = arr[i];
  while ((j > 0) && (arr[j-1] > B)){
  arr[j] = arr[j-1];
  j--;
  }
  arr[j] = B;
  }
}
}
class ArrayInsertionSortDemo
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
System.out.println("Enter the element at "+i+1+ "position: ");
a[i]=in.nextInt();
} 
for(int i=0;i<s;i++)
{
System.out.println("Elements enter at position- "+1+i+" :"+a[i]+"\t");
}
ArrayInsertionSortAlgo.insertion_srt(a);
System.out.println("After sorting:");
for(int i=0;i<s;i++)
{
System.out.println(a[i]+"\t");
}}
}