class A<t>
{
t value;
public A(t x)
{
value=x;
}
public void display()
{
System.out.println(value);
}
}
class GenericTest
{
public static void main(String arr[])
{
A<Integer> x=new A<Integer>(5);
x.display();
A<String> y=new A<String>("Hello");
y.display();
}
}