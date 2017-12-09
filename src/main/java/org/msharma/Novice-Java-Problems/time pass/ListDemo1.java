import java.util.*;
class ListDemo1
{
public static void main(String arr[])
{
ArrayList list=new ArrayList();
list.add("avast");
list.add(1,"trozen");
list.add("avira");
list.add(3,"kasper");
list.add("microsoft essential");
System.out.println("Number of elements in the list is :"+list.size());
System.out.println("Contents of the list...");
ListIterator itr=list.listIterator();
while(itr.hasPrevious())
{
System.out.println(itr.previous());
}
System.out.println("Removing element from the list");
list.remove("avast");
System.out.println("Size after removing :"+list.size());
System.out.println("Searching element in the list...");
System.out.println("Result of the search "+list.contains("avira"));
System.out.println(list.get(1));
System.out.println("Index of the element is "+indexOf(avast));
}
}