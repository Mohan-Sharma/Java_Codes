class thisTest
{
int a,b;
public thisTest(int a,int b)
{
this.a=a;
this.b=b;
}
public void display()
{
System.out.println("a="+a);
System.out.println("b="+b);
}
public static void main(String aa[])
{
thisTest x=new thisTest(2,3);
x.display();
}}