import java.util.*;
import java.net.*;
import java.net.Socket.*;
import java.io.*;
class ServerTest
{
public static void main(String arr[])
{
try
{
ServerSocket socket=new ServerSocket(1234);
System.out.println("Server created waiting for connection...");
Socket serversocket=socket.accept();
System.out.println("Connection established waiting for client message...");
Scanner inFromClient=new Scanner(serversocket.getInputStream());
PrintStream outFromServer=new PrintStream(serversocket.getOutputStream(),true);
String messageClient=inFromClient.nextLine();
System.out.println("Message received from client is: "+messageClient);
Scanner in=new Scanner(System.in);
System.out.println("Enter acknowledge message...");
String ack=in.nextLine();
outFromServer.println(ack);
///outFromServer.flush();
System.out.println("Closing connection...");
serversocket.close();
socket.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}