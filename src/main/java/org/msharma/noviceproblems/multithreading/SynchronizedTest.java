class Printer
{
synchronized public void print(String msg)
{
try{
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
class SynchronizedTest
{
public static void main(String arr[])
{
System.out.println("Main invoked creating printer object");
Printer p=new Printer();
System.out.println("Creating a user thread");
User th=new User(p);
th.start();
System.out.println("main is printing a msg");
p.print("hello from main");
}
}