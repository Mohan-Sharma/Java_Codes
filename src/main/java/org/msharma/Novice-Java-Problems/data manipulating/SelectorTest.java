import java.sql.*;
class SelectorTest
{
public static void main(String arr[])
{
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:myDataSource","system","oracle");
Statement stmt=con.createStatement();
ResultSet rset=stmt.executeQuery("select * from emp");
System.out.println("Following records are found");
while(rset.next())
{
System.out.println(rset.getString(1)+"\t"+rset.getString(2)+"\t"+rset.getString(3)+"\t"+rset.getString(4));
}
con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}