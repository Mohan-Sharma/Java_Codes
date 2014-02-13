class MyRunnable implements Runnable
{
public void run()
{
Thread th=Thread.currentThread();
System.out.println("run() is invoked "+th.getName()+" thread");
for(int i=0;i<10;i++)
{
System.out.println("run :"+i);
try
{
Thread.sleep(1000);
}
catch(Exception e)
{}
}
System.out.println("run() completed");
}
}
class DirectImplementationRunnable
{
public static void main(String arr[])
{
System.out.println("creating obj of MyRunnable class");
MyRunnable r=new MyRunnable();
System.out.println("invoking run() by thread object");
r.run();
System.out.println("launcching run() of MyRunnable as an independent Thread");
Thread th=new Thread(r);
//th.setName("my");
th.start();
for(int i=10;i>0;i--)
{
System.out.println("main :"+i);
try
{
Thread.sleep(1000);
}
catch(Exception e)
{}
}
System.out.println("Main() completed");
}
}