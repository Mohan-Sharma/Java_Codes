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
System.out.println("Unpredictable started");
try
{
System.out.println("sleeping for "+delay+" secs");
Thread.sleep(delay*1000);
}
catch(InterruptedException e)
{}
}
}
class JointhreadTest
{
public static void main(String arr[])
{
System.out.println("Unpredictable started instantiating it");
Unpredictable r=new Unpredictable();
System.out.println("Giving it 5 secs to complete it tasks");
r.start();
try
{
r.join(5000);
}
catch(Exception e)
{}
System.out.println("master started checking if any thread is alive");
if(r.isAlive())
{
System.out.println("Unpredictable is taking too much time interrupting it");
r.interrupt();
}
else 
{
System.out.println("Unpredictable is completed in time");
}
}
}