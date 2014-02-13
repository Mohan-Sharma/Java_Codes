import java.sql.*;
import java.util.*;
import java.io.*;
class ConnectionTest
{
public static void main(String arr[])
{
try{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
Statement stmt=con.createStatement();
ResultSet rset=stmt.executeQuery("SELECT * FROM EMP");
while(rset.next())
{
System.out.println(rset.getInt(1)+"\t"+rset.getString(2)+"\t"+rset.getString(3)+"\t"+rset.getInt(4));
}
}
catch(Exception e)
{}
}
}