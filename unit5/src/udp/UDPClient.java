package udp;

import java.io.*;
import java.net.*;

public class UDPClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        InetAddress address = InetAddress.getByName("localhost");

        // Convert the message to bytes and create a datagram packet
        String message = "16";
        byte[] buffer = message.getBytes();
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, 1236);

        // Send the packet to the server
        socket.send(packet);

        // Receive a response from the server
        buffer = new byte[1024];
        packet = new DatagramPacket(buffer, buffer.length);
        socket.receive(packet);
        String response = new String(packet.getData(), 0, packet.getLength());
        System.out.println("Square root of 16 is: " + response);

        // Clean up
        socket.close();
    }
}
