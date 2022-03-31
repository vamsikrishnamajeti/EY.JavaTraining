package com.HandsonExercise;
//import java.util.Scanner;
class ExceptionA extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String data;
    
    public void setData(String data) {
        this.data = data;
    }
	@Override
	public String getMessage() {
		return "This is Exception A";
	}
}
class ExceptionB extends ExceptionA{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public String getMessage() {
		return "This is Exception B";
	}
}
class ExceptionC extends ExceptionB{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public String getMessage() {
		return "This is Exception C";
	}
}
class MyData {
    public void verify(String line) throws ExceptionA, ExceptionB , ExceptionC {
        int n = line.length();
        if (n < 10) {
            System.out.println("OK");
        } 
        else if (n < 15) {
            ExceptionA ex = new ExceptionA();
            ex.setData(line);
            throw ex;
        } 
        else if(n<20){
            ExceptionB ex1 = new ExceptionB();
            ex1.setData(line);
            throw ex1;
        }
        else {
            ExceptionC ex2 = new ExceptionC();
            ex2.setData(line);
            throw ex2;
        }
        
    }
}
