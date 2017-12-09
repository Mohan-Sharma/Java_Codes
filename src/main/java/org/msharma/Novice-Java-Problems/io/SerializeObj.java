import java.io.*;
class emp implements java.io.Serializable
{
String name,job;
int salary,empid;
public emp(String n,String j,int id,int s)
{
name=n;
salary=s;
job=j;
empid=id;
}
public void display()
{
System.out.println(empid+"\t"+name+"\t"+job+"\t"+salary);
}
}
class SerializeObj
{
public static void main(String arr[])
{
try{
System.out.println("creating obj of emp");
emp e1=new emp("mohan","student",101,100000);
emp e2=new emp("Sharma","student",102,100000);
System.out.println("Displaying obj details");
e1.display();
e2.display();
System.out.println("Serializing objects");
ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("emp.obj"));
out.writeObject(e1);
out.writeObject(e2);
System.out.println("Successfully serialized");
}
catch(Exception e)
{}
}}