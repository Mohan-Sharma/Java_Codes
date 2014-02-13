class Swapper
{
int a,b;
public Swapper(int x,int y)
{
a=x;
b=y;
}
public void display()
{
System.out.println("a="+a);
System.out.println("b="+b);
}
public Swapper swap()
{
int z=a;
a=b;
b=z;
return this;
}
}
class SwapTesting
{
public static void main(String arr[])
{
Swapper a=new Swapper(5,6);
System.out.println("Before Swapping values:");
a.display();
a.swap();
System.out.println("After swapping:");
a.display();

}
}