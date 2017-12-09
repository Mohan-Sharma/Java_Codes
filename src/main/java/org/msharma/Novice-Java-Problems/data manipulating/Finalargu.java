class gimmo
{
public void spin()
{
System.out.println("i'm spinning");
}
}
public class Finalargu
{
public void with(final gimmo g)
{
g.spin();
}
public int without(gimmo g)
{
g.spin();
}
public void f(final int i)
{
//i++;
}
public int wf(int i)
{
return i+1;
}
public static void main(String arr[])
{
Finalargu x=new Finalargu();
x.without(null);
x.with(null);
x.f(3);
x.wf(3);
}}