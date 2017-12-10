package org.msharma.noviceproblems.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Example of Deserialization.
 */
public class Deserialize
{
	public static void main(String arr[]) throws IOException, ClassNotFoundException
	{
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream("Employee.obj"))) //read the serialized file
		{
			System.out.println("Deserializing objects");
			Employee e1 = (Employee)in.readObject();
			Employee e2 = (Employee)in.readObject();
			System.out.println("Successfully deserialize");
			System.out.println("Displaying details");
			e1.display();
			e2.display();
		}
	}
}
