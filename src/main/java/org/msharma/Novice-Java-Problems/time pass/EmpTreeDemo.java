import java.util.*;
class EmpTreeDemo
{
public static void main(String arr[])
{
try{
TreeSet set=new TreeSet();
set.add(new EmpforTree("Mohan","Trainee",10000));
set.add(new EmpforTree("Sharma","Trainee",20000));
set.add(new EmpforTree("Sarbong","Trainee",30000));
set.add(new EmpforTree("Lama","Trainee",40000));
set.add(new EmpforTree("Snehil","Trainee",50000));
System.out.println("Number of elements in the tree: "+set.size());
System.out.println("Displaying the contents..");
Iterator itr=set.iterator();
while(itr.hasNext())
{
EmpforTree e=(EmpforTree)itr.next();
e.display();
}
Set s1=new TreeSet(new JobComparator());
s1.addAll(set);
itr=s1.iterator();
System.out.println("Displaying the contents in the ascending order of the job");
while(itr.hasNext())
{
EmpforTree e1=(EmpforTree)itr.next();
e1.display();
}
Set s2=new TreeSet(new SalaryComparator());
s2.addAll(set);
itr=s2.iterator();
System.out.println("Displaying the contents in tht ascending order of the salary");
while(itr.hasNext())
{
EmpforTree e2=(EmpforTree)itr.next();
e2.display();
}
}
catch(Exception e){
System.out.println(e);
}
}
}