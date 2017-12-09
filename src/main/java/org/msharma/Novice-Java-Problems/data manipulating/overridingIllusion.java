class WithFinals
{
private final void f()
{
System.out.println("WithFinals.f()");
}
private void g()
{
System.out.println("WithFinal.g()");
}
}
class overridingFinal extends WithFinals
{
public  void f()
{
System.out.println("OverridingFinal.f()");
}
public void g()
{
System.out.println("OverridingFinal.g()");
}
}
class overridingFinal2 extends overridingFinal
{
public final void f()
{
System.out.println("overridingFinal2.f()");
}
public void g()
{
System.out.println("overridingFinal2.g()");
}
}
class overridingIllusion
{
public static void main(String arr[])
{overridingFinal2 op2=new overridingFinal2();
op2.f();
op2.g();
overridingFinal op=op2;
op.f();
op.g();
}
}