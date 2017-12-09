import java.util.*;
import java.io.*;
class PropertyTest
{
public static void main(String arr[])
{
try{

Properties p=new Properties();
System.out.println("loading properties...");
p.load(new FileInputStream("fee.properties"));
System.out.println("Following  properties are found...");
System.out.println("Course/tFee");
Set set=p.entrySet();
Iterator itr=set.iterator();
while(itr.hasNext())
{
Map.Entry m=(Map.Entry)itr.next();
System.out.println(m.getKey()+"/t"+m.getValue());
}
}
catch(Exception e)
{}
}
}