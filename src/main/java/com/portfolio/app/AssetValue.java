package com.portfolio.app;
public class AssetValue {
    public static void main(String[] args) {
        // Stock 1
        String stockName1 = "TCS";
        double stockPrice1 = 3500;
        int stockQuantity1 = 10;
        double stockValue1 = stockPrice1 * stockQuantity1;

        // Stock 2
        String stockName2 = "Infosys";
        double stockPrice2 = 1500;
        int stockQuantity2 = 5;
        double stockValue2 = stockPrice2 * stockQuantity2;

        // 1. Display individual asset values
        System.out.println("----- Individual Asset Values -----");
        System.out.println("Asset: " + stockName1);
        System.out.println("Value: ₹" + stockValue1);
        System.out.println();
        System.out.println("Asset: " + stockName2);
        System.out.println("Value: ₹" + stockValue2);

        // 2. Display total portfolio value
        double totalPortfolioValue = stockValue1 + stockValue2;
        System.out.println("\n----- Total Portfolio Value -----");
        System.out.println("Total Value: ₹" + totalPortfolioValue);

        // 3. Change price/NAV
        System.out.println("\n----- Changing Price/NAV -----");
        stockPrice1 = 3600; // TCS ka price badh gaya
        stockPrice2 = 1600; // Infosys ka price badh gaya
        System.out.println("Updated Price of " + stockName1 + ": ₹" + stockPrice1);
        System.out.println("Updated Price of " + stockName2 + ": ₹" + stockPrice2);

        // 4. Calculate the updated portfolio value
        double updatedStockValue1 = stockPrice1 * stockQuantity1;
        double updatedStockValue2 = stockPrice2 * stockQuantity2;
        double updatedTotalValue = updatedStockValue1 + updatedStockValue2;
        
        System.out.println("\n----- Updated Portfolio Value -----");
        System.out.println("Updated Value of " + stockName1 + ": ₹" + updatedStockValue1);
        System.out.println("Updated Value of " + stockName2 + ": ₹" + updatedStockValue2);
        System.out.println("Updated Total Portfolio Value: ₹" + updatedTotalValue);
    }
}