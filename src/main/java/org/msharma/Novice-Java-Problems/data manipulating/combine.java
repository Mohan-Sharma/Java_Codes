class Buffer
{
int value;
boolean produced=false;
synchronized public void produce(int x)
{
if(produced)
{
System.out.println("producer entered monitor out of turn waiting");
try{
wait();
}
catch(Exception e){}
}
value=x;
System.out.println(value+" is produced");
produced=true;
notify();
}
synchronized public void consume()
{
if(!produced)
{
System.out.println("consumer entered monitor out of turn");
try{
wait();
}
catch(Exception e){}
}
System.out.println(value+" is consumed");
produced=false;
notify();
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
for(int i=0;i<10;i++)
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
System.out.println("consumer started consuming values");
for(int i=0;i<10;i++)
buffer.consume();
}
}
class combine
{
public static void main(String arr[])
{
Buffer b=new Buffer();
Producer p=new Producer(b);
Consumer c=new Consumer(b);
p.start();
c.start();
}
}