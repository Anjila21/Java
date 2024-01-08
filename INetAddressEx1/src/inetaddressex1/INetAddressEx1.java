import java.net.*;

public class INetAddressEx1
{
    public static void main(String[] args) throws UnknownHostException
    {
//        InetAddress ip = InetAddress.getLocalHost();
//        System.out.println("LocalHost:"+ip);
        InetAddress ip = InetAddress.getByName("127.0.1.1");
        System.out.println("Hostname:"+ip.getHostName());
                
    }
}