import java.util.*;
import java.io.*;
import java.sql.*;
class DbInitializer
{
public static void main(String arr[])
{
try
{
System.out.println("Creating connection..");
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
Statement stmt=con.createStatement();
FileInputStream src=new FileInputStream("db.sql");
byte a[]=new byte[src.available()];
src.read(a);
String line=new String(a);
StringTokenizer str=new StringTokenizer(line,"/");
while(str.hasMoreTokens())
{
String line1=str.nextToken();
stmt.execute(line1);
}
con.close();
System.out.println("Successfully created....");
}
catch(Exception e)
{
System.out.println(e);
}
}
}
