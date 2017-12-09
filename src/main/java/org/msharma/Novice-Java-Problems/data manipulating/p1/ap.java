package p1;
public class ap
{
public static void main(String arr[])
{
System.out.println("Loading p1.ap");
System.out.println("Invoking p2.bq");
p2.bq x=new p2.bq();
System.out.println("Invoking display of bq");
x.display();
}
}