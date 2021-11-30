package com.vijay.shop;
import java.util.ArrayList;
import java.util.Scanner;

public class Store1 {
private static ArrayList groceryList = new ArrayList();

private static Scanner sc=new Scanner(System.in);

public void addGroceryItem(Object item) {
	groceryList.add(item);
}
 
public static void printGroceryList() {
	System.out.println("You have "+ groceryList.size()+"items in your list");
	
	for (int i=0; i<groceryList.size(); i++) {
		System.out.println((i+1) + "."+groceryList.get(i));
	}
		
	}
	public void modifyGroceryList() {
		printGroceryList();
		System.out.println("Enter the position");
		int position=sc.nextInt();
		System.out.println("Enter the Item");
		String newItem=sc.next();
		groceryList.set(position,newItem);
		System.out.println("Grocery item"+(position+1) + "has been modified");

}
	public void removeGroceryItem() {
		printGroceryList();
		System.out.println("Write the iten to remove");
		groceryList.remove(sc.next());
		}
	public void findItem() {
		printGroceryList();
		System.out.println("please enter the index");
		int a=sc.nextInt();
		System.out.println(groceryList.get(a));
	}
	}

