package server;

import javax.xml.ws.Endpoint;

import com.example.stockquote.StockQuote;

public class WSPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9987/stockquote/",
				new StockQuote());
	}
}
