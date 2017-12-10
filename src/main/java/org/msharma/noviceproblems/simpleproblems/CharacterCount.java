import java.util.*;
class CharacterCount
{
public static void main(String arr[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter the string..");
String str=in.nextLine();
String str1=str.trim();
//System.out.println("no of character in the string"+str.length());
char[] a=str1.toCharArray();
System.out.println("No of character "+a.length);
}
}