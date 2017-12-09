import java.io.*;
class Deserialize
{
public static void main(String arr[])
{
try{
System.out.println("Desrializing objects");
ObjectInputStream in=new ObjectInputStream(new FileInputStream("emp.obj"));
emp e1=(emp)in.readObject();
emp e2=(emp)in.readObject();
System.out.println("Successfully deserialize");
System.out.println("displaying details");
e1.display();
e2.display();
}
catch(Exception e)
{}
}
}