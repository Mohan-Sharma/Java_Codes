import java.util.*;
import java.io.*;
class PropertyTest1
{
public static void main(String arr[])
{
try{

Properties p=new Properties();
p.setProperty("Arun","java");
p.setProperty("Barun",".net");
p.setProperty("abc1","php");
p.setProperty("Arun1","java");
p.setProperty("Barun1",".net");
p.setProperty("abc","php");
System.out.println("Displaying details.....");
Set set=p.entrySet();
Iterator itr=set.iterator();
while(itr.hasNext())
{
Map.Entry m=(Map.Entry)itr.next();
System.out.println(m.getKey()+""+m.getValue());
}
System.out.println("Saving properties...");
FileOutputStream out=new FileOutputStream("trainer.properties");
p.store(out,"trainer.properties");
out.close();
System.out.println("Successfully saved...");
}
catch(Exception e)
{}
}
}