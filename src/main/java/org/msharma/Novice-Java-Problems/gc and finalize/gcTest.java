class A
{
static int counter;
int no;
public A()
{
no=++counter;
System.out.println("object no "+no+" created");
}
public void finalize()
{
System.out.println("Object no "+no+" is destroyed");
counter--;
}
}
class gcTest
{
public static void main(String arr[]) throws Exception
{
System.out.println("instantiating class A");
A x=new A();
new A();
System.out.println("object created calling gc()");
System.gc();
System.out.println("Giving time to gc");
Thread.sleep(2000);
System.out.println("There are "+A.counter+" objects left");
}
}