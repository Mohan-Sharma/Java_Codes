import java.util.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class WeatherTest
{
public static void main(String arr[])
{
int day=0;
int maxTemp=0;
int minTemp=100;
int MaxTempDay=0;
int MinTempDay=0;
int maxT=0;
int minT=0;
try
{
BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("C:/Users/Toshiba.Toshiba-PC/Desktop/Desktop/weather.dat")));
System.out.println("\tDAY\tTEMPERATURE");
System.out.println("******************************");
while(true)
{
String line=br.readLine();
if(line==null)
break;
else
{
Matcher matcher=Pattern.compile("^[\\s]+[\\d]{1,2}[\\s]+[\\d]{2}[\\s*]+[\\d]{2}").matcher(line);
while(matcher.find())
{
String str=matcher.group().trim();
str=str.replaceAll("[\\s*]+"," ");
//System.out.println(str);
String tokens[]=str.split(" ");
//System.out.print(tokens[0]);
//System.out.print(tokens[1]);
//System.out.println(tokens[2]);
day=Integer.parseInt(tokens[0]);
maxT=Integer.parseInt(tokens[1]);
minT=Integer.parseInt(tokens[2]);
int temp=maxT-minT;
System.out.println("\t"+day+"\t"+temp);
if(maxTemp<(maxT-minT))
{
maxTemp=maxT-minT;
MaxTempDay=day;
}
if(minTemp>(maxT-minT))
{
minTemp=maxT-minT;
MinTempDay=day;
}
}
}
}
System.out.println("Maximum temperature occured on day "+MaxTempDay+" and the temperature on that day was: "+maxTemp+" Degree centigrade");
System.out.println("Minimum temperature occured on day "+MinTempDay+" and the temperature on that day was: "+minTemp+" Degree centigrade");
}
catch(Exception e)
{
System.out.println(e);
}
}
}