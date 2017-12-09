import java.io.*;
class SerializableTest
{
public static void main(String arr[])
{
try
{
Emp e1=new Emp("Mohan","Student",10000);
Emp e2=new Emp("Sharma","Student",20000);
System.out.println("Following details are found");
e1.display();
e2.display();
System.out.println("serializing objects");
ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("emp.obj"));
out.writeObject(e1);
out.writeObject(e2);
out.close();
System.out.println("successfully serialized");
}
catch(Exception e)
{}
}
}