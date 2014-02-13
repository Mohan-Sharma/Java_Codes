class A
{
int no;
static int counter;
public A()
{
no=++counter;
System.out.println("object no "+no+" is created");
}
public void finalize()
{
System.out.println("object no "+no+" is destroyed");
counter--;
}
}
class GarbageTest
{
public static void main(String arr[]) throws Exception
{
System.out.println("instantiating A");
A x=new A();
A y=new A();
new A();
new A();
System.out.println("object created requesting gc");
System.gc();
System.out.println("Giving time to gc");
Thread.sleep(2000);
System.out.println("Gc completed");
System.out.println("there are "+A.counter+" objects left");
}
}