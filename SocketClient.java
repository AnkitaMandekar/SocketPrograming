package com.socket.chating;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

public class SocketClient {
	
	/*public static void main(String[] args) throws UnknownHostException, IOException
	{
		String serverAddress = JOptionPane.showInputDialog(
	            "Enter IP Address of a machine that is\n" +
	            "running the date service on port 1001:");
		try
		{
		@SuppressWarnings("resource")
		Socket s = new Socket("localhost",1021);
		//System.out.println("test");
		PrintStream pr = new PrintStream(s.getOutputStream());
		pr.println("Hi from client");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String ans= br.readLine();
		System.out.println(ans);
		}
		catch(Exception e)
		{
			System.out.println("err22");
		}
		
		JOptionPane.showMessageDialog(null,ans);
		System.exit(0);
	}
*/
		public static void main(String[] args) throws IOException {
	        /*
	        Socket s = new Socket(serverAddress, 9090);
	        BufferedReader input =
	            new BufferedReader(new InputStreamReader(s.getInputStream()));
	        String answer = input.readLine();
	        JOptionPane.showMessageDialog(null, answer);
	        System.exit(0);*/
			Socket socket = new Socket("localhost", 9090);
			PrintWriter out =
                    new PrintWriter(socket.getOutputStream(), true);
			String serverAddress = JOptionPane.showInputDialog(
		            "Enter IP Address of a machine that is\n" +
		            "running the date service on port 9090:");
			out.println("test");
			
			BufferedReader input =
		            new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String answer = input.readLine();
			 JOptionPane.showMessageDialog(null, answer);
			
	    }
}
