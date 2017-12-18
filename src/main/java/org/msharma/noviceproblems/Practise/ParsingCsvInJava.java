package org.msharma.noviceproblems.Practise;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.LinkedHashMap;
import java.util.Map;

class ParsingCsvInJava
{
	public static void main(String arr[])
	{
		String countryCode="";
		String countryName="";
		try
		{
			Map<String,String> map=new LinkedHashMap<String,String>();
			BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("C:/Users/Toshiba.Toshiba-PC/Downloads/GeoIPCountryCSV/GeoIPCountryWhois.csv")));
			PrintStream out=new PrintStream(new FileOutputStream("country.txt"));
			long t1=System.currentTimeMillis();
			while(true)
			{
				String line=br.readLine();
				if(line==null)
					break;
				else
				{
					String country[]=line.split(",");
					countryCode=country[4];
					countryName=country[5];
					map.put(countryCode,countryName);
					//System.out.println(countryCode+" "+countryName);
					out.println(countryCode+" "+countryName);
				}
			}
			long t2=System.currentTimeMillis();
			long t=t2-t1;
			System.out.println("Successfully done in "+t+" seconds");
			for(Map.Entry<String,String> entry : map.entrySet())
			{
				//System.out.println(entry.getKey()+" "+entry.getValue());
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}}

}