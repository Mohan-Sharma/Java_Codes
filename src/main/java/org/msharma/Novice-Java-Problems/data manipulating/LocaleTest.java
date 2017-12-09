import java.util.*;
class LocaleTest
{
public static void main(String arr[])
{
Locale locale[]=Locale.getAvailableLocales();
for(int i=1;i<locale.length;i++)
{
System.out.println(locale[i].getDisplayName());
}
}
}