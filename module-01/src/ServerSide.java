import java.io.IOException;
import java.net.ServerSocket;

public class ServerSide {
    public static void main(String[] args) throws IOException {
        final int PORT = 8000;
        ServerSocket serverSocket = new ServerSocket(PORT);
        System.out.println("Server is up and running on port:" +PORT);
    }
}
