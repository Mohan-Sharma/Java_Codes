class StaticBlock
{
int a;
static int b;
static
{
System.out.println("StaticBlock Class is initialise");
b=5;
System.out.println("b="+b);
}
public StaticBlock(int x)
{
a=x;
System.out.println("object of StaticBlock Class is created");
}
public void display()
{
System.out.println("a="+a);
}
public static void main(String arr[])
{
StaticBlock r=new StaticBlock(5);
System.out.println("value of");
r.display();

}
}