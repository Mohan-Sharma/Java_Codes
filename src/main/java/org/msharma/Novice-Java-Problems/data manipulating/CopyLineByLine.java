import java.io.*;
class CopyLineByLine
{
public static void main(String arr[])
{
try{
BufferedReader src=new BufferedReader(new InputStreamReader(new
FileInputStream(arr[0])));
PrintStream target=new PrintStream(new FileOutputStream(arr[1]));
long t1=System.currentTimeMillis();
while(true)
{
String line=src.readLine();
if(line==null)
break;
target.println(line);
}
target.close();
long t2=System.currentTimeMillis();
long t=t2-t1;
System.out.println("Successfully copied in "+t+" sec");
}
catch(Exception e)
{
System.out.println(e);
}
}

}