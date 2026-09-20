package com.portfolioproject.model;

public class Holding {
    public String symbol;
    public int quantity;
    public double buyPrice;

    public Holding(String symbol, int quantity, double buyPrice) {
        this.symbol = symbol;
        this.quantity = quantity;
        this.buyPrice = buyPrice;
    }
    
    public String toString() {
        return symbol + " - " + quantity + " qty @ " + buyPrice;
    }
}