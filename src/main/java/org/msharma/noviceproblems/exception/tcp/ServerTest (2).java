import java.net.*;
import java.io.*;
import java.net.Socket;
class ServerTest
{
public static void main(String arr[])
{
String messageFromClient;
String responseFromServer;
try
{
ServerSocket server=new ServerSocket(1234);
System.out.println("Server Started waiting for connection...");
Socket serverSocket=server.accept();
System.out.println("Connection established waiting for message from client....");
BufferedReader inFromClient=new BufferedReader(new InputStreamReader(serverSocket.getInputStream()));
PrintStream outFromServer=new PrintStream(serverSocket.getOutputStream(),true);
messageFromClient=inFromClient.readLine();
System.out.println("Message received from client is: "+messageFromClient);
responseFromServer=messageFromClient + " 'is received from client'"+" 'server changed it to' "+messageFromClient.toUpperCase();
outFromServer.println(responseFromServer);
//outFromServer.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}