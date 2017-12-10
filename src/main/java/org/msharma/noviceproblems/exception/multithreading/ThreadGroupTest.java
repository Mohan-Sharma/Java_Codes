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
System.out.println(getName()+" is started");
try{
System.out.println("dnt disturb "+getName()+" sleeping for "+delay+" sec");
Thread.sleep(delay*1000);
System.out.println(getName()+" is feeling fresh");
}
catch(InterruptedException e){
System.out.println(getName()+" is interrupted");
}
}
}
class ThreadGroupTest
{
public static void main(String arr[])
{
System.out.println("main Thread started creating object of Unpredicatble");
ThreadGroup g=new ThreadGroup("lazy");
Unpredictable th1=new Unpredictable(g,"child1");
Unpredictable th2=new Unpredictable(g,"child2");
Unpredictable th3=new Unpredictable(g,"child3");
System.out.println("giving Unpredictable 5 sec to complete");
try{
th1.start();
th2.start();
th3.start();
Thread.sleep(5000);
}
catch(Exception e){}
System.out.println("Main woke up checking status of Unpredictable");
if(g.activeCount()>0)
{
System.out.println("Unpredictable taking to much time calling interrupt");
g.interrupt();
}
else
System.out.println("Unpredictable completed within time");
}
}