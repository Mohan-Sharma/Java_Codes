class MethodChainingTest
{int x,y;
public MethodChainingTest(int x,int y)
{
this.x=x;
this.y=y;
}
public MethodChainingTest display()
{
System.out.println("x="+x);
System.out.println("y="+y);
return this;
}
public MethodChainingTest swapper()
{
int z=this.x;
this.x=this.y;
this.y=z;
return this;
}
public static void main(String arr[])
{new MethodChainingTest(2,3).display().swapper().display();
} 
}