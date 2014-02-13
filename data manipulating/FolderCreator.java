import java.io.*;
class FolderCreator
{
public static void main(String arr[])
{
try
{
if(arr.length==0)
{
System.out.println("Usage:Java FolderCreator name or path");
System.exit(0);
}
else
{
File f=new File(arr[0]);
if(f.exists() && f.isDirectory())
{
System.out.println("Already exist");
}
else if(f.mkdir())
{
System.out.println("successfully created");
}
else
{
System.out.println("Cannot create");
}}
}
catch(Exception e){}
}
}