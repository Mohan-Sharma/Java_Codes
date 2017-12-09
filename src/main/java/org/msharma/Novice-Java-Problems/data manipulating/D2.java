class A
{
public A()
{
System.out.println("In A");
}
}
class B extends A
{
int b;
public B(int x)
{
b=x;
System.out.println("x="+b);
}
public B()
{
System.out.println("In B Default");
}
}
class C extends B
{
public C()
{
System.out.println("In C");
}

}
class D2
{
public static void main(String arr[])
{
A a=new A();
B b=new B(5);
B x=new B();
C c=new C();
}
}