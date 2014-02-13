class StringBufferAppend
{
public static void main(String arr[])
{
StringBuffer s1=new StringBuffer("hello");
StringBuffer s2=s1.append("\tWorld");
System.out.println(s2);
System.out.println(s1==s2);
System.out.println(s2.insert(11,"\tHow r u?"));
}
}