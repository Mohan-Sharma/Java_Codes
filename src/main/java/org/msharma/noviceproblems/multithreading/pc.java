class Buffer
{
int value;
synchronized public void produce(int x)
{
value=x;
System.out.println(value+" is Produced");
}
synchronized public void consume()
{
System.out.println(value+" is consumed");
}
}
class Producer extends Thread
{
Buffer buffer;
public Producer(Buffer b)
{
buffer=b;
}
public void run()
{
System.out.println("Producer started producing values");
for(int i=1;i<10;i++)
buffer.produce(i);
}
}
class Consumer extends Thread
{
Buffer buffer;
public Consumer(Buffer b)
{
buffer=b;
}
public void run()
{
System.out.println("Consumer started consuming values");
for(int i=1;i<10;i++)
buffer.consume();
}
}
class pc
{
public static void main(String arr[])
{
Buffer b=new Buffer();
Producer p=new Producer(b);
Consumer c=new Consumer(b);
c.start();
p.start();
}
}