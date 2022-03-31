package com.HandsonExercise;

public class Honda extends Bike {
	public void run() {
		System.out.println("Honda class extends Bike class and implemting abstarct run method in bike class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda h=new Honda();
		h.run();
	}

}
