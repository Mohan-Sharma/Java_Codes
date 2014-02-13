import java.io.*;
class CreateFolder
{
public static void main(String arr[])
{
try{
if(arr.length==0)
System.out.println("usage: java CreateFolder name");
else
{
File f=new File(arr[0]);
if(f.exists() || f.isDirectory())
{
System.out.println("Already exists");
}
else if(f.mkdir())
{
System.out.println("Successfully created");
}
else
{
System.out.println("Cannot create");
}}
}
catch(Exception e)
{}
}
}