import java.util.*;
class EmpHash
{
public static void main(String arr[])
{
HashSet set=new HashSet();
set.add(new EmpforHash("Mohan","Trainee",10000));
set.add(new EmpforHash("Sharma","Trainee",20000));
set.add(new EmpforHash("Sarbong","Trainee",30000));
set.add(new EmpforHash("Lama","Trainee",40000));
set.add(new EmpforHash("Snehil","Trainee",50000));
System.out.println("Number of entries in the hashtable :"+set.size());
System.out.println("Displaying the contents of the hashTable");
Iterator itr=set.iterator();
while(itr.hasNext())
{
EmpforHash e=(EmpforHash)itr.next();
System.out.println(e.hashcode()+"\t");
e.display();
}
System.out.println("Removing an element from the hash..");
EmpforHash e1=new EmpforHash("Snehil","Trainee",50000);
System.out.println(e1.hashcode());
e1.display();
set.remove(e1);
System.out.println("Number of elements after removal :"+set.size());
System.out.println("Seaching an element in the list:");
EmpforHash e2=new EmpforHash("Sarbong","Trainee",30000);
System.out.println(e2.hashcode());
e2.display();
System.out.println("Result of the search :"+set.contains(e2));
}
}