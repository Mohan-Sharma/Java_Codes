package org.msharma.noviceproblems.Practise;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FootballScoreTable
{
	public static void main(String arr[])
	{
		String teamName="";
		int gScored=0;
		int gConceded=0;
		int maxGoalScored=0;
		int minGoalScored=0;
		Map<String,Integer> map=new HashMap<>();
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("C:/Users/Toshiba.Toshiba-PC/Desktop/Desktop/football.dat")));
			while(true)
			{
				String line=br.readLine();
				if(line==null)
					break;
				else
				{
					Matcher team= Pattern.compile("[\\d]+.\\s[aA-zZ]+").matcher(line);
					Matcher goalScored=Pattern.compile("\\d[0-9]\\s+-").matcher(line);
					Matcher goalConceded=Pattern.compile("-\\s+\\d[0-9]").matcher(line);
					while(team.find())
					{
						teamName=team.group().trim();
					}
					while(goalScored.find())
					{
						gScored=Integer.parseInt(goalScored.group().replace("-","").trim());
					}
					while(goalConceded.find())
					{
						gConceded=Integer.parseInt(goalConceded.group().replace("-","").trim());
					}
					Football f=new Football(gScored,gConceded);
					int fscore=f.score();
					map.put(teamName,fscore);
				}
			}
			Map.Entry<String,Integer> mapMaxValue=null;
			Map.Entry<String,Integer> mapMinValue=null;
			for(Map.Entry<String,Integer>entry:map.entrySet())
			{
				//System.out.println(entry.getKey()+" "+entry.getValue());
				if(mapMaxValue == null || mapMaxValue.getValue()<entry.getValue())
				{
					mapMaxValue=entry;
				}
				if(mapMinValue == null || mapMinValue.getValue()>entry.getValue())
				{
					mapMinValue=entry;
				}
			}
			System.out.println("Max Goals scored by : "+mapMaxValue.getKey()+"\nMax Goals : "+mapMaxValue.getValue());
			System.out.println("Min Goals scored by : "+mapMinValue.getKey()+"\nMix Goals : "+mapMinValue.getValue());
		}
		catch(Exception e)
		{}
	}
}
class Football
{
	int x,y;
	public Football(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public int score()
	{
		return x-y;
	}
}