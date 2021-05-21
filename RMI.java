import java.rmi.*;

public interface RMI extends Remote
{
	int AddCube(int x,int y) throws RemoteException;
}