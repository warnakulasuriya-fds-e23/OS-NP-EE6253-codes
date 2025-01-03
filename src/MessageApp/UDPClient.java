package MessageApp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
	static int port = 4412;
	public static void main(String[] args) throws IOException {
		DatagramSocket client = new DatagramSocket();
		InetAddress ipAddress = InetAddress.getLocalHost();
		
		String str = "Hello World";
		byte[] buf = str.getBytes();
		
		DatagramPacket pac = new DatagramPacket(buf, buf.length, ipAddress, port);
		client.send(pac);
		
		client.close();
		
	}
}
