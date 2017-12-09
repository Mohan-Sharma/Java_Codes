class staticTest
{
static int a;
int b;
static
{
a=3;
System.out.println("staticTest is initialize");
System.out.println(a);
}
public staticTest(int x)
{
b=x;
System.out.println("Object of staticTest is created");
}
public void display()
{
System.out.println("b="+b);
}
public static void main(String arr[])
{
System.out.println("Main of staticTest is invoked");
staticTest d=new staticTest(5);
System.out.println("b of d is");
d.display();
staticTest e=new staticTest(10);
System.out.println("b of e is");
e.display();
}}