class ArrayRev
{
public static void reverse(int arr[])
{
int m=arr.length/2;
int j=arr.length-1;
for(int i=0;i<m;i++)
{
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
j--;
}}
}
class RevTest
{public static void main(String aa[])
{
int a[]={2,3,4,5,6,7};
System.out.println("Displaying the contents of array");
for(int i=0;i<a.length;i++)
System.out.println(a[i]);
ArrayRev.reverse(a);
System.out.println("Contents of reverse array");
for(int i=0;i<a.length;i++)
System.out.println(a[i]);
}}
