import java.util.*;
class Unpredictable extends Thread
{
int delay;
public Unpredictable()
{
Random r=new Random();
delay=r.nextInt(10);
}
public void run()
{
System.out.println("Unpredictable is started");
try{
System.out.println("dnt disturb Unpredictable sleeping for "+delay+" sec");
Thread.sleep(delay*1000);
System.out.println("Unpredictable is feeling fresh");
}
catch(InterruptedException e){
System.out.println("Unpredictable is interrupted");
}
}
}
class JoinTest
{
public static void main(String arr[])
{
System.out.println("main Thread started creating object of Unpredicatble");
Unpredictable th=new Unpredictable();
System.out.println("giving Unpredictable 5 sec to complete");
try{
th.start();
th.join(5000);
}
catch(Exception e){}
System.out.println("Main woke up checking status of Unpredictable");
if(th.isAlive())
{
System.out.println("Unpredictable taking to much time calling interrupt");
th.interrupt();
}
else
System.out.println("Unpredictable completed within time");
}
}