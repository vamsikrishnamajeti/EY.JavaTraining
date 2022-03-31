package com.abstraction.basics;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car obj = new benz();
		car obj1 = new tata();// interface_name object = new class_which_implements_interface();
		
		obj.engine();
		obj.version();
		obj.model();
		obj1.engine();
		obj1.version();
		obj1.model();
	}

}
