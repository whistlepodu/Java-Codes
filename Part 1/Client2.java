import java.net.*;
import java.io.*;

class Client2
{
	public static void main(String args[]) throws Exception
	{
		DatagramSocket ds = new DatagramSocket(2100);
		byte[] b = new byte[1024];
		InetAddress is = InetAddress.getLocalHost();
		DatagramPacket dp = new DatagramPacket(b, 1024);
		ds.receive(dp);
		String str = new String(dp.getData(), 0, dp.getLength());
		System.out.println(str);
		ds.close();
	}
}