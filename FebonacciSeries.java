package com.technoelevate.programs;

public class FebonacciSeries {

	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		int n=10;
		System.out.println("Febonacci Series"+n+"terms");
		for(int i=1;i<=n;i++) {
			System.out.println(num1+",");
			int vijay=num1+num2;
			num1=num2;
			num2=vijay;
		}
		
	}
	}
