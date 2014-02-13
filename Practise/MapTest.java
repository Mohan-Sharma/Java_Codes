import java.util.*;
class MapTest
{
public static void main(String arr[])
{
TreeMap<String,String> map=new TreeMap<String,String>();
map.put("India","New Delhi");
map.put("Pakistan","Islamabad");
map.put("Sri Lanka","Colombo");
map.put("Nepal","Kathmandu");
map.put("Bhutan","Thimpu");
System.out.println("There are "+map.size()+" entries in the map");
System.out.println("Following entries are found");
Set <Map.Entry<String,String>> set=map.entrySet();
Iterator<Map.Entry<String,String>> itr=set.iterator();
while(itr.hasNext())
{
Map.Entry m=itr.next();
System.out.println(m.getKey()+"\t"+m.getValue());
}
}
}