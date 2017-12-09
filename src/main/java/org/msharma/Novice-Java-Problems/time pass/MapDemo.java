import java.util.*;
class MapDemo
{
public static void main(String arr[])
{
HashMap map=new HashMap();
map.put("India","New Delhi");
map.put("Pakistan","Ishlamabad");
map.put("Nepal","Bhutan");
map.put("China","Beijing");
System.out.println("Number of entries in the map :"+map.size());
System.out.println("Displaying the contents..");
Set set=map.entrySet();
Iterator itr=set.iterator();
System.out.println("Key"+"\t"+"value");
while(itr.hasNext())
{
Map.Entry m=(Map.Entry)itr.next();
System.out.println(m.getKey()+"\t"+m.getValue());
}
map.remove("Pakistan");
System.out.println("After removal number of entries.."+map.size());
System.out.println(map.containsKey("India"));
}
}