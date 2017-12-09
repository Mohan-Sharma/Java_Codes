class ref
{
public static void display()
{
System.out.println("In a");
}
}
class fer extends ref
{
public static void display()
{
System.out.println("In b");
}
public static void main(String arr[])
{
fer b=new fer();
ref a=new ref();
ref c=b;
b.display();
a.display();
c.display();
}
}