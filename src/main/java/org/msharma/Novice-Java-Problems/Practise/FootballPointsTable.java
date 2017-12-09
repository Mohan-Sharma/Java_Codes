import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class FootballPointsTable
{
public static void main(String arr[])
{
String teamName="";
int gScored=0;
int gConceded=0;
int maxGoalScored=0;
int minGoalScored=0;
String maxTeam="";
String minTeam="";
int score=0;
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
Matcher team=Pattern.compile("[\\d]+.\\s[aA-zZ]+").matcher(line);
Matcher goalScored=Pattern.compile("\\d[0-9]\\s+-").matcher(line);
Matcher goalConceded=Pattern.compile("-\\s+\\d[0-9]").matcher(line);
//System.out.println(goalScored);
while(team.find())
{
teamName=team.group().trim();
System.out.println(teamName);
}
while(goalScored.find())
{
gScored=Integer.parseInt(goalScored.group().replace("-","").trim());
//System.out.print(gScored+" ");
}
while(goalConceded.find())
{
gConceded=Integer.parseInt(goalConceded.group().replace("-","").trim());
//System.out.println(gConceded);
}
score=gScored-gConceded;
if(maxGoalScored<(gScored-gConceded))
{
maxGoalScored=gScored-gConceded;
maxTeam=teamName;
}
if(maxGoalScored>(gScored-gConceded))
{
minGoalScored=gScored-gConceded;
minTeam=teamName;
}
}
//System.out.println(teamName+"\t"+score);
//System.out.println(score);
}
System.out.println("Max Goals scored by :"+maxTeam);
System.out.println("Max Goals:"+maxGoalScored);
System.out.println("Min Goals scored by :"+minTeam);
System.out.println("Min Goals:"+minGoalScored);
}
catch(Exception e)
{
System.out.println(e);
}
}
}