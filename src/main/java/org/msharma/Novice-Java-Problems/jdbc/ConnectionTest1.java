import java.sql.*;
import java.util.*;
import java.io.*;
class ConnectionTest1
{
public static void main(String arr[])
{
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","mysql");
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