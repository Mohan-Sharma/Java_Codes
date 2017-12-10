import java.io.*;
class DeSerializableTest
{
public static void main(String arr[])
{
try
{
System.out.println("Deserializing objects");
ObjectInputStream in=new ObjectInputStream(new FileInputStream("Employee.obj"));
Emp e1=(Emp)in.readObject();
Emp e2=(Emp)in.readObject();
System.out.println("successfully Deserialized");
System.out.println("Following Records are found");
e1.display();
e2.display();
}
catch(Exception e)
{}
}
}