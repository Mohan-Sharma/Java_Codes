class A
{
static{
System.out.println("A is loaded");
}
public A()
{
System.out.println("Instantiating obj of A");
}
}
class B
{
static {
System.out.println("B is loaded");

}
public static void display()
{
System.out.println("Display of B is invoked");
}
}
class C
{
static int a;
static{
a=4;
System.out.println("C is loaded");
}
}
class D
{
public static void main(String arr[])
{
System.out.println("Invoking constructor of A");
A x=new A();
System.out.println("invoking display of B");
B.display();
System.out.println("Displaying contents of c"+C.a);
A y=new A();

}

}