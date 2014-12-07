package com.example.stockquote;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "TradePriceRequest")
public class TradePriceRequest {

    protected String tickerSymbol;

    /**
     * Gets the value of the tickerSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTickerSymbol() {
        return tickerSymbol;
    }

    /**
     * Sets the value of the tickerSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTickerSymbol(String value) {
        this.tickerSymbol = value;
    }

}
