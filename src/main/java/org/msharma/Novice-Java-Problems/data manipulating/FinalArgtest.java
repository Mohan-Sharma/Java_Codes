class gimmo
{
public void run()
{
System.out.println("Its runnning");
}
}
class FinalArgtest
{
public void with(final gimmo i)
{
//i=new gimmo();
}
public void without(gimmo g)
{
g=new gimmo();
g.run();
}
public void f(final int i)
{
System.out.println(i);
}
public void wf(final int i)
{
System.out.println(i+1);
}
public static void main(String arr[])
{
FinalArgtest x=new FinalArgtest();
x.with(null);
x.without(null);
x.f(3);
x.wf(4);
}
}