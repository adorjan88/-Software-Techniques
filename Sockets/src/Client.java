import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {

    try{
        Socket socket = new Socket("localhost",9806);
        System.out.println("Client started");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter something");
        String string = bufferedReader.readLine();
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream(),true); //sending data
        System.out.println(string);
        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println(bufferedReader1.readLine());

    }catch (IOException e){
        e.printStackTrace();
        }


    }
}
