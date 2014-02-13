class NoteX
{
private int value;
public static final int a=0,b=1,c=2;
private NoteX(int val)
{
value=val;
}
public static final NoteX
x=new NoteX(0),
y=new NoteX(1),
z=new NoteX(2);

}
class InstrumentX
{
public void play(int q)
{
System.out.println("Instrumentx.paly()");
}

}
class Windx extends InstrumentX
{
public void play(NoteX n)
{
System.out.println("Windx.play()");
}
}
class OverridingError
{
public static void tune(InstrumentX i)
{
i.play(NoteX.a);
}
public static void main(String arr[])
{
Windx flute=new Windx();
tune(flute);
}
}