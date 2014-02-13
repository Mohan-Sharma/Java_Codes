import java.util.*;
import java.lang.*;
class PalindromeFinder
{
public static void main(String arr[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter the String.");
String str=in.nextLine();
String str1="";
for(int i=str.length()-1;i>=0;i--)
str1=str1+str.charAt(i);
if(str1.equals(str))
System.out.println(str+"\tPalindrome");
else
System.out.println(str+"\tNot Palindrome");
}
}