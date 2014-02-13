class StringToCharArray
{
public static void main(String arr[])
{
String str="check";
char c[]=str.toCharArray();
for(int i=0;i<c.length;i++)
c[i]-=32;
String str2=new String(c);
System.out.println(str2);

}
}