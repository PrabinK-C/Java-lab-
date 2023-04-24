/*package tcp;

import java.io.*;
import java.net.*;

public class tcpclient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 1235);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        // Send a message to the server
        out.println("16");

        // Receive a response from the server
        String response = in.readLine();
        System.out.println("Square root of 4 is: " + response);

        // Clean up
        in.close();
        out.close();
        socket.close();
    }
}
*/