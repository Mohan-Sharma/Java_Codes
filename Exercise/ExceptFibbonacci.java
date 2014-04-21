import java.util.*;
class ExceptFibbonacci
{
public static void main(String arr[])
{
Set mySet=new HashSet();
Set fibboSet=new HashSet();
for(int i=0;i<=100;i++)
{
mySet.add(i);
}
int a=0;int b=1;int c=0;
while(a<100)
{
 c=a+b;
System.out.print(a);
fibboSet.add(a);
a=b;b=c;
}
mySet.removeAll(fibboSet);
System.out.println(mySet);
}
}