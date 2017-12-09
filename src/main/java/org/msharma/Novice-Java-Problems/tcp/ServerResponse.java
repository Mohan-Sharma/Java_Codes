import java.io.*;
import java.net.*;
import java.net.Socket;
import java.util.*;
class ServerResponse
{
public static void main(String arr[])
{
try
{
ServerSocket server =new ServerSocket(1234);
System.out.println("Server created waiting for connection......");
Socket socket=server.accept();
System.out.println("Connection established and for client response....");
BufferedReader inFromClient=new BufferedReader(new InputStreamReader(socket.getInputStream()));
PrintStream outFromServer=new PrintStream(socket.getOutputStream(),true);
Scanner in=new Scanner(System.in);
String messageFromClient=inFromClient.readLine();
while(messageFromClient!=null)
{
System.out.println("Message received from client :"+messageFromClient+" enter your response.....");
String responseFromServer=in.nextLine();
outFromServer.println(responseFromServer);
socket.close();
outFromServer.close();
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}