import java.io.*;
import java.net.*;
public class trainserver{
public static void main(string[] args)
{
try{
ServerSocket d=new ServerSocket(1234);  // creating a socket
Socket server=d.accept();
DataInputStream sin= new DataInputStream(server.getInputStream());
String str=(String)sin.readUTF();
System.out.println(str);
DataOutputStream sout=new DataOutputStream(server.getOutputStream());
tout.writeUTF("Have a great day");
tout.close();
server.close();
}catch(Exception e)
}
}

