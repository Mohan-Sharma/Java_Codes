import java.util.*;
class EmpTypeSafe
{
public static void main(String arr[])
{
TreeSet<Emp1> set=new TreeSet<Emp1>();
set.add(new Emp1("Mohan","Student",1111111));
set.add(new Emp1("Mohan1","Student",1111111));
set.add(new Emp1("Mohan2","Student",1111111));
set.add(new Emp1("Mohan3","Student",1111111));
System.out.println("Displaying records...");
Iterator<Emp1> itr=set.iterator();
while(itr.hasNext())
{
Emp1 e=(Emp1)itr.next();
e.display();
}

}
}