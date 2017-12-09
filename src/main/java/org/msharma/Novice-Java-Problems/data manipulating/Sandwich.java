class Meal
{
public Meal()
{
System.out.println("meal()");
}
}
class Bread
{
Bread()
{
System.out.println("Bread()");
}
}
class Cheese
{
Cheese()
{
System.out.println("cheese()");
}
}
class Lettuce
{
Lettuce()
{
System.out.println("Lettuce()");
}
}
class Lunch extends Meal
{
Lunch()
{
System.out.println("Lunch()");
}
}
class PortableLunch extends Lunch
{
PortableLunch()
{
System.out.println("portableLunch()");
}
}
class SandWich extends PortableLunch
{
Bread b=new Bread();
public SandWich()
{
System.out.println("Sandwich()");
}
public static void main(String arr[])
{
new SandWich();
new Cheese();
new Lettuce();
}}