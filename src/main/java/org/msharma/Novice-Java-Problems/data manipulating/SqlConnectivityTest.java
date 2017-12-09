import java.sql.*;
class SqlConnectivityTest
{
public static void main(String arr[])
{
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","mysql");
Statement stmt=con.createStatement();
ResultSet rset=stmt.executeQuery("select * from emp");
System.out.println("Following records are found");
while(rset.next())
{
System.out.println(rset.getString(1)+"\t"+rset.getString(2)+"\t"+rset.getString(3)+"\t"+rset.getString(4));
}
con.close();
}
catch(Exception ex)
{
System.out.println(ex);
}
}
}