package com.HandsonExercise;
import java.util.Scanner;
public class Restaurent {
	public static void main(String[]args) {
		try (Scanner sc = new Scanner(System.in)) {
			String Dish=sc.nextLine();
			int randNo = (int) Math.round(Math.random()); 
			// returns 0 or 1
			try{
				Restuarent r=new Restuarent();
				r.verify(randNo);
			}
			catch(Menu e) {
				System.out.println(e.getMessage()+Dish);
			}
			finally {
				System.out.println("Bye");
			}
		}
	}
}
