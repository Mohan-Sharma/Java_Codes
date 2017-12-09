import java.util.Scanner;
class Linear
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
class Finder
{
public static void main(String arr[])
{
Scanner in=new Scanner(System.in);
int a[]={1,23,34,5,563,676,88,32,556};
System.out.println("Eneter the Element to be searched");
int b=in.nextInt();
int index=Linear.linearSearch(a,b);
if(index==1)
System.out.println(a+"not found in the array");
else
System.out.println(b+" found at "+index+" index in array");
}
}