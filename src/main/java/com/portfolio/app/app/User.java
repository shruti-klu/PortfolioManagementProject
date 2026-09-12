
	package com.portfolio.app.app;

	public class User {
	    String userid;
	    String name;
	    String email;

	    public User(String userid, String name, String email) {
	        this.userid = userid;
	        this.name = name;
	        this.email = email;
	    }

	    public void display() {
	        System.out.println("User ID: " + userid);
	        System.out.println("Name: " + name);
	        System.out.println("Email: " + email);
	    }
	}


