import java.util.Scanner;
import java.io.*;
class RectangleTest implements java.io.Serializable
{
int length,breadth;
public RectangleTest(int x,int y)
{
length=x;
breadth=y;
}
/*Scanner in=new Scanner(System.in);
public void getDimension()
{
System.out.println("Enter the length");
length=in.nextInt();
System.out.println("Enter the breadth");
breadth=in.nextInt();
}
*/
public void display()
{
System.out.println("Length="+length);
System.out.println("breadth="+breadth);
}
public int area()
{
return length*breadth;
}
public static void main(String arr[])
{
try{
//RectangleTest a=new RectangleTest();
RectangleTest a=new RectangleTest(5,6);
//a.getDimension();
a.display();
System.out.println("Area of rectangle="+a.area());
System.out.println("Serializing object");
ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("rect.obj"));
out.writeObject(a);
System.out.println("Successfully serialize");
}
catch(Exception e){}
}
}