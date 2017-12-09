import java.io.*;
import java.util.*;
class TokenCount
{
public static void main(String arr[])
{
int count=0;
try
{
BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("C:/Users/Rachna/java/CloneTest.java")));
while(true)
{
String line=br.readLine();
if(line==null)
break;
else
{
StringTokenizer str=new StringTokenizer(line," ");
while(str.hasMoreTokens())
{
String str1=str.nextToken();
count++;
}
}
}
System.out.println("No of tokens "+count);
}
catch(Exception e)
{}
}}