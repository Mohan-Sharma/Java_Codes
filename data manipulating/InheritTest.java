class common
{
int l,b;
public common(int x,int y)
{
l=x;
b=y;
}
public void display()
{
System.out.println("Length="+l);
System.out.println("Breadth="+b);
}
}
class Rectangle extends common
{
public Rectangle(int x,int y)
{
super(x,y);
}
public int area()
{

return l*b;
}
}
class Cuboid extends common
{
int h;
public Cuboid(int x,int y,int z)
{
super(x,y);
h=z;
}
public int volume()
{
return l*b*h;
}
public void display()
{
super.display();
System.out.println("Heigth="+h);
}
}
class InheritTest
{
public static void main(String arr[])
{
Rectangle a=new Rectangle(4,5);
System.out.println("Displaying the attributes of rectangle");
a.display();
Cuboid b=new Cuboid(2,3,4);
System.out.println("Displaying the attributes of cuboid");
b.display();
System.out.println("Area of the rectangle="+a.area());
System.out.println("Volume of the cuboid="+b.volume());
}
}