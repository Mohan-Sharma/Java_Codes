class Mortal
{
static Mortal immortal=null;
String name;
public Mortal(String n)
{ 
name=n;
System.out.println("Sending a mortal name "+name+" to earth");
}
public void finalize()
{
System.out.println("A call of death has come for "+name);
immortal=this;
System.out.println(name+" has saved himself from the claws of death");
}
public void describeYourself()
{
System.out.println("Hi i am "+name);
System.out.println("I've become immortal");
}
}
class Creator
{
public static void main(String arr[]) throws Exception
{
Mortal a=new Mortal("Markendey");
Thread.sleep(2000);
System.out.println("Life of markendey is over sending yumraj to take him back");
a=null;
System.gc();
Thread.sleep(2000);
System.out.println("Yumraj has come back to Earth");
System.out.println("Checking if any mortal left");
Thread.sleep(2000);
if(Mortal.immortal !=null)
{
a.describeYourself();
}
}
}