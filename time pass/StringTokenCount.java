import java.util.*;
class StringTokenCount
{
	public static void main(String arr[])
	{
	int count=0;
	try
	{
	Scanner in=new Scanner(System.in);
	System.out.println("enter the String....");
	String line=in.nextLine();
    StringTokenizer tr=new StringTokenizer(line," ");
    while(tr.hasMoreTokens())
    {

    String str=tr.nextToken();
    count++;
    }
    System.out.println("No of tokens= "+count);
    		}
 catch(Exception e)
 {
 System.out.println(e);
 }
 }
}