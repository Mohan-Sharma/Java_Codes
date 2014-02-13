class Common
{
int length,breadth;
public Common(int length,int breadth)
{
this.length=length;
this.breadth=breadth;
} 
public void display()
{
System.out.println("Length= "+length);
System.out.println("Breadth= "+breadth);
}
}
class Rectangle extends Common
{
public Rectangle(int length,int breadth)
{
super(length,breadth);
}
public void display()
{
super.display();
}
public int area()
{
return length*breadth;
}
}
class Cuboid extends Common
{
int z;
public Cuboid(int length,int breadth,int height)
{
super(length,breadth);
z=height;
}
public void display()
{
super.display();
System.out.println("Height= "+z);
}
public int volume()
{
return length*breadth*z;
}
}
class ShapeTest
{
public static void main(String arr[])
{
Rectangle r=new Rectangle(5,6);
System.out.println("Dimensions of the rectangle...");
r.display();
System.out.println("Area of the rectangle :"+r.area());
Cuboid c=new Cuboid(2,3,4);
System.out.println("Dimensions of the cuboid....");
c.display();
System.out.println("Volume of the cuboid :"+c.volume());
}
}
