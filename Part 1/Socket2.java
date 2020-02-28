import java.net.*;
import java.io.*;

class Socket2
{
	public static void main(String args[]) throws Exception
	{
		DatagramSocket ds = new DatagramSocket();
		String s = "Sohil";
		InetAddress is = InetAddress.getLocalHost();
		DatagramPacket dp = new DatagramPacket(s.getBytes(), s.length(), is, 2100);
		ds.send(dp);
		ds.close();
	}
}