import java.util.*;
class CircleArea
{
public static void main(String arr[])
{
Scanner in=new Scanner(System.in);
System.out.println("enter the radius of the circle");
int n=in.nextInt();
double area=Math.PI*n*n;
System.out.println("Area of the circle is "+area);
}
}