package org.msharma.noviceproblems.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Demonstration of reading data from Oracle DB in Java very naive approach.
 * This example is for starter, never use Statement use PreparedStatement instead
 * This example assumes you have Oracle connector jar in the class path
 */
class OracleDBConnector
{
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USERNAME = "system";
	private static final String PASSWORD = "oracle";
	private static final String QUERY = "SELECT * FROM EMP";
	private static final String CLASS_NAME = "oracle.jdbc.driver.OracleDriver";
	public static void main(String arr[]) throws ClassNotFoundException, SQLException
	{
		Class.forName(CLASS_NAME);
		try(Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				Statement stmt = con.createStatement();
				ResultSet rset = stmt.executeQuery(QUERY))
		{
			while(rset.next())
			{
				System.out.println(
						rset.getInt(1) + "\t" +
								rset.getString(2) + "\t" +
								rset.getString(3) + "\t" +
								rset.getInt(4));
			}
		}
	}
}