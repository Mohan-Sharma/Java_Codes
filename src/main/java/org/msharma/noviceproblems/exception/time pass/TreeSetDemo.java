import java.util.*;
class TreeSetDemo
{
public static void main(String arr[])
{
TreeSet set=new TreeSet();
set.add("avast");
set.add("avast1");
set.add("trozen");
set.add("avira");
set.add("kasper");
set.add("microsoft essential");
System.out.println("Number of elements in the list is :"+set.size());
System.out.println("Contents of the list...");
Iterator itr=set.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
System.out.println("Removing element from the list");
set.remove("avast");
System.out.println("Size after removing :"+set.size());
System.out.println("Searching element in the list...");
System.out.println("Result of the search "+set.contains("avira"));

}
}