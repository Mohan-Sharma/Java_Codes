class x
{
int a,b;
public x()
{
this(2,3);
System.out.println("In default");
}
public x(int a,int b)
{
this.a=a;
this.b=b;
System.out.println("In two parameterized");
}
public x(int c)
{
this(5,10);
System.out.println("In 1 parameterized");
}
public void display()
{
System.out.println("a="+this.a);
System.out.println("b="+this.b);
}
public static void main(String arr[])
{
x s=new x();
s.display();
x q=new x(20,30);
q.display();
x r=new x(5);
r.display();
}
}