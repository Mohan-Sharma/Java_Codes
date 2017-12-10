import java.sql.*;
import java.util.*;
class DatabaseMetaDataTest
{
public static void main(String arr[])
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
DatabaseMetaData dmd=con.getMetaData();
System.out.println("Name of the rdms package is "+dmd.getDatabaseProductName());
System.out.println("Name of the driver is "+dmd.getDriverName());
System.out.println("Enter the criteria.....");
Scanner in=new Scanner(System.in);
String c=in.nextLine();
ResultSet rset=dmd.getTables(null,"SYSTEM",null,new String[]{c});
while(rset.next())
{
System.out.println(rset.getString(3)+"\t");
}
con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}