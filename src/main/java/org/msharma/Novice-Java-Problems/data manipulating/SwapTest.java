class Swapper
{
public static void swap(int x,int y)
{int z;
z=x.value;
x.value=y.value;
y.value=z;
}
}
class SwapTest{
public static void main(String arr[])
{
MyNumber a=new MyNumber(3);
MyNumber b=new MyNumber(6);
System.out.println("a="+a.value);
System.out.println("b="+b.value);
Swapper.swap(a,b);
System.out.println("a="+a.value);
System.out.println("b="+b.value);

} 
}
class MyNumber{
int value;
public MyNumber(int x)
{
value=x;
}
}