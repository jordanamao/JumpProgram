package webserver;

import java.io.IOException;
import java.net.InetSocketAddress;
import com.sun.net.httpserver.HttpServer;



public class Main {

		public static void main (String[] args) throws IOException{

			HttpServer server = HttpServer.create(new InetSocketAddress(8000),0);
			server.createContext("/index.html", new indexHTMLHandler());
			System.out.println("starting Server!");

			server.start();

	}

}
