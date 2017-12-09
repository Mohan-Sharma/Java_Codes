import java.io.*;
import java.util.*;
class PalindromeWordTester
{
	public static void main(String arr[])
	{
		try
		{
			int count=0;
			BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(arr[0])));
			PrintStream out=new PrintStream(new FileOutputStream(arr[1]));
			while(true)
			{
				String line=br.readLine();
				if(line==null)
				break;
				else
				{
					StringTokenizer tr=new StringTokenizer(line," ");
					while(tr.hasMoreTokens())
					{
						String str=tr.nextToken();
						String rev="";
						System.out.println(str);
						for(int i=str.length()-1;i>=0;i--)
						{
							rev=rev+str.charAt(i);
							if(str.equals(rev))
							{
								count++;
								out.println(str);
							}
						}
					}
					out.println("No of palindrome word available = "+count);
					System.out.println(count);
					out.close();
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}