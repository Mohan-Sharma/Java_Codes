class TestThis
{
int a,b;
public TestThis()
{
this(2,3);
System.out.println("In Default");
}
public TestThis(int a)
{
this(a,3);
System.out.println("In one Dimensional");
}
public TestThis(int a,int b)
{
this.a=a;
this.b=b;
}
System.out.println("In two dimensional");
}
public void display()
{
System.out.println("a="+a);
System.out.println("b="+b);
}
public static void main(String arr[])
{
TestThis x=new TestThis();
x.display();
TestThis y=new TestThis(10);
y.display();
TestThis z=new TestThis(20,10);
z.display();
}
}