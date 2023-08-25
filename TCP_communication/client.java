import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client{
    public static void main(String[] args) throws Exception {

        while(true){
            Socket s=new Socket("localhost",8080);
            DataOutputStream distream=new DataOutputStream(s.getOutputStream());
            distream.writeUTF(new Scanner(System.in).nextLine());
            DataInputStream distream1=new DataInputStream(s.getInputStream());
            String message=(String)distream1.readUTF();
            System.out.println("Message from server is: "+message);
            s.close();
        }

    }
}