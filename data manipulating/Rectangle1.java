class Rectangle1
{
int length,breadth;
public Rectangle1(int l,int b)
{
System.out.println("In Parameterized");
length=l;
breadth=b;
}
public Rectangle1()
{
System.out.println("In Default");
length=3;
breadth=5;
}
public void display()
{
System.out.println("Length="+length);
System.out.println("Breadth="+breadth);
}
public int area()
{
return length*breadth;
}
public static void main(String arr[])
{
Rectangle1 a=new Rectangle1(5,6);
System.out.println("Dimensions are:");
a.display();
System.out.println("Area of the rectangle="+a.area());
Rectangle1 b=new Rectangle1();
System.out.println("Dimensions are:");
b.display();
System.out.println("Area of the rectangle="+b.area());
}{
System.out.println("Constructor and Anonymous block working");
}
}