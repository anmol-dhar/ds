import java.rmi.*;
import java.util.Scanner;

public class Client{
	public static void main (String[] args){
	
	Scanner sc = new Scanner(System.in);
	
		try{
			
			String URL = "rmi://localhost/Server";
			ServerInt s = (ServerInt) Naming.lookup(URL);
			
			System.out.println("Enter number 1 : ");
			int num1 = sc.nextInt();
			
			System.out.println("Enter number 2 : ");
			int num2 = sc.nextInt();
			
			System.out.println("the result is : "+s.addition(num1, num2));
		}
		
		catch(Exception e){
			System.out.println("error "+e.getMessage());
		}
	}
}
