class Showable
{
public void show()
{
System.out.println("Each class will inherit show() method");
}
}
class ByGiftEg extends Showable
{
public static void main(String arr[])
{
ByGiftEg a=new ByGiftEg();
a.show();
}
}