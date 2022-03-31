package com.StringHandling;

public class StringBufferTest {

public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer();
		str.append("Java ");
		str.append("program ");
		str.append("language ").append("hello ").append("world");
		
		System.out.println(str);
		System.out.println(str.reverse());
		
		System.out.println(str.capacity());
		
		StringBuffer builder = new StringBuffer("my ");
		builder.append(" name ").append(" is").append(" Vamsi");
		
		System.out.println(builder);
	}

}
