import java.io.*;
class RenameFolder{
public static void main(String arr[])
{
try{
if(arr.length!=2)
{
System.out.println("Usage: java RenameFolder srcFolder TargetFolder");
}
else{
File src=new File(arr[0]);
File target=new File(arr[1]);
if(!src.exists() || target.exists())
System.out.println("Either src not exists or target already exists");
else if(src.renameTo(target))
System.out.println("Successfully renamed");
else
System.out.println("Cannot rename");
}
}
catch(Exception e){}
}
}