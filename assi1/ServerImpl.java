import java.rmi.*;
import java.rmi.server.*;

public class ServerImpl extends UnicastRemoteObject implements ServerInt{
	public ServerImpl() throws RemoteException{}

	public int addition (int num1, int num2) throws RemoteException{
		
		int result = num1+num2;
		return result;
		
	}
}
