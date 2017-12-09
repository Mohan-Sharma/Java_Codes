class ThrowTest
{
public static void main(String arr[])
{
try
{
if(arr.length<2)
throw(new Exception("two numbers must be provided"));
int a=Integer.parseInt(arr[0]);
int b=Integer.parseInt(arr[1]);
if(b==0)
throw(new Exception("2nd no must not be zero"));
int c=a/b;
System.out.println(c);
}
catch(Exception e)
{
System.out.println(e);
}
}
}