package udp;


import java.io.*;
import java.net.*;

public class UDPServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(1236);
        System.out.println("Server listening on port 1236");

        while (true) {
            // Receive a packet from the client
            byte[] buffer = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            socket.receive(packet);
            String message = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Received message: " + message);

            // Calculate the square root of the message
            double number = Double.parseDouble(message);
            double squareRoot = Math.sqrt(number);
            String response = Double.toString(squareRoot);

            // Send the square root back to the client
            buffer = response.getBytes();
            packet = new DatagramPacket(buffer, buffer.length, packet.getAddress(), packet.getPort());
            socket.send(packet);
        }
    }
}