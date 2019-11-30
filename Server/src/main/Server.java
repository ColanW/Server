package main;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread{

	public void run() {
		
		try {
			
			ServerSocket ss = new ServerSocket(44444);
			
			while(true) {
				
				Socket s = ss.accept();
				
				InputStream is = s.getInputStream();
				OutputStream os = s.getOutputStream();
				
				int x = is.read();
				os.write(x);
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
