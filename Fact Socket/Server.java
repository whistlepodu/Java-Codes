import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

class Server
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket ss1 = new ServerSocket(800);
        	Socket s1 = ss1.accept();
        	System.out.println("Server is Ready...");
        	BufferedReader kb1 = new BufferedReader(new InputStreamReader(s1.getInputStream()));
        	String fname = kb1.readLine();
        	System.out.println("Received Number From Client : " + fname);
        	int num = Integer.parseInt(fname);
        	System.out.println("Counting Factorial ...");
        	int fact = factorial(num);       
        	System.out.println("Send Factorial Value Of Number To Client ...");
        	PrintStream dos1 = new PrintStream(s1.getOutputStream());
        	dos1.println(String.valueOf(fact));
        	s1.close();
        	ss1.close();
    	}
    	public static int factorial(int n)
	{
        	if(n==1)
            		return 1;
        	else
            		return n*factorial(n-1);
    	}
}