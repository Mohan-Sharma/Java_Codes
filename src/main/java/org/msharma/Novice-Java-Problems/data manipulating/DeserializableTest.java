import java.io.*;
class DeserializableTest
{
public static void main(String arr[])
{
try{
System.out.println("Deserializing objects");
ObjectInputStream in=new ObjectInputStream(new FileInputStream("emp.obj"));
emp e1=(emp)in.readObject();
emp e2=(emp)in.readObject();
System.out.println("Displaying deserialized objects");
e1.display();
e2.display();
}
catch(Exception e)
{
System.out.println(e);
}
}
}

