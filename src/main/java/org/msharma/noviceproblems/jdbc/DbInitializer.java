package org.msharma.noviceproblems.jdbc;

import org.apache.commons.lang.StringUtils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class DbInitializer
{
	private static final String URL = "jdbc:mysql://localhost:3306/dbName";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "mysql";
	private static final String CLASS_NAME = "com.mysql.jdbc.Driver";

	public static void main(String arr[]) throws ClassNotFoundException, SQLException, IOException
	{
		Class.forName(CLASS_NAME);
		try(Connection con = DriverManager.getConnection(URL, USERNAME,PASSWORD);
				BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(new FileInputStream("db.sql")));
				Statement stmt = con.createStatement())
		{
			String line = bufferedReader.readLine();
			while(StringUtils.isNotEmpty(line))
			{
				if(line.endsWith(";"))
					stmt.execute(line);
				else
				{
					line += bufferedReader.readLine();
				}
			}
		}
	}
}
