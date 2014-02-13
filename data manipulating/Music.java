class Note
{
private int value;
private Note(int val)
{
value=val;
}
//public static final Note a=new Note(0),b=new Note(1),c=new Note(2);

}
class instrument
{
public void play()
{
System.out.println("Instrument.play()");
}
}
class wind extends instrument
{
public static void tune(instrument i)
{
i.play();
}
//public void play()
//{
//System.out.println("Wind.play()");
//}
}
public class Music
{
public static void main(String arr[])
{
wind flute=new wind();
wind.tune(flute);
}
}