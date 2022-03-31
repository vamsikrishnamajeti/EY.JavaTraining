package com.HandsonExercise;
import java.util.*;
public class CreateStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> s=new Stack<>();
		s.add(2);
		s.add(4);
		s.add(6);
		s.add(8);
		System.out.println("BEFORE _"+s);
		s.pop();
		System.out.println("AFTER _"+s);
		
	}

}
