package rmiPackage;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class FactIMP extends UnicastRemoteObject implements FactorialInterface {

	   public FactIMP() throws RemoteException {
	      super();
	   }

	   public int findFactorial(int number) throws RemoteException {
	      int result = 1;
	      
	      for(int i = 1; i <= number; i++) {
	         result = result * i;
	      }
	      
	      return result;
	   }
}