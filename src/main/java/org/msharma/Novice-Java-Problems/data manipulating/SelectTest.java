import java.sql.*;
class SelectTest
{
public static void main(String arr[])
{
try{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
Statement stmt=con.createStatement();
ResultSet rset=stmt.executeQuery("select * from EMP");
System.out.println("Following records are selected");
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