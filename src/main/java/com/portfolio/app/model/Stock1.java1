package com.portfolio.app.model;

public class Stock1 extends Asset {

    private double currentPrice;

    // Constructor
    public Stock1(String AssetId,
                 String assetName,
                 double purchasePrice,
                 double currentPrice) {

        super(AssetId, assetName, purchasePrice);

        this.currentPrice = currentPrice;
    }

    // Method overriding
    @Override
    public double calculateCurrentValue() {

        return currentPrice;
    }

    // Getter
    public double getCurrentPrice() {
        return currentPrice;
    }

    // Setter
    public void setCurrentPrice(double currentPrice) {

        this.currentPrice = currentPrice;
    }

    @Override
    public String toString() {

        return "Stock{" +
                "Asset ID='" + getAssetid() + '\'' +
                ", Asset Name='" + getAsssetName() + '\'' +
                ", Purchase Price=" + getPurchasePrice() +
                ", Current Price=" + currentPrice +
                '}';
    }
}