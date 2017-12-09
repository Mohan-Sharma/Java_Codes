class Abc
{
static int counter;
int no;
public Abc()
{
no=++counter;
System.out.println("object no "+no+" is created");
}
public void finalize()
{
System.out.println("Object no "+no+" is destroyed");
counter--;
} 
}
class GcFinalizeTest
{
public static void main(String arr[]) throws Exception
{
System.out.println("instantiating Abc");
Abc x=new Abc();
new Abc();
System.out.println("Object created calling gc()");
System.gc();
System.out.println("Giving time to gc()");
Thread.sleep(1000);
System.out.println("gc started checking if any object left");
System.out.println("There are "+Abc.counter+" objects left");
}
}