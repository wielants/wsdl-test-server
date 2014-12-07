package com.example.stockquote;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class StockQuote {

	@WebMethod
	public TradePrice getLastTradePrice (TradePriceRequest request)
	{
		TradePrice result = new TradePrice();
		result.setPrice(232.6f);
		return result;
	}
}
