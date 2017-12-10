abstract class Test
{
abstract public void a();
abstract public void b();
} 

class AbstractTest extends Test
{
static int a;
static
{
System.out.println("class loading...");
}
public void a()
{
System.out.println("Hi! from a()");
}
public void b()
{
System.out.println("Hi! from b()");
}
public void  c()
{
System.out.println("Hi! from c()");
}
public static void main(String arr[])
{
AbstractTest a=new AbstractTest();
System.out.println("Hi! from main()");
a.a();
a.b();
a.c();
}
}