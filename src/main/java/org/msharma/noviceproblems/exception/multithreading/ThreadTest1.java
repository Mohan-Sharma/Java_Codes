class A
{
public A()
{
Thread th =Thread.currentThread();
System.out.println("object is created by "+th.getName()+" thread");
}
public void finalize()
{
Thread th=Thread.currentThread();
System.out.println("object is destroyed by "+th.getName()+" thread");
}
}

class ThreadTest1
{
static 
{
Thread th=Thread.currentThread();
System.out.println("class loaded by "+th.getName()+" thread");
System.out.println("creating object");
new A();
System.out.println("object created calling garbage collector");
System.gc();
System.out.println("suspending it for 5 sec");
try
{
Thread.sleep(5000);
}
catch(Exception e)
{}
}
public static void main(String arr[])
{
Thread th=Thread.currentThread();
System.out.println("main is loaded by "+th.getName()+" thread");
}
}