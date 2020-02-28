import java.rmi.*;
import java.rmi.server.*;

public class AddServerImpl extends UnicastRemoteObject implements AddServerIntf
{
	AddServerImpl() throws RemoteException
	{
		super();
	}

	public long fact(int x)
	{
		long n2 = 1;
		while(x>0)
		{
			n2 = n2 * x;
			x--;
		}
		return n2;
	}
}