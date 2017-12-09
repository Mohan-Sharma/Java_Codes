class emp implements java.io.Serializable
{
private String name,job;
private int salary;
public emp(String n,String j,int s)
{
name=n;
job=j;
salary=s;
}
public void display()
{
System.out.println(name+"\t"+job+"\t"+salary);
}
}

