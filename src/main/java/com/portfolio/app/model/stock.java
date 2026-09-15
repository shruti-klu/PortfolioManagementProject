package com.portfolio.app.model;
import java.util.Scanner;
public class stock {
	private String stockid;
	private String stockname;
	private double price;
	public stock(String stockid,String stockname,double price)
	{
		this.stockid=stockid;
		this.stockname=stockname;
		this.price=price;
	}
	public String getstockid() { return stockid;
	}
	public void setStockname(String stockname) {
		this.stockname = stockname;
	}
	public double getprice() {
		return price;
	}
	public void setPrice(double price) {          
		this.price = price;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("2600520037");
		String stockid = sc.nextLine();
		System.out.println("Shruti kumari");
		String stockname = sc.nextLine();
		System.out.println("2000");
		double price = sc.nextDouble();
		stock s = new stock(stockid,stockname,price);
		System.out.println("Stock ID:"+ s.getstockid());
		System.out.println("Stock Name:"+ stockname);
		System.out.println("Price:"+ s.getprice());
		sc.close();
	}


	}



