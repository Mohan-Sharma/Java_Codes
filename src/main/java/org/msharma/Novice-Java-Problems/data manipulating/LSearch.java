import java.util.Scanner;
class LSearch
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
public static void main(String arr[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter the element in the array");
int s=in.nextInt();
int a[]=new int[s];
arr=new int[s];
System.out.println("Enter the element to search");
linearSearch.LSearch(arr);
}
} 

