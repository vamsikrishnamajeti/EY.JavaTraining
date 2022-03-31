package com.polymorphism.basics;

public class Staticoverload {
	int a;
	int b;
	public void sum() {
		System.out.println("Method 1");
	}
	public void sum(int a,int  b) {
		int d=a+b;
		System.out.println("Method 1"+ d);
		 
	}
	public void sum(int a,int b,int c) {
		int e=a+b+c;
		System.out.println("Method 1" + e);
		
	}
}
