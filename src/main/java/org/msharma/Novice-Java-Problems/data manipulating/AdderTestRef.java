class Adder
{
public static void increment(Mynumber x)
{
x.value=x.value+1;
} 
}
class AdderTestRef
{
public static void main(String arr[])
{
Mynumber a=new Mynumber(4);
System.out.println("Value of a=");
System.out.println(a.value);
Adder.increment(a);
System.out.println("After incrementing");
System.out.println(a.value);
}
}
class Mynumber{
int value;
public Mynumber(int x)
{
value=x;
}

}