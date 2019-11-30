package main;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client extends Thread{

	public void run() {
		
		Socket s;
		try {
			s = new Socket("localhost", 44444);
	
			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();
			
			os.write(1);
			
			System.out.println(is.read());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
