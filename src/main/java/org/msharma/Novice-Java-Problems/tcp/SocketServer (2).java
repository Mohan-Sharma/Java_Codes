import java.net.*;
import java.io.*;
import java.net.Socket;
class SocketServer
{
public static void main(String arr[])
{
try{
String clientMessage;
String serverResponse;
ServerSocket server=new ServerSocket(1234);
while(true)
{
Socket socket=server.accept();
BufferedReader inFromClient=new BufferedReader(new InputStreamReader(socket.getInputStream()));
PrintStream outToClient=new PrintStream(socket.getOutputStream(),true);
clientMessage=inFromClient.readLine();
System.out.println("Message from client: "+clientMessage);
serverResponse=clientMessage.toUpperCase();
outToClient.println(serverResponse);
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}