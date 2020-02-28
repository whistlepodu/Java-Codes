import java.rmi.*;
import java.net.*;

public class AddServer
{
	public static void main(String[] args)
	{
		try
		{
			AddServerImpl a = new AddServerImpl();
			Naming.rebind("abc",a);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}