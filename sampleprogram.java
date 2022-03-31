package com.ey.basic;
import java.util.Scanner;

public class sampleprogram {
	
	Scanner sc=new Scanner(System.in);
	
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	public void add(){
		int c=a+b;
		System.out.println("Additon " +c);
	}
	public void sub(){
		int d=a-b;
		System.out.println("Subtraction " +d);
	}
	public void mul(){
		int e=a*b;
		System.out.println("multiplication " +e);
	}
	public void div(){
		int f=a/b;
		System.out.println("Division " +f);
	}
	public void mod(){
		int g=a%b;
		System.out.println("modular " +g);
	}

}
