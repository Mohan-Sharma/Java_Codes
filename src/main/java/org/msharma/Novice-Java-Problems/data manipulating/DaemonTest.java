class MyRunnable implements Runnable
{
public void run()
{
Thread th=Thread.currentThread();
if(th.isDaemon())
System.out.println(th.getName()+" is started as daemon thread");
else
System.out.println(th.getName()+" is started normally");
for(int i=0;i<10;i++)
{
System.out.println(th.getName()+" run: "+i);
try
{
Thread.sleep(1000);
}
catch(Exception e){}
}
System.out.println("run() completed in time");
}
}
class DaemonTest
{
public static void main(String arr[])
{
System.out.println("Creating Myrunnable obj and invoking run() of it");
MyRunnable r=new MyRunnable();
System.out.println("Launching run() in independebt thread");
Thread th=new Thread(r);
th.setName("lazy");
th.setDaemon(true);
th.start();
try
{
for(int i=10;i>0;i--)
{
System.out.println(th.getName()+" main: "+i);
Thread.sleep(1000);
}
}
catch(Exception e){}
System.out.println("Main() completed");
}
}