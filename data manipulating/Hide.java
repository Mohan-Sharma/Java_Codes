class Homer {
char doh(char c) {
System.out.println("doh1(char)");
return c;
}
float doh(float f) {
System.out.println("doh2(float)");
return 1.0f;
}
}
class Milhouse {}
class Bart extends Homer {
void doh(Milhouse m) {}
}
class Hide {
public static void main(String[] args) {
Bart b = new Bart();
 // doh(float) used
System.out.println(b.doh(1));

System.out.println(b.doh('x'));
System.out.println(b.doh(1.0f));
b.doh(new Milhouse());
}
}