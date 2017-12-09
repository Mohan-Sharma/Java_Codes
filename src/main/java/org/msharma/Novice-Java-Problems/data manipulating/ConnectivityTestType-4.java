import java.util.*;
import java.io.*;
import java.sql.*;
class ConnectivityTestType-4
{
Static String driverClass,url,user,password;
static
{
try
{
Properties p=new Properties();
p.load(new FileInputStream("db.properties"));
driverClass=p.getProperties("driverClass");
url=p.getProperties("url");
user=p.getProperties("user");
password=p.getProperties("password");
}
catch(Exception e)
{
System.out.println(e);
}
}
public static void main(String arr[])
{
Connection con=null;
try{
Class.forName(driverClass);
con=Drivermanager.getConnection(url,user,password);
}
catch(Exception e)
{
System.out.println(e);
}
return con;
} 
}