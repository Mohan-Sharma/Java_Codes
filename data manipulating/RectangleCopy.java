class RectangleCopy
{
int length,breadth;
public int area(int l,int b)
{
length=l;
breadth=b;
return l*b;
}
public static void main(String arr[])
{
RectangleCopy r=new RectangleCopy();
System.out.println("Area"+r.area(2,3));
}
}