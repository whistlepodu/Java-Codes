import java.rmi.*;

public interface AddServerIntf extends Remote	
{
	long fact(int x) throws RemoteException;
}