class Adder
{
public static void increment(int x)
{
x=x+1;
}
}

class AdderTest
{
public static void main(String arr[])
{
int a=5;
System.out.println("a="+a);
System.out.println("Incrementing a");
Adder.increment(a);
//Adder b=new Adder();
//b.increment(a);
System.out.println("After Increment="+a);
}
}