class DivideException
{
public static void main(String arr[])
{
try{
int a=Integer.parseInt(arr[0]);
int b=Integer.parseInt(arr[1]);
int c=a/b;
System.out.println("Result="+c);
}
catch(ArithmeticException e)
{
System.out.println("2nd no must not be zero");
}
catch(ArrayIndexOutOfBoundsException ex)
{
System.out.println("Two arguments must be provided");
}
catch(NumberFormatException e)
{
System.out.println("Number must be numeric");
}
}
}