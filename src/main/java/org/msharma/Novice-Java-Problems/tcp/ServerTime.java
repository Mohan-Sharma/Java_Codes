import java.io.*;
import java.net.Socket;
import java.net.*;
import java.util.*;
class ServerTime
{
public static void main(String arr[])
{
try
{
ServerSocket server=new ServerSocket(1234);
System.out.println("Server started waiting for connection...");
Socket serverSocket=server.accept();
System.out.println("Connection established.....");
PrintStream out=new PrintStream(serverSocket.getOutputStream(),true);
out.println(new Date().toString());
out.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}