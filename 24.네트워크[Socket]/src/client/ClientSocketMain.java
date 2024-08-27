package client;

import java.net.InetAddress;
import java.net.Socket;

public class ClientSocketMain {

	public static void main(String[] args) throws Exception{
		
		Socket socket=new Socket("192.168.15.31", 3333);
		System.out.println(">>client 쪽 socket:"+socket);
		System.out.println("************Client쪽 Socket정보************");
		InetAddress remoteAddress = socket.getInetAddress();
		int remotePort=socket.getPort();
		InetAddress localAddress = socket.getLocalAddress();
		int localPort=socket.getLocalPort();
		System.out.println("remote ip  :"+remoteAddress.getHostAddress());
		System.out.println("remote port:"+remotePort);
		System.out.println("local  ip  :"+localAddress.getHostAddress());
		System.out.println("local  port:"+localPort);
		System.out.println("******************************************");

		
		
		

	}

}