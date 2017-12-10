import java.util.*;
class EmpList
{
public static void main(String arr[])
{
ArrayList list=new ArrayList();
list.add(new Emp("Mohan","Trainee",10000));
list.add(new Emp("Sharma","Trainee",20000));
list.add(new Emp("Sarbong","Trainee",30000));
list.add(new Emp("Lama","Trainee",40000));
list.add(new Emp("Snehil","Trainee",50000));
System.out.println("Number of elements of the list: "+list.size());
System.out.println("Displaying the contents of the list...");
Iterator itr=list.iterator();
while(itr.hasNext())
{
Emp e=(Emp)itr.next();
e.display();
}
System.out.println("Removing the following Emp from the list...");
Emp e1=new Emp("Snehil","Trainee",50000);
e1.display();
list.remove(e1);
System.out.println("Number of elements after removal..: "+list.size());
System.out.println("Searching the following element in the list...");
Emp e2=new Emp("Mohan","Trainee",10000);
e2.display();
System.out.println("Result of the search :"+list.contains(e2));
}
}