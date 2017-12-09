import java.util.Scanner;
class ArrayCopyTest
{
public static void main(String arr[])
{
int src[],target[];
Scanner in=new Scanner(System.in);
System.out.println("Enter the size of the array");
int s=in.nextInt();
src=new int[s];
target=new int[s];
for(int i=0;i<s;i++)
{
System.out.println("Enter the "+i+1+" position element:");
src[i]=in.nextInt();
}
for(int i=0;i<s;i++)
{
System.out.println("Enter elements are"+src[i]);
}
for(int i=0;i<s;i++)
target[i]=src[i];
System.out.println("Contents of copied array");
for(int i=0;i<s;i++)
{
System.out.println(target[i]+"\t");
}
}}
