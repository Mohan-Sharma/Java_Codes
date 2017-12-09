class MisuseFinally
{
public static int divide(int x,int y)
{ try{
return x/y;
}
catch(ArithmeticException e)
{
throw(e);
//System.out.println(e)
}
finally
{
//throw(new Exception("It is a misuse of finally"));
}
}
public static void main(String arr[])
{
try{
int a=Integer.parseInt(arr[0]);
int b=Integer.parseInt(arr[1]);
int c=divide(a,b);
System.out.println("result-"+c); 
}
catch(Exception e)
{
System.out.println(e);
}
}
}