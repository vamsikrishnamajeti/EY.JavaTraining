package com.HandsonExercise;

class ExceptionTest1 {

	public static void main(String[] args) {
		//try {
			//throw new Exception1();
		//} catch (Exception1 ex1) {
		//	System.out.println(ex1.getMessage());
		//} 
		try {
			throw new Exception1();		
			}
		catch (Exception2 ex) {
			System.out.println(ex.getMessage());
		} catch (Exception1 e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}