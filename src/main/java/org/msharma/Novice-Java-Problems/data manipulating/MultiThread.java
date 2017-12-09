class ThreadCumMyRunnable extends Thread
{
public void run()
{
Thread th=Thread.currentThread();
System.out.println("run() is invoked by "+th.getName()+" thread");
for(int i=0;i<10;i++)
{
System.out.println("run :"+i);
try{
Thread.sleep(1000);
}
catch(Exception e)
{}
}
System.out.println("run() completed");
}
}
class MultiThread
{
public static void main(String arr[])
{
System.out.println("Creating obj of ThreadCumMyRunnable class");
ThreadCumMyRunnable th=new ThreadCumMyRunnable();
System.out.println("Invoking run of ThreadCumMyRunnable");
th.run();
System.out.println("Control is back to main, launching run() in independent thread");
th.start();
th.setName("user");
for(int i=10;i>0;i--)
{
System.out.println("main :"+i);
try{
Thread.sleep(1000);
}
catch(Exception e)
{
}
}
System.out.println("main() completed");
}
}