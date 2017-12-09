class ab
{
public void ab()
{
System.out.println("its demo");
}
}
final class dino
{
int i=7;
int j=1;
ab x=new ab();
void f()
{
System.out.println("hi");}
}
public class jurasic extends dino
{
public static void main(String arr[])
{
dino z=new dino();
z.f();
z.i=40;
System.out.println(z.i);
z.j++;
System.out.println(z.j++);
}
} 
