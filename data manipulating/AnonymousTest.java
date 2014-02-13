class abc
{
int a;
public abc(int x)
{
a=x;
System.out.println("Object of a is initialize");
}
public void display()
{
System.out.println("a="+a);
}
{
System.out.println("1st one");
}
//class AnonymousTest
public static void main(String arr[])
{
abc x=new abc(5);
x.display();
abc y=new abc(10);
y.display();
}
{
System.out.println("2nd one");
}
}
