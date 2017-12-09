import java.util.*;
class TokenCountUsingTokenizer
{
public static void main(String arr[])
{
int count=0;
Scanner in=new Scanner(System.in);
System.out.println("Enter the String....");
String str=in.nextLine();
System.out.println("Enter the string to count....");
String s=in.nextLine();
StringTokenizer tr=new StringTokenizer(str," ");
while(tr.hasMoreTokens())
{
String str1=tr.nextToken();
if(str1.equals(s))
count++;
}
System.out.println(s+" occurs "+count+" times");
}
}
