class abc extends Thread implements Runnable
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
}
}
class InDirectImplementationRunnable
{
public static void main(String arr[]) throws Exception
{
Thread th=Thread.currentThread();
System.out.println("Main invoked by "+th.getName()+" thread");
System.out.println("Creating abc object");
abc x=new abc();
System.out.println("launching run as an independent thread");
x.setName("My");
x.run();
System.out.println("COntrol back to main()");
x.start();
try{
for(int i=10;i>=0;i--)
{
System.out.println("main :"+i);
Thread.sleep(1000);
}
}
catch(Exception e){}
}
}