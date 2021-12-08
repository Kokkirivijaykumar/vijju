package com.technoelevate.programs;

interface Vijayp {
	void sleep();
	void wake();
}

public class InterfaceProgram implements Vijayp {
	public void sleep() { 
     int x=10;
	 int y=20;
	 int z=x+y;
		System.out.println("i am lazy guy "+z);
	}
		public void wake() {
			System.out.println("never");
		}
		

	public static void main(String[] args) {
		InterfaceProgram ip = new InterfaceProgram();
		ip.sleep();
		ip.wake();
	}

}
