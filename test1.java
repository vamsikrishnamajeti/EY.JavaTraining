package com.encapsulation.basics;

public class test1 {
	public static void main(String [] args) {
		Sub obj=new Sub();
		obj.setAdd(10, 20);
		obj.setSub(20, 10);
		System.out.println(obj.getAdd());
		System.out.println(obj.getSub());
	}
}
