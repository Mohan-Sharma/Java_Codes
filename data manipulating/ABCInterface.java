class ABCInterface implements doAble
{
public void do()
{
System.out.println("Eg of interface");
}
public static void main(String arr[])
{
ABCInterface a=new ABCInterface();
a.do();
}
}
interface doAble
{
void do();
}