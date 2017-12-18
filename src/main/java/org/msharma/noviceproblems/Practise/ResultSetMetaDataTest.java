package org.msharma.noviceproblems.Practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

class ResultSetMetaDataTest
{
	public static void main(String arr[])
	{
		try{
			if(arr.length==0)
			{
				System.out.println("Usage:java ResultSetMetaDataTest tableName");
				System.exit(0);
			}
			String query="SELECT * FROM "+arr[0];
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
			Statement stmt=con.createStatement();
			ResultSet rset=stmt.executeQuery(query);
			ResultSetMetaData rmd=rset.getMetaData();
			int c=rmd.getColumnCount();
			System.out.println("Following records are selected..");
			System.out.println("---------------------------------");
			for(int i=1;i<=c;i++)
				System.out.print(rmd.getColumnName(i)+" "+rmd.getColumnTypeName(i)+"\t");
			System.out.println();
			System.out.println("---------------------------------");
			while(rset.next())
			{
				System.out.println();
				for(int i=1;i<=c;i++)
				{
					System.out.print(rset.getString(i)+"\t\t");
				}
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}