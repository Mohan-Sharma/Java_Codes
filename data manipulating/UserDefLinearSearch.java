import java.util.Scanner;
class Finder
{
public static int linearSearch(int arr[],int element)
{
for(int i=0;i<arr.length;i++)
{
if(arr[i]==element)
return i;
}
return -1;
}
}
class UserDefLinearSearch
{
public static void main(String arr[])
{
Scanner in=new Scanner(System.in);
int array[];
System.out.println("Enter the size of the array");
int s=in.nextInt();
array=new int[s];
System.out.println("Enter the elements");
for(int i=0;i<s;i++)
{
System.out.println("Element at index"+i+1+":");
array[i]=in.nextInt();
}
System.out.println("Enter element to be Searched");
int b=in.nextInt();
int index=Finder.linearSearch(array,b);
if(index==-1)
System.out.println(b+" not found in the array");
else
System.out.println(b+" Element found at index "+index+ "index in the array");
}
}