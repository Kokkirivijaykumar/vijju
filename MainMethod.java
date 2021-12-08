package com.technoelevate.programs;

public class MainMethod {
	public static void main(String[] args) {
		Program pr = new Program();
		System.out.println(pr.doit());
		System.out.println(pr.names("Illias"));
		System.err.println(pr.multiple(12, 12));
		pr.run();
		
		System.out.println(Program.Dontgiveup());
		Program.life();
		System.out.println(Program.name("Illias", "Gnaneswar"));
        System.out.println(Program.vijju("vijay"));
        Program.vijay();
		System.out.println(Program.sub(20, 10));
	}	
}
