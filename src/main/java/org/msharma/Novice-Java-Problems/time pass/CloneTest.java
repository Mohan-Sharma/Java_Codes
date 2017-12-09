import java.util.*;
class CloneTest
{
	public static void main(String arr[])
	{

	Employee emp=new Employee("mohan",10000);
	Employee emp1=(Employee)emp.clone();
	emp.setHireDay(2000,10,8);
	emp1.setHireDay(2010,12,10);
	emp1.salaryRise(20);
	System.out.println("employee="+emp);
	System.out.println("Copy="+emp1);
	}

}
class Employee implements Cloneable
{
	private String name;
	private double salary;
	private Date hireDay;
	public Employee(String n,double s)
	{
     name=n;
     salary=s;

	}

	public void setHireDay(int year,int month,int day)
	{

	hireDay=new GregorianCalendar(year,month - 1, day).getTime();

	}
	public void salaryRise(double byPercent)
	{
	double rise=salary*byPercent/100;
	salary+=rise;
	}

	public String toString()
	{
	return "name="+name+" Salary="+salary+" hireDay="+hireDay;
	}
	public Object clone()
	{

try
{
	Employee cloned=(Employee)super.clone();
	cloned.hireDay=(Date)hireDay.clone();
	return cloned;

}
catch(Exception e)
{

	System.out.println(e);
}
}
}