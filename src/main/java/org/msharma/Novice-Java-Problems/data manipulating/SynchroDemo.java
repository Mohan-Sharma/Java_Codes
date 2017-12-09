class Printer
{
public synchronized void print(String msg)
{
try
{
System.out.println("[");
Thread.sleep(1000);
System.out.println(msg);
Thread.sleep(1000);
System.out.println("]");
}
catch(Exception e)
{}
}
}
class User extends Thread
{
Printer p;
public User(Printer printer)
{
p=printer;
}
public void run()
{
p.print("Hello from user");
}
}
class SynchroDemo
{
public static void main(String arr[])
{
System.out.println("Mian started creating a printer obj");
Printer p=new Printer();
System.out.println("Creating user thread");
User th=new User(p);
th.start();
System.out.println("Main is printing a message");
p.print("Hello from main");
}
}