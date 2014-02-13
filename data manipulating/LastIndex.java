import java.util.Scanner;
class Array1
{
public static int lastIndexOf(int arr[],int element)
{
element=arr.length-1;
return element;
}
}
class LastIndex
{
public static void main(String arr[])
{
Scanner in=new Scanner(System.in);
int a[];
System.out.println("Enter the size of array");
int s=in.nextInt();
a=new int[s];
System.out.println("Enter the elements of the array");
for(int i=0;i<s;i++)
{
System.out.println("Element at index"+i+1+":");
a[i]=in.nextInt();
}
System.out.println("Enetr last element");
int b=in.nextInt();
int index=Array1.lastIndexOf(a,b);
if(index==-1)
System.out.println(b+" not found int the array");
else
System.out.println("Last element has index"+index);
}
}