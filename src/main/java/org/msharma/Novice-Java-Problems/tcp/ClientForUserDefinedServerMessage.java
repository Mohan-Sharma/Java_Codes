import java.util.*;
import java.io.*;
import java.net.*;
import java.net.Socket;
class ClientForUserDefinedServerMessage
{
public static void main(String arr[])
{
try
{
Socket clientSocket=new Socket("localhost",1234);
System.out.println("Connected to server");
Scanner in=new Scanner(System.in);
System.out.println("Enter message to send...");
PrintStream outFromClient=new PrintStream(clientSocket.getOutputStream(),true);

BufferedReader inFromServer=new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
while(true)
{
String message=in.nextLine();
outFromClient.println(message);
String responseFromServer=inFromServer.readLine();
System.out.println("Response from server : "+responseFromServer);
clientSocket.close();
outFromClient.close();
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}