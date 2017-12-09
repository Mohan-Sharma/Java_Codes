final class ABC
{
public void display()
{
System.out.println("It is a final method");
} 
}
class FinalMethodTest extends ABC
{
public void display()
{
System.out.println("It cannot be over-ridden");
}
public static void main(String aa[])
{
FinalMethodTest a=new FinalMethodTest();
a.display();
}}