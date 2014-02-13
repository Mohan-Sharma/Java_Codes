import java.io.*;
class CopyTest2
{
public static void main(String arr[])
{
try{
FileInputStream src=new FileInputStream(arr[0]);
FileOutputStream tgt=new FileOutputStream(arr[1]);
long t1=System.currentTimeMillis();
byte b[]=new byte[src.available()];
src.read(b);
tgt.write(b);
tgt.close();
long t2=System.currentTimeMillis();
long t=t2-t1;
System.out.println("copied in "+t+" sec");
}
catch(Exception e)
{}
}
}