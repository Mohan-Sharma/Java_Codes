class shape
{
public void  draw(){}
public void  erase(){}
}
class circle extends shape
{
public void  draw()
{
System.out.println("circle.draw()");
}
public void erase()
{
System.out.println("Erasing circle");
}
}
class square extends shape
{
public void draw()
{
System.out.println("square.draw()");
}
public void erase()
{
System.out.println("erasing square");
}
}
class triangle extends shape
{
public void draw()
{
System.out.println("triangle.draw()");
}
public void erase()
{
System.out.println("erasing triangle");
}
}
class testShape
{
public static shape shapes()
{
switch((int)(Math.random()*3)){
default:
case 0: return new circle();
case 1: return new triangle();
case 2: return new square();
}
}
public static void main()
{
shape s[]=new shape[9];
for(int i=0;i<s.length;i++)
s[i]=shapes();
for(int i=0;i<s.length;i++)
s[i].draw();
}
}