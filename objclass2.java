package com.ey.basic;

public class objclass2 {
	
	public static void main(String [] args) {
		
		sampleprogram2 obj =  new sampleprogram2();
		
		int a = obj.add();
		int b = obj.sub();
		int c = obj.mul();
		int d = obj.div();
		int e = obj.mod();
		
		System.out.println("ADDITION- "+a+"\nSUBTRACTION- "+b+"\nMULTIPLICATION- "+c+"\nDIVISION- "+d+"\nMODULAR- "+e);
	}

}