import java.io.*;
class RenameFolder
{
public static void main(String arr[]) throws Exception
{
if(arr.length!=2)
{
System.out.println("Usage java ReamneFOlder scr target");
System.exit(0);
}
else
{
File src=new File(arr[0]);
File target=new File(arr[1]);
if(!src.exists() || target.exists())
{
System.out.println("Either soruce doesnt exist or may be target exist");
}
else if(src.renameTo(target))
{
System.out.println("Successfully renamed");
}
else{
System.out.println("cannot be renamed");
}
}}
}