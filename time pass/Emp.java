//import java.util.*;
class Emp
{
String name,job;
int salary;
public Emp(String n,String j,int s)
{
name=n;
job=j;
salary=s;
}
public void display()
{
System.out.println(name+"\t"+job+"\t"+salary);
}
public boolean equals(Object o)
{
Emp e=(Emp)o;
return this.name.equals(e.name) && this.job.equals(e.job) && this.salary==e.salary;
}
/*
public int compareTo(Object o)
{
Emp e=(Emp)o;
return this.name.compareTo(e.name);
//return this.job.compareTo(e.job); 
//return this.salary-e.salary;
}
*/
}