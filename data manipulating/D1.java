class A
{
public A()
{
System.out.println("In A");
}
}
class B extends A
{
public B()
{
System.out.println("In B");
}
}
class C extends B
{}
class D1
{
public static void main(String arr[])
{
A a=new A();
B b=new B();
C c=new C();
}
}