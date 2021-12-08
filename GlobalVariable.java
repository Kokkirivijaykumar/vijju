package com.technoelevate.programs;

public class GlobalVariable {
         public static int i = 12;
         public static int j = 20;
         int  p=30;
         int q=10;
         public static  int add() {
        	 int k= i+j;
        	 System.out.println(k);
        	 return k;
         }
         public void sum() {
        	 int r=p+q;
        	System.out.println(r);
        	 
         }
         public static void main(String[] args) {
			GlobalVariable.add();
			 
			GlobalVariable v=new GlobalVariable();
			v.sum();
		}
}
