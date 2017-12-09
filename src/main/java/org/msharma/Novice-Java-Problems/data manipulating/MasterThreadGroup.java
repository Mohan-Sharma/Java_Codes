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
System.out.println("Dnt disturb "+getName()+" sleeping for "+delay+" seconds");
Thread.sleep(delay*1000);
System.out.println(getName()+" is feeling fresh");
}
catch(InterruptedException e)
{
System.out.println(getName()+" is interrupted");
}
}
}
class MasterThreadGroup
{
public static void main(String arr[])
{
System.out.println("Master started starting a three unpredictable and giving it 5 sec to complete");
ThreadGroup g=new ThreadGroup("Lazy");
Unpredictable th1=new Unpredictable(g,"Child1");
Unpredictable th2=new Unpredictable(g,"Child2");
Unpredictable th3=new Unpredictable(g,"Child3");
th1.start();
th2.start();
th3.start();
try{
Thread.sleep(5000);
}
catch(Exception e)
{}
System.out.println("master started checking the status of Unpredictable");
if(g.activeCount()>0)
{
System.out.println("Unpredictable is taking to much time interrupting it");
g.interrupt();
}
else
{
System.out.println("Unpredictable completed in time");
}
} 
}