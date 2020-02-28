import java.rmi.*;
import java.rmi.server.*;

public class AddServerImpl extends UnicastRemoteObject implements AddServerIntf
{
	AddServerImpl() throws RemoteException
	{
		super();
	}

	public double add(double x, double y)
	{
		return x + y;
	}
}