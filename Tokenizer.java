package com.StringHandling;

import java.util.StringTokenizer;
public class Tokenizer {
	
	public  static void main(String [] args) {
		
		StringTokenizer obj = new StringTokenizer("My name is Vamsi Krishna","i");
		
		while(obj.hasMoreTokens()) {
			System.out.println(obj.nextToken());
		}
		while(obj.hasMoreTokens()) {
			System.out.println(obj.countTokens());
		}
	}
}
