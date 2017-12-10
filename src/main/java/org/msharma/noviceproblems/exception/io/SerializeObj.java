package org.msharma.noviceproblems.exception.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Example of serialization.
 */
class Employee implements java.io.Serializable
{
	private String name,job;
	private int salary,empId;

	public Employee(String n,String job,int empId,int s)
	{
		this.name = n;
		this.salary = s;
		this.job = job;
		this.empId = empId;
	}
	public void display()
	{
		System.out.println(empId + "\t" + name + "\t" + job + "\t" + salary);
	}
}

public class SerializeObj
{
	public static void main(String arr[])
	{
		try(FileOutputStream fileOutputStream = new FileOutputStream("Employee.obj");
				ObjectOutputStream out = new ObjectOutputStream(fileOutputStream)
		){
			System.out.println("creating obj of Employee");
			Employee e1 = new Employee("Mohan","student",101,100000);
			Employee e2 = new Employee("Sharma","student",102,100000);
			System.out.println("Displaying obj details");
			e1.display();
			e2.display();
			System.out.println("Serializing objects");
			out.writeObject(e1);
			out.writeObject(e2);
			System.out.println("Successfully serialized");
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}}