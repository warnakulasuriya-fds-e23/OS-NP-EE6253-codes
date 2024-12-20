package MessageApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerChat {
	static int port = 9999;

	public static void main(String[] args) throws IOException {
		
		System.out.println("\t\t Simple Server");
		System.out.println("\t\t ============");
		
		ServerSocket serversocket = new ServerSocket(port);
		Scanner scannerInput = new Scanner(System.in);
		String input,output;
		
		try {
			while(true) {
				Socket socket = serversocket.accept();
				System.out.println("Client is connected... \n\n");
				
				
				BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
				try {
					out.println("Welcome to socket chats");
					
					while(true) {
						input = in.readLine() ;
						System.out.println("Client Says: "+input);
						
						if(input=="EXIT") {
							out.println("Ending Chat");
							System.out.println("Ended Chat session on Server");
							break;
						}
						
						System.out.println("Enter Reply to Client: ");
						output = scannerInput.nextLine();
						out.println(output);
					}
					
				} finally {
					socket.close();
					out.close();
					in.close();
				}
				

			}
		} finally {
			serversocket.close();
		}
		
	}

}
