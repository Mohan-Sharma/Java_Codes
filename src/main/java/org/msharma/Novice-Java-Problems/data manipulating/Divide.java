class Divide
{
public static int divide(int x,int y)
{
int z;
try{
return z=x/y;
}
catch(ArithmeticException ex)
{
System.out.println("Arithmetic Exception caught in divide rethrowing");
throw(ex);
}
}
public static void main(String arr[])
{
try{
int a=Integer.parseInt(arr[0]);
int b=Integer.parseInt(arr[1]);
int c=divide(a,b);
System.out.println("result is:"+c);
}
catch(Exception e)
{
System.out.println(e);
}
}
}