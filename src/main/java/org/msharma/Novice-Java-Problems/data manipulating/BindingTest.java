class BindingTest
{
public void display()
{
System.out.println("in a");
}
public static void invoke(BindingTest x)
{
x.display();
}
public static void main(String arr[])
{
BindingTest a=new BindingTest();
BindingTest.invoke(a);
}
}