
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
public class IPAddressAndMACAddress {
        public static void main(String[] args) {
        try {
            // Get the IP address
            InetAddress ipAddress = InetAddress.getLocalHost();
            System.out.println("IP Address: " + (String)ipAddress.getHostAddress());
            String d=(String)ipAddress.getHostAddress();
            d=d.replace("174","254");
            System.out.println("gateway :"+d);

            // Get the MAC address
            NetworkInterface networkInterface = NetworkInterface.getByInetAddress(ipAddress);
            byte[] macBytes = networkInterface.getHardwareAddress();
            StringBuilder macAddress = new StringBuilder();
            for (int i = 0; i < macBytes.length; i++) {
                macAddress.append(String.format("%02X", macBytes[i]));
                if (i < macBytes.length - 1) {
                    macAddress.append(":");
                }
            }
            System.out.println("MAC Address: " + macAddress.toString());
        } catch (UnknownHostException | SocketException e) {
            e.printStackTrace();
        }
    }
    
}

