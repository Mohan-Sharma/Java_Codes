 class garbageTest
{
static int counter;
int no;
public garbageTest()
{
no=++counter;
System.out.println("Object no"+ no + "of garbageTest is created");

}
public void finalize()
{
System.out.println("Object no" + no + "of garbageTest is destroyed");
counter--;
}
}
class Destroyer
{
public static void main(String arr[]) throws Exception
{
garbageTest a=new garbageTest();
new garbageTest();
System.out.println("Object created requesting garbage collector");
System.gc();
System.out.println("Giving time to garbage collection");
Thread.sleep(3000);
System.out.println("Garbage collection completed");
System.out.println("There are" + garbageTest.counter +"objects left of garbageTest");
}
}