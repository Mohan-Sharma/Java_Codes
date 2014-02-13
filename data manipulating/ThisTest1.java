class ThisTest1
{
int a,b;
public ThisTest1()
{
this(2,3);
System.out.println("In Default Constructor");
}
public ThisTest1(int a)
{this(a,3);
System.out.println("In one Dimansional");
}
public ThisTest1(int a,int b)
{
this.a=a;
this.b=b;
System.out.println("In two Dimensional");
}
public void display()
{
System.out.println("a="+a);
System.out.println("b="+b);
}
public static void main(String arr[])
{
ThisTest1 x=new ThisTest1();
x.display();
ThisTest1 y=new ThisTest1(10);
y.display();
ThisTest1 z=new ThisTest1(3,6);
z.display();
}
}