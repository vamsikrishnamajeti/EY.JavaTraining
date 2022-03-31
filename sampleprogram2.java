package com.ey.basic;
import java.util.Scanner;

public class sampleprogram2 {
	
	Scanner sc=new Scanner(System.in);
	
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	public int add(){
		int c=a+b;
		return c;
	}
	public int sub(){
		int d=a-b;
		return d;
	}
	public int mul(){
		int e=a*b;
		return e;
	}
	public int div(){
		int f=a/b;
		return f;
	}
	public int mod(){
		int g=a%b;
		return g;
	}
}
