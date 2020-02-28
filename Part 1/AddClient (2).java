import java.rmi.*;

public class AddClient
{
	public static void main(String[] args)
	{
		try
		{
			String addServUrl = "rmi://localhost/abc";
			AddServerIntf asi = (AddServerIntf)Naming.lookup(addServUrl);
			System.out.println(asi.add(2.2,3.3));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}