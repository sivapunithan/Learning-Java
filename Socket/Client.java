package Socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    
    private Socket socket = null;
    private DataInputStream in = null;
    private DataOutputStream out = null;

    public Client(String address, int port){

        try {
            socket = new Socket(address, port);
            System.out.println("Connected");
            in = new DataInputStream(System.in);

            out = new DataOutputStream(socket.getOutputStream());
        } catch (UnknownHostException u) {
           System.out.println(u);
           return;
        } catch(IOException i){
            System.out.println(i);
            return;
        }

        String message = "";

        while (!message.equals("Over")) {
            try {
                message = in.readLine();
                out.writeUTF(message);
            } catch (IOException e) {
                System.out.println(e);
            }
        }

        try {
            in.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        Client clinet = new Client("127.0.0.1", 5000);
    }
}
