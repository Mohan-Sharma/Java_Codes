package org.msharma.noviceproblems.property_file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

class WritingToPropertyFile
{
	public static void main(String arr[])
	{
		try(FileOutputStream out=new FileOutputStream("trainer.properties"))
		{

			Properties properties = new Properties();
			properties.setProperty("Sam","java");
			properties.setProperty("Tom",".net");
			properties.setProperty("Vick","php");
			System.out.println("Displaying details.....");
			for (Map.Entry<Object, Object> property : properties.entrySet())
			{
				System.out.println("Key: " + property.getKey() + "Value: " + property.getValue());
			}
			System.out.println("Saving properties...");
			properties.store(out,"trainer.properties");
			System.out.println("Successfully saved...");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}