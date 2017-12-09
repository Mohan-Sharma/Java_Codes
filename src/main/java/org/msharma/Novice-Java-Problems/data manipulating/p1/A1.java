package p1;
public class A1
{
public static void main(String arr[])
{
System.out.println("A1 of p1 is executed");
System.out.println("Instantiating B of p2");
p2.B x=new p2.B();
System.out.println("Invoking Display of p2");
x.display();
}

}