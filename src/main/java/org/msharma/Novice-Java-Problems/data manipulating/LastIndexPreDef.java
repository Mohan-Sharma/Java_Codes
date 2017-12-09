
import java.util.Scanner;
class array
{
public static int lastIndex(int arr[],int element)
{
/*for(int i=0;i<arr.length;i++)
{
if(arr[i]==element)
return i;
}
return -1;
*/
element=arr.length-1;
return element;
}
}
class LastIndexPreDef
{
public static void main(String arr[])
{
Scanner in=new Scanner(System.in);
int a[]={12,23,34,45,56,67};
System.out.println("Enter the element to be search");
int b=in.nextInt();
int index=array.lastIndex(a,b);
if(index==-1)
System.out.println(b+"Not in array");
else
System.out.println("The last index of the element" +index);
}
}