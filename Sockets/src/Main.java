import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {


        try{

            System.out.println("Waiting for clients");
            ServerSocket serverSocket = new ServerSocket(9806); //port number required
            Socket socket = serverSocket.accept(); //blocking call
            System.out.println("Connection is ready!");

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream())); //receive data
            String string = bufferedReader.readLine();
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(),true);
            System.out.println("Server: "+string);

        }catch (IOException e)
        {
            e.printStackTrace();
        }



    }
}