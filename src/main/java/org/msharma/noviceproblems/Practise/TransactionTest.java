package org.msharma.noviceproblems.Practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

class TransactionTest
{
	public static void main(String arr[])
	{
		Connection con=null;
		try
		{
			System.out.println("creating connection....");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
			//con=connectionProvider.getConnection();
			con.setAutoCommit(false);
			PreparedStatement stmt1=con.prepareStatement("UPDATE ACCOUNT1 SET BALANCE=BALANCE+? WHERE ACCOUNTNO=?");
			PreparedStatement stmt2=con.prepareStatement("UPDATE ACCOUNT1 SET BALANCE=BALANCE-? WHERE ACCOUNTNO=?");
			Scanner in=new Scanner(System.in);
			System.out.println("Enter the source account");
			String src=in.nextLine();
			System.out.println("Enter the target account");
			String target=in.nextLine();
			System.out.println("Enter the amount");
			int amt=in.nextInt();
			stmt1.setInt(1,amt);
			stmt1.setString(2,target);
			stmt1.executeUpdate();

			stmt2.setInt(1,amt);
			stmt2.setString(2,src);
			stmt2.executeUpdate();
			con.commit();
			con.close();
			System.out.println("Successfully committed...");
		}
		catch(Exception e)
		{
			System.out.println("Connection failed rolling back..");
			try
			{
				con.rollback();
				System.out.println("Successfully rolled back...");
			}
			catch(Exception ex)
			{
				System.out.println("Cannot rollback...");
			}
		}
	}
}