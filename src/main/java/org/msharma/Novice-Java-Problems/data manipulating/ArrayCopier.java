import java.util.Scanner;
class ArrayCopier
{
public static void main(String arr[])
{
int a[],b[];
Scanner in=new Scanner(System.in);
System.out.println("Enter the size of the array");
int s=in.nextInt();
a=new int[s];
b=new int[s];
for(int i=0;i<s;i++)
{
System.out.println("Enter the element no-"+i+1+":");
a[i]=in.nextInt();
}
for(int i=0;i<s;i++)
b[i]=a[i];
System.out.println("Displaying the contents of target array");
for(int i=0;i<s;i++)
System.out.println(b[i]);
}
}