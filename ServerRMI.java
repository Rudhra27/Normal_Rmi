import java.rmi.*;
import java.rmi.server.*;
public class ServerRMI extends UnicastRemoteObject implements RMI
{
	public ServerRMI() throws RemoteException
	    {
	        super();
         }
     public int AddCube(int x,int y) throws RemoteException {return (x*x*x)+(y*y*y);}

 public static void main (String args[])
 {
	 try
	 {
		 ServerRMI RemoteServer= new ServerRMI();
		 Naming.rebind("My_Server",RemoteServer);
		 System.out.println("System is Ready!!!");
	 }
	 catch (Exception e)
	 {
		 System.out.println(e);
	 }
 }
}
