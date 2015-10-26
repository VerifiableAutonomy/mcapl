package eass.platooning.util;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Leader {

	public Leader(){
		ServerSocket s = null;
		Socket conn = null;
		
		try{
			s = new ServerSocket(5000, 10);
			System.out.println("Leader Server Socket created. Waiting for connection ...");
			
			while(true){
				conn = s.accept();
				System.out.println("connection recieved from"+ conn.getInetAddress().getHostName() + " : " + conn.getPort());
				new client_handler(conn).start();
			}
		}
		catch(IOException e)
        {
            System.err.println("IOException");
        }
		
	}
	
}

class client_handler extends Thread 
{
    private Socket conn;
     
    client_handler(Socket conn) 
    {
        this.conn = conn;
    }
 
    public void run() 
    {
        String line , input = "";
         
        try
        {
            //get socket writing and reading streams
            DataInputStream in = new DataInputStream(conn.getInputStream());
            PrintStream out = new PrintStream(conn.getOutputStream());
 
            //Send welcome message to client
            out.println("Welcome to the Server");
 
            //Now start reading input from client
            while((line = in.readLine()) != null && !line.equals(".")) 
            {
                //reply with the same message, adding some text
                out.println("I got : " + line);
            }
             
            //client disconnected, so close socket
            conn.close();
        } 
       
        catch (IOException e) 
        {
            System.out.println("IOException on socket : " + e);
            e.printStackTrace();
        }
    }
}