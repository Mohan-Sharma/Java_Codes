class shape
{
public shape(int i)
{
System.out.println("Shape constructor");
}
public void cleanup()
{
System.out.println("Erasing shape");
}
}
class triangle extends shape
{
public triangle(int i)
{
super(i);
System.out.println("trianlge constructor");
}
public void cleanup()
{
System.out.println("Erasing shape");
super.cleanup();
}
}
class line extends shape
{
private int start,end;
public line(int start,int end)
{
super(start);
this.start=start;
this.end=end;
System.out.println("Line "+ start+" ,"+end);
}
public void cleanup()
{
System.out.println("Erasing line"+start+","+end);
super.cleanup();
}
}
public class CSystem extends shape
{
private triangle t;
private line a[]=new line[10];
CSystem(int i)
{
super(i+1);
for(int j=0;j<10;j++)
a[j]=new line(j,j*j);
t=new triangle(1);
System.out.println("Combined constructor");
}
public void cleanup()
{
System.out.println("Csystem.cleanup()");
t.cleanup();
for(int i=a.length-1;i>=0;i--)
a[i].cleanup();
super.cleanup();
}
public static void main(String arr[])
{
CSystem x=new CSystem(47);
x.cleanup();
}
}
