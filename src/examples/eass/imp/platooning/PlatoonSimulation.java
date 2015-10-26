package eass.imp.platooning;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.SocketChannel;
import java.util.Random;

import ail.util.AILSocketChannelClient;
import ail.util.AILSocketChannel;
import ajpf.util.AJPFLogger;

public class PlatoonSimulation {
	/* Base port numbers - vehicle ID will be added to these */
	private int BASE_OUTBOUND_PORT = 17000;
	private int BASE_INBOUND_PORT = 18000;

	
	public PlatoonSimulation(int id) throws IOException, InterruptedException{
	Socket si = new Socket();
	Socket so = new Socket();
	
	try{
		si.connect(new InetSocketAddress(BASE_OUTBOUND_PORT+ id));
		Thread.sleep(1000);
	} catch(UnknownHostException e){
		System.err.println("Dont find the host"+ BASE_OUTBOUND_PORT+ id);
		Thread.sleep(1000);
		si.connect(new InetSocketAddress(BASE_OUTBOUND_PORT+ id));
	}
	
	try{
		so.connect(new InetSocketAddress(BASE_INBOUND_PORT+ id));
		Thread.sleep(1000);
	} catch(UnknownHostException e){
		System.err.println("Dont find the host"+ BASE_INBOUND_PORT+ id);
		Thread.sleep(1000);
		so.connect(new InetSocketAddress(BASE_INBOUND_PORT+ id));
	}
	}



public static void main(String [] args) throws IOException, InterruptedException {
	PlatoonSimulation v1 = new PlatoonSimulation(1);
	PlatoonSimulation v2 = new PlatoonSimulation(2);
	PlatoonSimulation v3 = new PlatoonSimulation(3);

}

}