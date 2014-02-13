class EmpforHash
{
String name,job;
int salary;
public EmpforHash(String n,String j,int s)
{
name=n;
job=j;
salary=s;
}
public void display()
{
System.out.println(name+"\t"+job+"\t"+salary);
}
public int hashcode()
{
return this.name.hashCode()+this.job.hashCode()+this.salary;
}
}