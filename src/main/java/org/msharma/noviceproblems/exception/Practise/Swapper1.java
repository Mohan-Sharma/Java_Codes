import java.util.*;
class Swapper1
{
int x,y;
public Swapper1(int x,int y)
{
this.x=x;
this.y=y;
}
public Swapper1 swap()
{
int z=this.x;
this.x=this.y;
this.y=z;
return this;
}
public Swapper1 display()
{
System.out.println("x= "+x);
System.out.println("y ="+y);
return this;
}
public static void main(String arr[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter the first number...");
int a=in.nextInt();
System.out.println("Enter the second number...");
int b=in.nextInt();
Swapper1 x=new Swapper1(a,b);
System.out.println("Before swapping ...");
x.display();
x.swap();
System.out.println("After swapping...");
x.display();

}
}