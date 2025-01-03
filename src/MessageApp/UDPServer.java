package MessageApp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
	static int port = 4412;
	
	public static void main(String[] args) throws IOException {
		DatagramSocket server = new DatagramSocket(port);
		byte[] buf = new byte[256];
		
		DatagramPacket packet = new DatagramPacket(buf,buf.length);
		server.receive(packet);
		
		String response = new String(packet.getData());
		
		System.out.print("Received Data: " + response);
		
		server.close();
	}
}
