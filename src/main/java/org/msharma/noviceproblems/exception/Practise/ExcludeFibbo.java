import java.util.*;
class ExcludeFibbo
{
public static void main(String arr[])
{
int a=0;int b=1;int c;
Set<Integer> integerSet=new TreeSet<Integer>();
Set<Integer> fibboSet=new TreeSet<Integer>();
Set<Integer> withoutFibboSet=new TreeSet<Integer>();
for(int i=0;i<=100;i++)
{
integerSet.add(i);
}
System.out.println(integerSet);
while(a<=100)
{
c=a+b;
System.out.print(a+" ");
a=b;
b=c;
fibboSet.add(c);
}
integerSet.removeAll(fibboSet);
for(Object o:integerSet)
{
System.out.println(o);
}
}
}