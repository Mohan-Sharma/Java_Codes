import java.net.*;
import java.io.*;
import java.net.Socket;
class ClientDemo
{
public static void main(String arr[])
{
try{
Socket clientSocket=new Socket("localhost",1234);
BufferedReader inFromUser=new BufferedReader(new InputStreamReader(System.in));
PrintStream outToServer=new PrintStream(clientSocket.getOutputStream(),true);
BufferedReader inFromServer=new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
System.out.println("Please enter the message to send....");
String messageFromUser=inFromUser.readLine();
System.out.println("Sending the message to server...");
outToServer.println(messageFromUser);
String responseFromServer=inFromServer.readLine();
System.out.println("Response received from server is :"+responseFromServer);
clientSocket.close();
outToServer.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}