package com.socket.chating;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class SocketServer {
	/*public static void main(String[] args) throws IOException
	{
		ServerSocket listen = new ServerSocket(1021);
		try
		{
				Socket socket = listen.accept();
				DataInputStream ir= new DataInputStream(socket.getInputStream());
				//BufferedReader br = new BufferedReader(ir);
				@SuppressWarnings("deprecation")
				String message= ir.readLine();
				if(message == null)
				{
					PrintStream pr = new PrintStream(socket.getOutputStream());
					pr.println("Message Received");
				}
			}
		catch(Exception e)
		{
			System.out.println("err");
		}
		finally
		{
			listen.close();
		}
	}
*/
		
		public static void main(String[] args) throws IOException {
	        ServerSocket listener = new ServerSocket(9090);
	        try {
	            while (true) {
	                Socket socket = listener.accept();
	                try {
	                    /*PrintWriter out =
	                        new PrintWriter(socket.getOutputStream(), true);
	                    out.println(new Date().toString());*/
	                	
	                	BufferedReader input =
	            	            new BufferedReader(new InputStreamReader(socket.getInputStream()));
	            	        String answer = input.readLine();
	            	        System.out.println(answer);
	            	        
	            	        PrintWriter out =
	    	                        new PrintWriter(socket.getOutputStream(), true);
	            	        out.println("received");
	                } finally {
	                    socket.close();
	                }
	            }
	        }
	        finally {
	            listener.close();
	        }
	    }
}
