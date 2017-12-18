package org.msharma.noviceproblems.property_file;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

class ReadingPropertyFile
{
	public static void main(String arr[])
	{
		try(FileInputStream fileInputStream = new FileInputStream("fee.properties"))
		{
			Properties properties = new Properties();
			System.out.println("loading properties...");
			properties.load(fileInputStream);
			System.out.println("Following  properties are found...");
			System.out.println("Course/tFee");
			for (Map.Entry<Object, Object> property : properties.entrySet())
			{
				System.out.println("Key: " + property.getKey() + "Value: " + property.getValue());
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}