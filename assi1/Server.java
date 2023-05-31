import java.rmi.*;

public class Server{
	public static void main (String[] args){
	
		try{
			ServerImpl si = new ServerImpl();
			Naming.rebind("Server", si);
			
			System.out.println("Server is started...");
		}
		
		catch(Exception e){
			System.out.println("Error "+e.getMessage());
		}
	}
}
