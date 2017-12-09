class Gc
{
int no;
static int counter;

public Gc()
{
no=++counter;
System.out.println("Object no "+no+" is created");
}
public void finalize()
{
System.out.println("Object no "+no+" is destroyed");
counter--;
}
public static void main(String arr[]) throws Exception
{
System.out.println("Creating object");
Gc a=new Gc();
new Gc();
new Gc();
System.out.println("Destroying object calling gc");
System.gc();
System.out.println("giving time to garbage collection");
Thread.sleep(2000);
System.out.println("garbage ollection completed");
System.out.println("There are "+Gc.counter+" no of objects left");
}
}