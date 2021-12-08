package com.technoelevate.programs;

 class Method{
	
	public static void main(String[] args) {
		Method m = new Method();
		System.out.println(m.multiple());
	    System.out.println(m.add());
	    System.out.println(m.divide());
	
	}
	public int multiple() {
		int i = 10;
		int j = 12;
		int k=i*j;
		return k; 
	}
	public double divide() {
		int x = 10;
		int y = 12;
		int z=x*y;
		return z; 
	}
	public int add() {
		int p= 10;
		int q=12;
		int r = p+q;
		return r;
	}
 }