package udp_communication;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class client {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        DatagramSocket ds = new DatagramSocket();
        byte[] sendmessage = new byte[1024];
        byte[] recievemessage = new byte[1024];
        DatagramPacket dp = null;
        while(true)
        {
            System.out.println("enter message :");
            String str=sc.nextLine();
            sendmessage=str.getBytes();
            dp=new DatagramPacket(sendmessage,sendmessage.length,InetAddress.getLocalHost(),3000);
            ds.send(dp);
            if(str.equals("exit"))
            {
                System.out.println("client message :"+new String(recievemessage));
                break;
            }
            recievemessage=new byte[600000];
        }
    }
}
