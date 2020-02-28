import java.io.*;
import java.net.Socket;

class Client 
{
	public static void main(String args[]) throws Exception
	{
        	Socket s = new Socket("localhost", 800);
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        	System.out.print("Enter Number To Find Factorial : ");
        	String fname = br.readLine();
        	PrintStream dos = new PrintStream(s.getOutputStream());       
        	dos.println(fname); 
        	System.out.println("Send Number To Server...");
        	BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        	String sts = br1.readLine();
        	System.out.println("Received Factorial Value From Server....");
        	System.out.println("Factorial Of " + fname + " is : " + Integer.parseInt(sts));
        	s.close();
    	}
}