class StringTokenizerTest
{
public static void main(String arr[])
{
StringTokenizer s1=new StringTokenizer("This is a tokenized string");
StringTokenizer s2=new StringTokenizer("int a; charc,d;",";,");
System.out.println(s1);
System.out.println(s2);
}
}