import java.sql.*;
class ConnectivityTest
{
public static void main(String arr[])
{
try{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
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