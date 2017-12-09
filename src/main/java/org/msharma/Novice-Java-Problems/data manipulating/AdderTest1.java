class Adder
{
public static int increment(int x)
{
x=x+1;
return x;
}
}
class AdderTest1{
public static void main(String arr[])
{
int a=5;
System.out.println("a="+a);
System.out.println("Incrementing value by 1");
int y=Adder.increment(a);
System.out.println("After incrementing="+y);
}
}