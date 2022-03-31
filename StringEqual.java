package com.StringHandling;

public class StringEqual {
	
	public static void main(String [] args) {
		
		String str1 = "HI";
		String str2 = "HI";
		
		String str3 = new String("HI");
		

		System.out.println(str1 == str2);// String constant pool for variables(space inside heap)
		System.out.println(str1 == str3);
		System.out.println(str2 == str3);
		System.out.println(str1.equals(str2));// heap memory (for objects)
		System.out.println(str1.equals(str3));
		System.out.println(str2.equals(str3));
	}
}
