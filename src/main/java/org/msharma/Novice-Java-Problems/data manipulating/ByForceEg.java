abstract class Showable
{
abstract void print();
}
class ByForceEg extends Showable
{
public void print()
{
System.out.println("By Force method");
}
public static void main(String aa[])
{
ByForceEg a=new ByForceEg();
a.print();
}

}