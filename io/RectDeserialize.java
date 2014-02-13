import java.io.*;
class RectDeserialize
{
public static void main(String arr[])
{
try{
System.out.println("Desrializing objects");
ObjectInputStream in=new ObjectInputStream(new FileInputStream("rect.obj"));
RectangleTest a=(RectangleTest)in.readObject();
System.out.println("Successfully deserialize");
System.out.println("displaying details");
a.display();
System.out.println("area"+a.area());
}
catch(Exception e)
{}
}
}