import java.util.*;
class CharCount
{
public static void main(String arr[])
{
String s="adhjashdjadjasff";
Map<Character,Integer> map = new HashMap<Character,Integer>();
for (int i = 0; i < s.length(); i++)
 {
  char c = s.charAt(i);
  if (map.containsKey(c)) 
{
    int cnt = map.get(c);
    map.put(c, ++cnt);

  }
else 
{
    map.put(c, 1);
  }
System.out.println(c+"="+cnt); 
}
}

}