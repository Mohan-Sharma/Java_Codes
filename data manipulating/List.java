import java.io.*;
class List
{
public static void main(String arr[]) throws Exception
{
File f;
if(arr.length==0)
f=new File(".");
else
f=new File(arr[0]);
if(f.exists() && f.isDirectory())
{
String contents[]=f.list();
for(int i=0;i<contents.length;i++)
{
File temp=new File(f.contents[i]);
if(temp.isDirectory())
System.out.println("<DIR>\t	\t "+contents[i]);
else
{
long len=temp.length();
System.out.println(" \t "+len+"\t "+contents[i]);
}
}
}
else
{
System.out.println("Doesn't exists or not a directory");
}
}
}