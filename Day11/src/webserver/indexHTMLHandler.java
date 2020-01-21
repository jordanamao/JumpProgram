package webserver;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;


class indexHTMLHandler implements HttpHandler {

	@Override
	public void handle(HttpExchange exchange)throws IOException{

		byte[] response = "Welcome to My Index Page!".getBytes();
		exchange.sendResponseHeaders(200, response.length);
		OutputStream os = exchange.getResponseBody();

		os.write(response);
		os.close();
	}

}


