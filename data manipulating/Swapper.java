class Swapper
{
int a,b;
public Swapper(int a,int b)
{
this.a=a;
this.b=b;
}
public Swapper display()
{
System.out.println("a="+a);
System.out.println("b="+b);
return this;
}
public Swapper swap()
{
int c=this.a;
this.a=this.b;
this.b=c;
return this;
}
public static void main(String aa[])
{
new Swapper(4,5).display().swap().display();
//Swapper x=new Swapper(3,4);
//x.display().swap().display();
//x.swap();
//x.display();
}
}