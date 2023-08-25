import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {
    public static void main(String[] args) throws Exception {
        while (true) {
            ServerSocket s = new ServerSocket(8080);
            Socket s1 = s.accept();

            DataInputStream distream = new DataInputStream(s1.getInputStream());
            String message = (String) distream.readUTF();
            System.out.println("Message from client is: " + message);
            DataOutputStream distream1 = new DataOutputStream(s1.getOutputStream());
            String str=new Scanner(System.in).nextLine();
            distream1.writeUTF(str);

            s.close();
        }

    }
}
