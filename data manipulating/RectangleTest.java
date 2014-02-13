class Rectangle
{
public int l,b;
//private int l,b;
public void display()
{
System.out.println("Length of rectangle="+l);
System.out.println("Breadth of rectangle="+b);
}
public int area()
{
return l*b;
}
public void setDimension(int x,int y)
{
l=x;
b=y;
}
}
class RectangleTest
{
public static void main(String arr[])
{
Rectangle a=new Rectangle();
a.setDimension(5,6);
System.out.println("Dimensions of the rectangle");
a.display();
System.out.println("Area of the rectangle="+a.area());
}
}