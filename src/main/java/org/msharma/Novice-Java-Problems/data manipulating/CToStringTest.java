class A
{
public String toString()
{
return "It is A";
}
}
class B{
public String toString()
{
return "*****";
}
}
class CToStringTest{
public static void main(String arr[])
{
A x=new A();
B y=new B();
CToStringTest z=new CToStringTest();
System.out.println(x);
System.out.println(y);
System.out.println(z);
}
}
