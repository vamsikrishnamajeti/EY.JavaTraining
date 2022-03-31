package com.polymorphism.basics;

public class Dynamicoverride {
	public static void main(String [] args) {
		override obj=new override();
		System.out.println(obj.getROI());
		
		override1 obj1=new override1();
		System.out.println(obj1.getROI());
		
		override2 obj2=new override2();
		System.out.println(obj2.getROI());
	}
}
class override{
	int getROI() {
		return 1;
	}
}
class override1 extends override{  
	int getROI() {
		return 10;
	}
}
class override2 extends override1{
	int getROI() {
		return 100;
	}
}

