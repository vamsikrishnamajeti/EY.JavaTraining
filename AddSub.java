package com.basic.declaration;

public class AddSub {

	// class - combination of member methods & variables.
		//object - if you want access members of a class , we are going to have Object created for that class.
		//variables
		int a = 10;   //global variables
		int b = 20;
		
		
		//methods -  + , - , * , / ,%
		public void addTwoValues() {
			int c = a+b;  //local variables
			System.out.println("addition of two numbers is :: " + c);
		}
		
		public void subTwoValues() {
			
			int d = b-a;
			System.out.println("sub of two given numbers is ::" +d);
		}
public static void main(String [] args) {
		
	//object for SampleProgram class
			//using new operator you can create a object for a class.
			//classname obj = new classname();
			//(.) member operator which is used to access members using object
			//Object is the top class for all the classes in java.
			
			AddSub obj = new AddSub();
			obj.addTwoValues();
			obj.subTwoValues();
			
			
//			obj = null; //unused objects
		}
}
