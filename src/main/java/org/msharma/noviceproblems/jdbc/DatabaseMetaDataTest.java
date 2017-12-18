package org.msharma.noviceproblems.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

class DatabaseMetaDataTest
{
	private static final String URL = "jdbc:mysql://localhost:3306/dbName";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "mysql";
	private static final String CLASS_NAME = "com.mysql.jdbc.Driver";

	public static void main(String arr[]) throws ClassNotFoundException, SQLException
	{
		Class.forName(CLASS_NAME);
		try(Connection connection = DriverManager.getConnection(URL, USERNAME,PASSWORD))
		{
			DatabaseMetaData dmd=connection.getMetaData();
			System.out.println("Name of the RDBMS package is: " + dmd.getDatabaseProductName());
			System.out.println("Name of the driver is: " + dmd.getDriverName());
			ResultSet resultSet = dmd.getTables(null,"SYSTEM",null,new String[]{"TABLE","VIEW"});
			while(resultSet.next())
			{
				System.out.println(resultSet.getString(3)+"\t");
			}
		}
	}
}