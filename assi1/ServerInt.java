import java.rmi.*;

interface ServerInt extends Remote{

	public int addition (int num1, int num2) throws RemoteException;
	
}
