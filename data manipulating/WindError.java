class NoteX
{public NoteX(int val)
{
int value=val;
}
public static final NoteX a=new NoteX(1);
}
class InstrumentX
{
public void play()
{
System.out.println("InstrumentX.play()");
}
}
class WindX extends InstrumentX
{
public void play(NoteX n)
{
System.out.println("WindX.play()");
}
}
class WindError
{
//static int a=2;
public static void tune(InstrumentX i)
{
i.play();
}
public static void main(String arr[])
{
WindX x=new WindX();
tune(x);
}
}