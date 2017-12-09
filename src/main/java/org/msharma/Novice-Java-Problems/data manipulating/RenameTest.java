import java.io.*;
class RenameTest
{
public static void main(String arr[])
{
if(arr.length!=2)
{
System.out.println("Usage:java RenameTest src target");
System.exit(0);
}
else{
File src=new File(arr[0]);
File target =new File(arr[1]);
if(!src.exists() || target.exists())
{
System.out.println("Src doesnt exist or target already exist");
}
else if(src.renameTo(target))
{
System.out.println("Name successfully chnged from "+src+" to "+target);
}
else
{
System.out.println("Cannot change name");
}
}

}
}