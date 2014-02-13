import java.util.*;
class TokenizerTest
{
public static void main(String arr[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter the string");
String str=in.nextLine();
StringTokenizer s=new StringTokenizer(str,";,. ");
System.out.println("There are "+s.countTokens()+" words");
while(s.hasMoreTokens())
{
System.out.println(s.nextToken());
}
}
}