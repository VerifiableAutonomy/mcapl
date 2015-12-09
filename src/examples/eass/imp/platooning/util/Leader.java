package eass.imp.platooning.util;

import ail.util.AILSocketServer;


public class Leader {

	private int LEADER_PORT = 5555;
	private int vehicle_number;
	private AILSocketServer connection;
	
	public Leader(){
		int i = 1;
			System.out.print("Leader waiting for connection on port " + (LEADER_PORT) + "... ");
			connection = new AILSocketServer(LEADER_PORT);
			System.out.print("Connected.... ");
	}
	
	public void sendMessage(String reciever, String message){
		connection.writeUTF(message);
	}
	
	public String getMessage(){
		String message = connection.readLine();
		return message;
	}
}