import java.net.*;
import java.io.*;

class Socket1
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket ss = new ServerSocket(2000);
		System.out.println("Server Start");
		Socket s = ss.accept();
		DataInputStream dis = new DataInputStream(s.getInputStream());
		String str = dis.readUTF();
		int cc = ccount(str);
		System.out.println(cc);
		ss.close();
	}

	public static int ccount(String str)
	{
		int c=0;
		for(int i=0;i<str.length();i++)
			c++;

		return c;
	}
}