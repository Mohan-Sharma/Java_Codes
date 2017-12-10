package org.msharma.noviceproblems.exception.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Demonstrates how to use PrepareStatement in Java
 * Why to use PreparedStatement read {@link PreparedStatement}. One more advantage is batch update using PreparedStatement
 */
public class PrepareStatementTest
{
	private static final String URL = "jdbc:mysql://localhost:3306/cuppy";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	private static final String QUERY = "SELECT * FROM Employee";
	private static final String CLASS_NAME = "com.mysql.jdbc.Driver";
	private static final String INSERT_STATEMENT = "INSERT INTO Employee(emp_id, name, job, salary) VALUES(?,?,?,?)";

	public static void main(String arr[]) throws ClassNotFoundException, SQLException
	{
		Class.forName(CLASS_NAME);
		try (Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				PreparedStatement preparedStatementInsert = con.prepareStatement(INSERT_STATEMENT);
				PreparedStatement preparedStatementFetch = con.prepareStatement(QUERY))
		{
			preparedStatementInsert.setInt(1, 103);
			preparedStatementInsert.setString(2, "Mohan Sharma");
			preparedStatementInsert.setString(3, "Developer");
			preparedStatementInsert.setInt(4, 0000000);
			preparedStatementInsert.executeUpdate();
			System.out.println("Successfully inserted.");
			System.out.println("Displaying Data : ");
			try(ResultSet rset = preparedStatementFetch.executeQuery(QUERY))
			{
				while (rset.next())
				{
					System.out.println(
							rset.getInt("emp_id") + "\t" +
									rset.getString("name") + "\t" +
									rset.getString("job") + "\t" +
									rset.getInt("salary"));
				}
			}
		}
	}
}