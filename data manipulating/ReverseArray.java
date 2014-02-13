importjava.util.Scanner;
class AlgorithmToReverse
{
public static int reverse(int arr[])
{
int m=arr.length/2;
int j=arr.length-1;
for(int i=0;i<m;i++)
{
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
j--;
}
}
}
class ReverseArray
{
public static void main(String arr[])
{
int a[];
Scanner in=new Scanner(System.in);
System.out.println("Enter the size of an array");
int s=in.nextInt();
for(int i=0;i<s;i++)
{
System.out.println("Element at "+i+1+" position:");
a[s]=in.nextInt();
}
for(int i=0;i<s;i++)
{
System.out.println("Elements entered at" +i+1+ "are:"+a[i]+"\t");
}
AlgorithmToReverse.reverse(a);
Syste,.out.println("Elements after reversing:");
for(int i=0;i<s;i++)
{
System.out.println(a[i]+"\t");
}
}
}