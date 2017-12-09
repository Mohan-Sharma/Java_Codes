class xy
{
public void f()
{
System.out.println("Its public.f()");
}
private void g()
{
System.out.println("its private.g()");
}
}
class privateTest extends xy
{
public void ab()
{
System.out.println("Its public");
}
private void cd()
{
System.out.println("Its Private");
}
public static void main(String arr[])
{
privateTest x=new privateTest();
x.ab();
x.cd();
xy z=new xy();
z.f();
z.g();
}
}