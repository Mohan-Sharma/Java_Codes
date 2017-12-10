class RethrowTest
{
public static int divide(int a,int b)
{
int z=0;
try{
return z=a/b;
}
catch(ArithmeticException ae)
{
System.out.println("Rethrowng exception");
throw(ae);
}
finally
{
return 5;
//throw(new Exception("Invalid use of finally"));
}
}
public static void main(String arr[])
{
try{
if(arr.length<2)
throw(new Exception("Two arguments must be provided"));
int a=Integer.parseInt(arr[0]);
int b=Integer.parseInt(arr[1]);
int c=divide(a,b);
System.out.println("Result is "+c);
}
catch(Exception e)
{
System.out.println("Following exception caught");
System.out.println(e);
}
}
}