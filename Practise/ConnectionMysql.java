import java.sql.*;
import java.io.*;
import java.util.*;
class ConnectionMysql
{
static String driverClass;
static String url,user,password;
static
{
try{
Properties p=new Properties();
p.load(new FileInputStream("db.properties"));
driverClass=p.getProperty("driverClass");
url=p.getProperty("url");
user=p.getProperty("user");
password=p.getProperty("password");
}

catch(Exception e){}
}
public static void main(String arrr[])
{
Connection con=null;
try
{
Class.forName(driverClass);
con=DriverManager.getConnection(url,user,password);
Statement stmt=con.createStatement();
ResultSet rset=stmt.executeQuery("SELECT * FROM EMPDEMO");
while(rset.next())
{
System.out.println(rset.getString(1)+"\t"+rset.getString(2)+"\t"+rset.getString(3));
}
con.close();
}
catch(Exception e){}
//return con;
}

}
