package com.vijay.shop;

import java.util.Scanner;

public class Main1 {
private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Store1 st=new Store1();
		boolean flag=true;
		
		while(flag) {
			
			System.out.println("1: Adding item in cart");
			System.out.println("2: Remove item in cart");
			System.out.println("3: GetAll items in cart");
			System.out.println("4: Get specific item in cart");
			System.out.println("5: Replace an item in cart");
			System.out.println("6: Exit from the cart");
			
			System.out.println("Enter your choice");
			int a=sc.nextInt();
			switch(a) {
			case 1:{
				st.addGroceryItem(sc.next());
				break;
			}
			case 2:{
				st.removeGroceryItem();
				break;
			}
			case 3:{
				Store1.printGroceryList();
				break;
			}
			case 4:{
				st.findItem();
				break;
			}
			case 5:{
				
				System.out.println();
				st.modifyGroceryList();
				break;
			}
			case 6:{
				Store1.printGroceryList();
				System.out.println("Thank You For Shopping");
				flag=false;
				
			}
			}
		}
		
		
	}

}
