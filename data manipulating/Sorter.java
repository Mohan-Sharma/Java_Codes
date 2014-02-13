import java.util.StringTokenizer;
public class Sorter
{
public static void main(String arr[])
{
String str="now is the time for all good men to come to the aid of their country";
StringTokenizer st=new StringTokenizer(str);
String tokens[]=new  String[st.countTokens()];
for(int i=0;i<tokens.length;i++)
{
tokens[i]=st.nextToken();
for(int j=i+1;j<tokens.length;i++)
{
String temp="";
if(tokens[j].compareTo(tokens[i])<0)
{
temp=tokens[i];
tokens[i]=tokens[j];
tokens[j]=temp;
}}}
for(int i=0;i<tokens.length;i++)
System.out.println(tokens[i]);
}
}