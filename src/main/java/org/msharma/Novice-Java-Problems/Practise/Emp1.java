class Emp1
{
String name;
int salary;
String job;
public Emp1(String n,String j,int s)
{
name=n;
job=j;
salary=s;
}
public void display()
{
System.out.println("Name\tJob\tSalary");
System.out.println(name+"\t"+job+"\t"+salary);
}
}