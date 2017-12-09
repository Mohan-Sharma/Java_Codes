import java.util.*;
class LargestWordReturn
{
public static void main(String arr[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter the String");
String str=in.nextLine();
String word[];
String largest;
String current;
String line=str.trim();
word=line.split(" ");
largest=word[0];
for(int i=0;i<word.length;i++)
{
current=word[i];
if(current.length()>largest.length())
largest=current;
}
System.out.println("Largest word is "+largest+" is of "+largest.length()+" length");
}
}