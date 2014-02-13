class A
{
int a;
public A(int x)
{
a=x;
}
public void display()
{
System.out.println("a="+a);
}
}
class Ab
{
A a;
int b;
public Ab(A x,int y)
{
a=x;
b=y;
}
public void display()
{
a.display();
System.out.println("b="+b);
}
}
class HasTest
{
public static void main(String arr[])
{
Ab w=new Ab(new A(4),5);
w.display();
}
}