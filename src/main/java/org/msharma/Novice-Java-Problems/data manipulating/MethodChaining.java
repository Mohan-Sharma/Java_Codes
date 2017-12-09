class MethodChaining
{
int x,y;
public MethodChaining(int x,int y)
{
this.x=x;
this.y=y;
}
public MethodChaining swap()
{
int z=this.x;
this.x=this.y;
this.y=z;
return this;
}
public MethodChaining display()
{
System.out.println("x="+this.x);
System.out.println("y="+this.y);
return this;
}
public static void main(String arr[])
{
MethodChaining a=new MethodChaining(2,3);
a.display().swap().display();
}
}