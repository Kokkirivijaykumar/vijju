package com.technoelevate.programs;

public class OverloadMethods {
public static void add(int i,int j) {
	int k=i+j;
	System.out.println("Addition of two num with args:"+k);
}
public static void add() {
	int x =11;
	int y=22;
	int z=33;
	int v=x+y+z;
	System.out.println("Add three nums without args:"+v);
}
public int sub(int p,int q) {
	int r=p-q;
	return r;
}
public int sub() {
	int a=30;
	int b=20;
	int c=a-b;
	return c;
}
	

public static void main(String[] args) {
	OverloadMethods.add();
	OverloadMethods.add(200, 100);
	OverloadMethods v=new OverloadMethods();
    System.out.println("Sub without args:"+v.sub());
    System.out.println("Sub with args:"+v.sub(300, 100));
}
	
}

