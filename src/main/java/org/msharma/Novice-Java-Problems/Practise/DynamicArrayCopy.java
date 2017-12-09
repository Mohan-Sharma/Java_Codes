import java.util.*;
import java.util.*;
import java.lang.reflect.Array;
class DynamicArrayCopy
{
public static int[] increaseSize(int arr[])
{
int b[]=(int[])Array.newInstance(arr.getClass().getComponentType(),arr.length*2);
System.arraycopy(arr,0,b,0,arr.length);
return b;
}
public static void main(String arr[])
{
int a[];
Scanner in=new Scanner(System.in);
System.out.println("Enter the size of the initial array...");
int size=in.nextInt();
a=new int[size];
for(int i=0;i<a.length;i++)
{
System.out.println("Enter the element at position : "+i);
a[i]=in.nextInt();
}
System.out.println(java.util.Arrays.toString(a));
a=DynamicArrayCopy.increaseSize(a);
for(int i=0;i<a.length;i++)
{
a[i]=i+1;
}
for(int i=0;i<a.length;i++)
{
System.out.println("Enter the element in new array....");
a[i]=in.nextInt();
}
System.out.println(java.util.Arrays.toString(a));
}
}