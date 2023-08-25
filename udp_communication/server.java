package udp_communication;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class server {
    public static void main(String[] args) throws IOException {
        InetAddress ip=InetAddress.getLocalHost();
        DatagramSocket ds = new DatagramSocket(3000,ip);
        byte[] recievemessage = new byte[1024];
        DatagramPacket dp = null;
        while(true)
        {
            dp=new DatagramPacket(recievemessage,recievemessage.length);
            ((DatagramSocket) ds).receive(dp);

            System.out.println("client message :"+new String(recievemessage));
            if(new String(recievemessage).trim().equals("exit"))
            {
                System.out.println("client message :"+new String(recievemessage));
                break;
            }
            recievemessage=new byte[600000];
            


        }
        
    }
    
}
