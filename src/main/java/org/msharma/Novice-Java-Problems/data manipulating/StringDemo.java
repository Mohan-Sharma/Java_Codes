class StringDemo
{
public static String s1="abcdef";
public static void main(String arr[])
{
String s2="abc"+"def";
String s3=new String("abc") +"def";
String s4=new String("abcdef");
System.out.println(s1==s2);
System.out.println(s1==s3);
System.out.println(s1==s4);
System.out.println(s2==s3);
System.out.println(s3==s4);
System.out.println(s1.equals(s4));
System.out.println(s2.equals(s3));

}
}