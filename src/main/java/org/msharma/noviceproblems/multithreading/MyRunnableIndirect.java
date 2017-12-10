class A extends Thread
{
public void run()
{
Thread th=Thread.currentThread();
System.out.println("run is invoked by "+th.getName()+" thread");
for(int i=0;i<10;i++)
{
System.out.println("run: "+i);
try{
Thread.sleep(1000);
}
catch(Exception e){}
}
System.out.println("run completed");
}}
class MyRunnableIndirect
{
public static void main(String arr[])
{
System.out.println("main() invoked creating methodOne A object");
A th=new A();
th.setName("user");
System.out.println("invoking run of A");
th.run();
System.out.println("Control is returned to main launching run as an independent thread");
th.start();
for(int i=10;i>0;i--)
{
System.out.println("main: "+i);
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println(e);
}
}
System.out.println("main() is completed");
}
}