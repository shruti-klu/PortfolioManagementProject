package com.portfolio.app.loops;
import java.util.*;
public class nestedloops {

	public static void main(String[] args) {
		int n=4;
		int m=5;
		//outer loop
		for(int i=1 ; i<=m; i++) {
			//inner loop
			for(int j=1; j<m;j++) {
				System.out.println("*");
			}
			System.out.println();
		}
	}

}
