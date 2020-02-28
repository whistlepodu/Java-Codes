import java.rmi.*;
import java.util.Scanner;

public class AddClient
{
	public static void main(String[] args)
	{
		try
		{
			String addServUrl = "rmi://localhost/abc";
			AddServerIntf asi = (AddServerIntf)Naming.lookup(addServUrl);
			Scanner in = new Scanner(System.in);
			System.out.println("Enter Number:");
			int n1 = in.nextInt();
			System.out.println("Factorial of " + n1 + ": " + asi.fact(n1));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}