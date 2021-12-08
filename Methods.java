package com.technoelevate.programs;

public class Methods {
public static void add() {
	int i=10;
	int j=20;
	int k=i+j;
	System.out.println("Addition "+k);
}
public static int divide() {
	int x=10;
	int y=20;
	int z=x*y;
	return z;

}
public void multiple() {
	int p=10;
	int q=20;
	int r=p*q;
    System.out.println("multipulication "+r);

}
public int sub() {
	int a=10;
	int b=20;
	int c=a+b;
	return c;
}
public static void main(String[] args) {
	Methods.add();
	System.out.println("Divide "+Methods.divide());
	Methods m = new Methods();
	System.out.println("Subraction "+m.sub());
	m.multiple();
	
}
}
