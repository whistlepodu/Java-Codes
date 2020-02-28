import java.net.*;
import java.io.*;
import java.util.*;

class Client1
{
	public static void main(String[] args) throws Exception
	{
		Scanner in = new Scanner(System.in);
		Socket s = new Socket("localhost",2000);
		OutputStream os = s.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		System.out.println("Enter Name: ");
		String ss = in.nextLine();
		dos.writeUTF(ss);
	}
}