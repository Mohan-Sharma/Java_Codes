import java.util.*;
import java.io.*;
import java.sql.*;
class ConnectivityTestType4
{
static String driverClass,url,user,password;
static
{
try
{
Properties p=new Properties();
p.load(new FileInputStream("data.properties"));
driverClass=p.getProperty("driverClass");
url=p.getProperty("url");
user=p.getProperty("user");
password=p.getProperty("password");
}
catch(Exception e)
{
System.out.println(e);
}
}
public static Connection getConnection()
{
Connection con=null;
try{
Class.forName(driverClass);
con=DriverManager.getConnection(url,user,password);
}
catch(Exception e)
{
System.out.println(e);
}
return con;
} 
}