import java.io.*;
class AdvCopy
{
public static void main(String arr[])
{
try{
FileInputStream src=new FileInputStream(arr[0]);
FileOutputStream target=new FileOutputStream(arr[1]);
long t1=System.currentTimeMillis();
byte data[]=new byte[src.available()];
src.read(data);
target.write(data);
target.close();
long t2=System.currentTimeMillis();
long t=t2-t1;
System.out.println("Successfully copied in "+t+" sec");
}
catch(Exception e){}
}
}