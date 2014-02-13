class ref
{
int a;
public ref(int x)
{a=x;
}}
class bc extends ref
{
int a;
public bc(int x,int y)
{
super(x);
a=y;
}
public static void main(String arr[])
{
bc q=new bc(4,5);
ref w=q;
System.out.println(s.a);
}
}