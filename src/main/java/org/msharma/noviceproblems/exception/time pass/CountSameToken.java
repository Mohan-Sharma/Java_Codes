import java.util.*;
import java.io.*;
class CountSameToken
{
	public static void main(String arr[])
	{
		int count=0;
		try
		{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String..");
		String str1=in.nextLine();
        System.out.println("Enter the string which is to be find..");
        String str2=in.nextLine();
        StringTokenizer tr=new StringTokenizer(str1," ");
		while(tr.hasMoreTokens())
		{
			String str3=tr.nextToken();
			if(str3.equalsIgnoreCase(str2))
			{
				count++;
			}
		}
		System.out.println("No of repeating token= "+count);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}

	}

}