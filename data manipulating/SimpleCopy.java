import java.io.*;
class SimpleCopy
{
public static void main(String arr[])
{
try{
FileInputStream src=new FileInputStream(arr[0]);
FileOutputStream target=new FileOutputStream(arr[1]);
long t1=System.currentTimeMillis();
while(true)
{
int ch=src.read();
if(ch==-1)
break;
target.write(ch);
}
target.close();
long t2=System.currentTimeMillis();
long t=t2-t1;
System.out.println("Successfully copied in "+t+" seconds");
}
catch(Exception e)
{
System.out.println(e);
}
}
}