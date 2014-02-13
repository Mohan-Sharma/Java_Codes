import java.util.*;
import java.io.*;
class CharCounting
{
	public static void main(String arr[])
	{
		int count=0;
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("a.txt")));
			while(true)
			{
				String line=br.readLine();
				for(int i=0;i<=line.length();i++)
				{
					char c=line.charAt(i);
					if(c=='a'|| c=='A' || c=='O' || c=='o'|| c=='I' || c=='i' || c=='E' || c=='e' || c=='u' || c=='U')
					{
						count++;
					}
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("No of vowels= "+count);
	}
}
