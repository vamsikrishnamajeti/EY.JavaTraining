package com.statik.basics;

public class Statikc {
	final int a=10;// a value wont change because of final keyword
	public static void main(String [] args) {
		Statikc.mystat();
	}
	static void mystat() {
		System.out.println("static method");
	}
}
