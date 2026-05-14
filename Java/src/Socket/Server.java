package Socket;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    
    private Socket socket = null;
    private ServerSocket serverSocket = null;
    private DataInputStream in = null;

    public Server(int port){

        try{
            serverSocket = new ServerSocket(port);
            System.out.println("Server started");

            System.out.println("Waiting for client");
            socket = serverSocket.accept();
            System.out.println("Client accepeted");

            in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            String message = "";

            while (!message.equals("Over")) {
                try {
                    message = in.readUTF();
                    System.out.println(message);
                } catch (IOException i) {
                    System.out.println(i);
                }
            }

            // Close the connection
            socket.close();
            in.close();
        }

        catch(IOException i){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Server server = new Server(5000);
    }
}
