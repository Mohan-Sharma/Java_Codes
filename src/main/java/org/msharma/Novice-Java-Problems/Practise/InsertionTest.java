import java.io.*;
import java.util.*;
import java.sql.*;
class InsertionTest
{
public static void main(String arr[])
{
try
{
Scanner in=new Scanner(System.in);
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
PreparedStatement stmt=con.prepareStatement("INSERT INTO EMPTEST(EMPID,NAME,JOB,SALARY) VALUES(?,?,?,?)");
while(true)
{
System.out.println("Enter the EmpID");
String id=in.nextLine();
System.out.println("Enter the name");
String name=in.nextLine();
System.out.println("Enter the job");
String job=in.nextLine();
System.out.println("Enter the salary");
String salary=in.nextLine(); 
stmt.setString(1,id);
stmt.setString(2,name);
stmt.setString(3,job);
stmt.setString(4,salary);
stmt.executeUpdate();
System.out.println("want to insert more records");
String ans=in.nextLine();
if(ans.startsWith("n"))
break;
}
con.close();
System.out.println("Records successfully entered");
}
catch(Exception e){}
}
}