class RunnableIndirect extends Thread
{
public void run()
{
Thread th=Thread.currentThread();
System.out.println("run is invoked by "+th.getName()+" thread");
for(int i=0;i<=10;i++)
{
System.out.println("run: "+i);
try
{
Thread.sleep(1000);
}
catch(Exception e)
{}
}
System.out.println("run completed");
}
}
class InDirectRunnableTest
{
public static void main(String arr[])
{
System.out.println("main invoked creating RunnableIndirect object");
RunnableIndirect r=new RunnableIndirect();
r.setName("User");
System.out.println("directly invoking run ");
r.run();
System.out.println("control is returned to main");
System.out.println("launching run as an independent thread");
r.start();
for(int j=10;j>=0;j--)
{
System.out.println("main:"+j);
try
{
Thread.sleep(1000);
}
catch(Exception e)
{}
}
System.out.println("main completed");
}
}