package com.technoelevate.programs;

public class Akhanda {

	public static void main(String[] args) {

		System.out.println("My name is Jeigyanshu");
		System.out.println("My name is Anshu");

		divide(2, 0);

		System.out.println("My name is Jeigyanshu Sarangi");
		System.out.println("My name is Jiggy");

	}

	public static double divide(int i, int j) {

		try {
			return i / j;
		} 
		catch (ArithmeticException e1) {
			try {
			   return i / j;
			} 
			catch (Exception e) {
				return -2;
			}

		}

	}
}