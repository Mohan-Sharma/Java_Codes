import java.util.*;
class Unpredictable extends Thread
{
int delay;
public Unpredictable(ThreadGroup g,String name)
{
super(g,name);
Random r=new Random();
delay=r.nextInt(10);
}
public void run()
{
System.out.println(getName()+" started");
try
{
System.out.println(getName()+" sleeping for "+delay+" secs");
Thread.sleep(delay*1000);
}
catch(InterruptedException e)
{}
}
}
class GroupthreadTest
{
public static void main(String arr[])
{
System.out.println("JointhreadTest started creating threadGroup");
ThreadGroup g=new ThreadGroup("lazy");
System.out.println("Creating 3 Unpredictable threads and giving them 5 sec to complete");
Unpredictable r1=new Unpredictable(g,"child1");
Unpredictable r2=new Unpredictable(g,"child2");
Unpredictable r3=new Unpredictable(g,"child3");
r1.start();
r2.start();
r3.start();
try
{
Thread.sleep(5000);
}
catch(Exception e)
{}
System.out.println("master started checking if any thread is alive");
if(g.activeCount()>0)
{
System.out.println("Unpredictable is taking too much time interrupting it");
g.interrupt();
}
else 
{
System.out.println("Unpredictable is completed in time");
}
}
}