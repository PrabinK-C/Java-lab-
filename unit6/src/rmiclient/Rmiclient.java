package rmiclient;


import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import rmiPackage.FactorialInterface;

public class Rmiclient {

   private Rmiclient() {}

   public static void main(String[] args) {
      try {
         // Get the registry
         Registry registry = LocateRegistry.getRegistry(null);

         // Look up the remote object
         FactorialInterface stub = (FactorialInterface) registry.lookup("Factorial");

         // Call the remote method
         int number = 5;
         int result = stub.findFactorial(number);

         System.out.println("Factorial of " + number + " is " + result);
      } catch (Exception e) {
         System.err.println("Client exception: " + e.toString());
         e.printStackTrace();
      }
   }
}
