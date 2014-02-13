import java.util.*;
import java.sql.*;
class PrepareStatementTest
{
public static void main(String arr[])
{
try{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
PreparedStatement stmt=con.prepareStatement("INSERT INTO EMP(ID,NAME,JOB,SALARY) VALUES(?,?,?,?)");
Scanner in=new Scanner(System.in);
while(true)
{
System.out.println("Enter the id");
int id=in.nextInt();
in.nextLine();
System.out.println("Enter the name");
String n=in.nextLine();
System.out.println("Enter the job");
String j=in.nextLine();
System.out.println("Enter the salary");
int s=in.nextInt();
stmt.setInt(1,id);
stmt..setString(2,n);
stmt.setString(3,j);
stmt.setInt(4,s);
in.nextLine();
stmt.executeUpdate();
//stmt.addBatch();
System.out.println("Want to enter more records");
String ans=in.nextLine();
if(ans.startsWith("n"))
break;
}
//stmt.executeBatch();
con.close();
System.out.println("Successfully saved");
}
catch(Exception e)

{}
}}