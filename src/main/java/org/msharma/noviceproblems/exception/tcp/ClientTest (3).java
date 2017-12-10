import java.util.*;
import java.net.*;
import java.net.Socket;
import java.io.*;
class ClientTest
{
public static void main(String arr[])
{
try
{
Socket clientSocket=new Socket("localhost",1234);
System.out.println("Creating connection ,connection established....");
Scanner in=new Scanner(System.in);
System.out.println("Enter the message to send...");
String message=in.nextLine();
PrintStream outFromClient=new PrintStream(clientSocket.getOutputStream(),true);
BufferedReader inFromServer=new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
String messageServer=inFromServer.readLine();
outFromClient.println(message);
//outFromClient.flush();
System.out.println("Message received from server :"+messageServer);
System.out.println("Closing connection");
clientSocket.close();
outFromClient.close();
}
catch(Exception e)
{}
}                                                       
}