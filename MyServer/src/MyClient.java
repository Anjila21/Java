import java.io.*;
import java.net.*;

public class MyClient
{
    public static  void main(String[] args)
    {
        try
        {
            Socket s = new Socket("127.0.0.1",1111);
            
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hello Server");
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}