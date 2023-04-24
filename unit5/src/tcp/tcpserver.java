/*package tcp;
import java.io.*;
import java.net.*;

public class tcpserver {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(1235);
        System.out.println("Server listening on port 1235");

        while (true) {
            Socket socket = serverSocket.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Receive a message from the client
            String message = in.readLine();
            System.out.println("Received message: " + message);

            // Calculate the square root of the message
            double number = Double.parseDouble(message);
            double squareRoot = Math.sqrt(number);

            // Send the square root back to the client
            out.println(squareRoot);

            // Clean up
            in.close();
            out.close();
            socket.close();
        }
    }
}
*/