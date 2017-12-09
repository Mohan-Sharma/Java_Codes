import java.util.Scanner;
class LrSearch
{
public static int linearsearch(int a[],int element)
{
for(int i=0;i<a.length;i++)
{
if(a[i]==element)
return i;
System.out.println("element exist"+element);
}
//System.out.println("element doesnt exist");
return -1;
}
public static void main(String arr[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter the size of the array");
int s=in.nextInt();
int a[]=new int[s];
for(int i=0;i<s;i++)
{
System.out.println("Enter the element no-"+i+1+";");
a[i]=in.nextInt();
}
System.out.println("Enter the element to search");
int b=in.nextInt();
LrSearch.linearsearch(a,b);
}
} 

