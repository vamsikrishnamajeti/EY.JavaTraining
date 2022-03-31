package com.StringHandling;

public class Concat {
	
	public static void main(String [] args) {
		
		String a ="VAMSI";
		String b=a.concat("KRISHNA");
		a.concat("MAJETI");// won't work...
		System.out.println(a);
		System.out.println(b);
	}
}
