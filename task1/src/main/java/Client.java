import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {

        final var ip = "netology.homework";
        final var port = 8089;

        try (var clientSocket = new Socket(ip, port);
             var out = new PrintWriter(clientSocket.getOutputStream(), true);
             var in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))
        ) {
            var response1 = in.readLine();
            System.out.println(response1);
            out.println("Vasya");

            var response2 = in.readLine();
            System.out.println(response2);
            out.println("no");

            var response3 = in.readLine();
            System.out.println(response3);
        }

    }
}
