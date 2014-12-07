package com.example.stockquote;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "TradePrice")
public class TradePrice {

    protected float price;

    /**
     * Gets the value of the price property.
     * 
     */
    public float getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(float value) {
        this.price = value;
    }
}
