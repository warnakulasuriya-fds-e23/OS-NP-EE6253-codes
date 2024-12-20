package MessageApp;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
	static int port = 9999;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("\t\t Simple Server");
		System.out.println("\t\t ============");
		
		ServerSocket serversocket = new ServerSocket(port);
		try {
			while(true) {
				Socket socket = serversocket.accept();
				System.out.println("Client is connected... \n\n");
				try {

					PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
					out.println("Welcome to socket programming");
				} finally {
					socket.close();
				}
				

			}
		} finally {
			serversocket.close();
		}
		
	}

}
