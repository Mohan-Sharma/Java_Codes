class Instrument
{
public void play(String s)
{
System.out.println( s+"playing");
}
public static void tune(Instrument i)
{
i.play("Flute");
}
}
class wind extends Instrument
{
public static void main(String arr[])
{
wind flute=new wind();
Instrument.tune(flute);
}}