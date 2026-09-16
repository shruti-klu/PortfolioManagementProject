package com.portfolio.app.model;

public abstract class Asset1 {
	private String assetid;
	private String assetName;
	protected double purchasePrice;
	
	//constructor
	public Asset1(String assetid,String assetName,double purchasePrice) {
		
		this.assetid = assetid;
		this.assetName=assetName;
		this.purchasePrice=purchasePrice;
	}
	//Getters
	public String getAssetid() {
		return assetid;
	}
	public String getAsssetName() {
		return assetName;
	}
	public double getPurchasePrice() {
		return purchasePrice;
	}
	//Abstract method
	public abstract double calculateCurrentValue();

	public static void main(String[] args) {
		System.out.println("Asset class is workiing");

	}

}
