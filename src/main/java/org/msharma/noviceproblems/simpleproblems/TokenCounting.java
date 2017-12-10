import java.util.*;
import java.io.*;
class TokenCounting
{
	public static void main(String arr[])
	{
		try{
		int count=0;

		BufferedReader src=new BufferedReader(new InputStreamReader(new FileInputStream("some file")));
			while(true)
			{

               String line=src.readLine();
               if(line==null)
               	break;
               else
               {

               	StringTokenizer tr=new StringTokenizer(line," ");
               	while(tr.hasMoreTokens())
               	{

               		String str=tr.nextToken();
               		count++;
               	}
               }

		    }
			System.out.println("Number of tokens= "+count);
	}
catch(Exception e)
{
	System.out.println(e);
}
}
}