class AnonTest
{
int a;
public AnonTest(int x)
{
a=x;
System.out.println("Object of A is initialize");
}

public void display()
{
System.out.println("a="+a);
}
{
System.out.println("1st One");
}
public static void main(String arr[])
{
AnonTest a=new AnonTest(5);
a.display();
AnonTest b=new AnonTest(6);
b.display();
}
{
System.out.println("2nd One");
}
}