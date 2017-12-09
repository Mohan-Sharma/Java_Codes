class InvalidFormatException extends Exception
{
public InvalidFormatException()
{
super();
}
public InvalidFormatException(String msg)
{
super(msg);
}
}
class CustomExceptionTest
{
public static void main(String arr[])
{
try
{
int a=Integer.parseInt(arr[0]);
int b=Integer.parseInt(arr[1]);
if(arr.length<2)
{
throw(new InvalidFormatException("two arguments required"));
}
if(b==0)
throw(new InvalidFormatException("2nd argument not equals zero"));
int c=a/b;
System.out.println("result is "+c);
}
catch(Exception e)
{
System.out.println(e);
}
}
}