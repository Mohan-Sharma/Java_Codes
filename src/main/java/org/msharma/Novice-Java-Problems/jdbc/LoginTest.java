import java.io.*;
import java.util.*;
import java.sql.*;

class LoginTest 
{
public static void main(String arr[])
{

Scanner in=new Scanner(System.in);
System.out.println("Enter the emailid");
String emailid=in.nextLine();
System.out.println("Enter the password");
String password=in.nextLine();
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
Statement stmt=con.createStatement();
ResultSet rset=stmt.executeQuery("SELECT EMAILID,PASSWORD FROM LOGINTEST WHERE EMAILID=? AND PASSWORD=?");
while(rset.next())
{
System.out.println("Emailid\tpassword");
System.out.println(rset.getString(1)+rset.getString(2));
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}