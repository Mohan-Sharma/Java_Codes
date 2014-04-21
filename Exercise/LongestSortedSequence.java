import java.util.*;
class LongestSortedSequence
{
public static void main(String arr[])
{
int a[]=new int[]{7,2,3,1,5,8,9,6};
int list[]=new int[a.length];
for(int i=1;i<a.length;i++)
{
int max=0;
for(int j=0;j<i;j++)
{
if(a[j]<a[i] && list[j]>max)
{
max=list[j];
}
}
list[i]=max+1;
}
int max1=0;
for(int i=0;i<list.length;i++)
{
if(list[i]>max1)
{
max1=list[i];
}
}
System.out.println(max1);
}
}