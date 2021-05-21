import java.rmi.*;

public class ClientRMI
{
	 public static void main (String args[])
	 {
		 try
		 {
			 RMI obj=(RMI)
			 Naming.lookup("//localhost/My_Server");
			 int num=obj.AddCube(4,5);
			 System.out.println("The Value is : "+num);
		 }
		 catch (Exception e)
		 	 {
		 		 System.out.println(e);
	 		}
 	}
}