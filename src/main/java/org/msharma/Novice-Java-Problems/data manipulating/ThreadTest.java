class A
{
public A()
{
Thread th=Thread.currentThread();
System.out.println("Object of A is created by "+th.getName()+" thread");
}
public void finalize()
{
Thread th=Thread.currentThread();
System.out.println("Obj of A is destroyed by "+th.getName()+" thread");
}
}
class ThreadTest
{
static
{
Thread th=Thread.currentThread();
System.out.println("ThreadTest is loaded by "+th.getName()+" thread");
System.out.println("Creating an object of A");
new A();
System.gc();
System.out.println("Changing the name of the main thread to first");
th.setName("first");
System.out.println("Name changed ");
System.out.println("Suspending it for 5 seconds");
try{
Thread.sleep(5000);
}
catch(Exception e)
{
System.out.println(e);
}
}
public static void main(String arr[])
{
Thread th=Thread.currentThread();
System.out.println("main is loaded in "+th.getName()+" thread");
}
}