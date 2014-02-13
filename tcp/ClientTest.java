import java.net.*;
import java.io.*;
import java.net.Socket;
class ClientTest
{
public static void main(String arr[])
{
String messageFromClient;
String responseFromServer;
try{
Socket socketClient=new Socket("localhost",1234);
BufferedReader inFromUser=new BufferedReader(new InputStreamReader(System.in));
PrintStream outToserver=new PrintStream(socketClient.getOutputStream(),true);
BufferedReader inFromServer=new BufferedReader(new InputStreamReader(socketClient.getInputStream()));
messageFromClient=inFromUser.readLine();
outToserver.println(messageFromClient);
responseFromServer=inFromServer.readLine();
System.out.println("From server :"+responseFromServer);
socketClient.close();
outToserver.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}