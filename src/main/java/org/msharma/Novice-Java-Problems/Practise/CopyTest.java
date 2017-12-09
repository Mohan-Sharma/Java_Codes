import java.io.*;
class CopyTest
{
public static void main(String arr[])
{
try{
FileInputStream src=new FileInputStream(arr[0]);
FileOutputStream tgt=new FileOutputStream(arr[1]);
long t1=System.currentTimeMillis();
while(true)
{
int ch=src.read();
if(ch==-1)
break;
tgt.write(ch);
}
long t2=System.currentTimeMillis();
tgt.close();
long t=t2-t1;
System.out.println("copied in "+t+" sec");
}
catch(Exception e)
{}
}
}