class Mortal
{
static Mortal immortal=null;
String name;
public Mortal(String n)
{
name=n;
System.out.println("A mortal named "+name+" is born");
}
public void finalize()
{
System.out.println("Call of death has come for "+name);
System.out.println(name+" has saved himself from the claws of death");
}
public void describeyourself()
{
System.out.println(name+" has become mortal");
}
}
class God
{
public static void main(String arr[]) throws Exception
{
System.out.println("Sending a immortal name Markendey to earth");
Mortal z=new Mortal("Markendey");
Thread.sleep(5000);
System.out.println("Life of markendey is over sending yumraj to bring him back");
z=null;
System.gc();
Thread.sleep(2000);
System.out.println("Yumraj is back");
System.out.println("Checking if there are any mortal left");
if(Mortal.immortal!=null);
Mortal.immortal.describeyourself();
}
}