package com.HandsonExercise;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
				System.out.println("HELLO");
				@SuppressWarnings("resource")
				Scanner s = new Scanner(System.in);
				String a=s.nextLine();
				try{
						MyData m=new MyData();
					    m.verify(a);
					    
					}
				catch(ExceptionC e){
					    
					    System.out.println(e.getMessage().toUpperCase());
					}
				catch(ExceptionB e1){
					    System.out.println(e1.getMessage().toLowerCase());
					}
				catch(ExceptionA e1){
					    System.out.println(e1.getMessage().toLowerCase());
					}
		}
		
			
		

	

}
