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
class rectangle extends common
{
public rectangle(int x,int y)
{
super(x,y);
}
public int area()
{
return l*b;
}
}
class cuboid extends common
{
int h;
public cuboid(int x,int y,int z)
{
super(x,y);
h=z;
}
public void display()
{
super.display();
System.out.println("Heigth="+h);
}
public int volume()
{
return l*b*h;
}
}
class SuperTest
{
public static void main(String arr[])
{
rectangle r=new rectangle(2,3);
r.display();
System.out.println("Area of rectangle="+r.area());

cuboid c=new cuboid(4,5,6);
c.display();
System.out.println("Volume of cuboid="+c.volume());
}
}
