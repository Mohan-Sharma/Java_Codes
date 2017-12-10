import java.util.*;
class ExcludeFibbonaci
{
public static void main(String arr[])
{
Set<Integer> integerSet=new TreeSet<Integer>();
Set<Integer> fibboSet=new TreeSet<Integer>();
for(int i=0;i<=100;i++)
{
integerSet.add(i);
}
int a=0;int b=1;int c;
while(a<=100)
{
c=a+b;
System.out.println(a);
a=b;b=c;
fibboSet.add(a);
}
integerSet.removeAll(fibboSet);
System.out.println(integerSet);
}
}