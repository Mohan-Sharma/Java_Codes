class abc implements Runnable
{
public void run()
{
Thread th=Thread.currentThread();
System.out.println("run is invoked by "+th.getName()+" thread");
try{
for(int i=0;i<=10;i++)
{
System.out.println("run :"+i);
Thread.sleep(1000);
}
}
catch(Exception e){}
System.out.println("run completed");
}
}
class DirectImplementationRunnable
{
public static void main(String arr[]) throws Exception
{
System.out.println("Creating object of abc");
abc x=new abc();
System.out.println("Invoking run");
Thread th=new Thread(x);
th.run();
th.setName("my");
th.start();
try{
for(int i=10;i>=0;i--)
{
System.out.println("main :"+i);
Thread.sleep(1000);
}
}
catch(Exception e)
{}
System.out.println("main completed");
}
}