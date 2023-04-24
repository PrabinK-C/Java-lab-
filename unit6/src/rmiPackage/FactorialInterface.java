package rmiPackage;


import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FactorialInterface extends Remote {
   public int findFactorial(int number) throws RemoteException;
}
