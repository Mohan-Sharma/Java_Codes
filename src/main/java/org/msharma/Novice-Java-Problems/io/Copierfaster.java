import java.io.*;
class Copierfaster
{
public static void main(String arr[])
{
try{
BufferedReader src=new BufferedReader(new InputStreamReader(new FileInputStream(arr[0])));
PrintStream target=new PrintStream(new FileOutputStream(arr[1]));
long t1=System.currentTimeMillis();
while(true)
{
String str=src.readLine();
if(str==null)
break;
target.println(str);
}
target.close();
long t2=System.currentTimeMillis();
long t=t2-t1;
System.out.println("Successfully copied in "+t+" sec");
}
catch(Exception e){}
}
}