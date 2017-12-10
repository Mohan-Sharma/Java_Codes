import java.io.*;
import java.net.Socket;
import java.net.*;
import java.util.*;
import javax.swing.*;
class ClientTimeDemo
{
public static void main(String arr[])
{
try
{
Socket clientSocket=new Socket("localhost",1234);
BufferedReader in=new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
PrintStream out=new PrintStream(clientSocket.getOutputStream());
String date=in.readLine();
System.out.println(date);
JOptionPane.showMessageDialog(null, date);
out.close();
}
catch(Exception e)
{}
}
}