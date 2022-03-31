package com.HandsonExercise;

class Menu extends Exception {
	int dish;
	public void setData(int dish) {
		this.dish=dish;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
class Restuarent{
	public void verify(int data) throws Menu{
		boolean a=true;
		if(data==0) {
			a = false;
		}
		if(a == false ) {
			Menu m=new Menu();
			m.setData(data);
			throw m;
		}
		else {
			System.out.println("Available! ");
		}
	}

	public String getMessage() {
		return "This Dish is not available ";
	}
}