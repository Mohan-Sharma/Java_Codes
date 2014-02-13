class InvalidRangeException extends Exception
{
public InvalidRangeException()
{
super();
}
public InvalidRangeException(String msg)
{
super(msg);
}
}
class CustomTest
{
public static void main(String arr[])
{
try{
int a=Integer.parseInt(arr[0]);
if(a<50||a>100)
throw(new InvalidRangeException("valid range is 50 to 100"));
int s=a*a;
System.out.println("Square is "+s);
}
catch(Exception e)
{
System.out.println(e);
}
}
}