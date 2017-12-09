class ThrowTest
{
public static void main(String arr[])
{
try
{
if(arr.length<2)
throw(new Exception("two arguments must be provided"));
int a=Integer.parseInt(arr[0]);
int b=Integer.parseInt(arr[1]);
if(b==0)
throw(new Exception("Second no must ne non-zero"));
int c=a/b;
System.out.println("Result is "+c);
}
catch(Exception e)
{
System.out.println(e);
}}
}