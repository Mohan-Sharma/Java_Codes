class puppet
{
puppet()
{
System.out.println("in default puppet");
}
puppet(int a)
{
System.out.println("in parameterized="+a);
}
}
class FinalBlank
{
final int i=0;
final int j;
final puppet p;
FinalBlank()
{
j=1;
p=new puppet();
System.out.println(j);
}
FinalBlank(int x)
{

j=x;
p=new puppet(4);
System.out.println(j);
System.out.println();
}
public static void main(String arr[])
{
FinalBlank bf=new FinalBlank();
FinalBlank cf=new FinalBlank(3);
}}