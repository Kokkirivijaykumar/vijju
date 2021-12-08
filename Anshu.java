package com.technoelevate.programs;

public  class Anshu {
	
  public  void greet() {
	  System.out.println("Hello : "+this.getName());
  }
  public   String getName() {
	  return "jeigyanashu ";
  }
  public static void main(String[] args) {
	Anshu a= new Anshu();
	System.out.println(a.getName());
	a.greet();
}
}
