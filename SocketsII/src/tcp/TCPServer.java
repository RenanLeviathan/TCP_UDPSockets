package tcp;
import java.io.*;
import java.net.*;
import java.io.*;
import java.net.*;
public class TCPServer {
public static void main(String argv[]) throws Exception
{
String clientSentence;
String capitalizedSentence;
ServerSocket welcomeSocket = new ServerSocket(6789);
while(true) {
Socket connectionSocket = welcomeSocket.accept();
BufferedReader inFromClient =
new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
DataOutputStream outToClient =
new DataOutputStream(connectionSocket.getOutputStream());
clientSentence = inFromClient.readLine();
capitalizedSentence = "<html><head></head><body>"+ clientSentence.toUpperCase() + "</body></html>";
outToClient.writeBytes(capitalizedSentence);
}
}
}
