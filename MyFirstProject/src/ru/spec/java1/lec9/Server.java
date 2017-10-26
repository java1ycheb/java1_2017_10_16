package ru.spec.java1.lec9;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	static int count;
	
	public static void main(String[] args) throws IOException {
		String HttpOk = "HTTP/1.1 200 ok\r\n";
		String ContentType = "";
		String ContentLength = "";
		
		ServerSocket ss = new ServerSocket(80);
		
		for(;;) {
			Socket socket= ss.accept();
			InputStream is = socket.getInputStream();
			Scanner scanner= new Scanner(is);
			
			for(;scanner.hasNextLine();) {
				String line = scanner.nextLine();
				System.out.println(line);
				if (line.trim().isEmpty()) {
					break;
				}
			}
			OutputStream os = socket.getOutputStream();
		}
		
		// System.out.println("END");
	}

}
