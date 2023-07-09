import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {

        final var ip = "localhost";
        final var port = 8089;

        final var message = "Vasya";

        try (var clientSocket = new Socket(ip, port);
             var out = new PrintWriter(clientSocket.getOutputStream(), true);
             var in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))
        ) {
            out.println(message);
            var response = in.readLine();
            System.out.println(response);
        }

    }
}
