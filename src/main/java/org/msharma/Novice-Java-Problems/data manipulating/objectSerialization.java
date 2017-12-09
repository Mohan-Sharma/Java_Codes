import java.io.*;
class objectSerialization
{
public static void main(String arr[])
{
try{
emp e1=new emp("A","B",5000);
emp e2=new emp("x","y",6000);
System.out.println("Following objects will be serialize");
e1.display();
e2.display();
System.out.println("Serializing objects");
ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("emp.obj"));
out.writeObject(e1);
out.writeObject(e2);
out.close();
System.out.println("successfully serialize");
}
catch(Exception e)
{
System.out.println(e);
}
}
}