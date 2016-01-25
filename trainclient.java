import java.io.*;
import java.net.*;

public class trainclient{

    public static void main(string[] args) {

        try{

            Socket server = new Socket(“training”,1234);

            DataInputStream cin= new DataInputStream(server.getInputStream());

            String str=(String)cin.readUTF();

            System.out.println(str);

            DataOutputStream cout=new DataOutputStream(server.getOutputStream());

            cout.writeUTF("Good Morning");

            cout.close();

            server.close();

        }catch(Exception e){
            System.out.println(e);
        }

    }

}
