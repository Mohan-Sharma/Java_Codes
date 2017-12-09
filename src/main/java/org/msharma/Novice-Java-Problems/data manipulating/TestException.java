class TestException
{
public static void main(String arr[])
{
try{
int a=Integer.parseInt(arr[0]);
int b=Integer.parseInt(arr[1]);
int c=a/b;
}
catch(ArithmeticException e)
{
System.out.println("2nd no must not be numeric");
}
catch(ArrayIndexOutOfBoundsException e)
{

System.out.println("two arguments must be provided");
}
catch(NumberFormatException e)
{

System.out.println("numbers must be numeric");
}
}
}