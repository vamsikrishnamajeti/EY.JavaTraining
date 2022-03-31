package com.HandsonExercise;
import java.util.*;
public class Insert1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> h=new HashMap<>();
		h.put(4, "VAMSI");
		h.put(5,"KRISHNA");
		h.put(6, "MAJETI");
		System.out.println("Original Hash Map"+h);
		h.put(2, "HELLO");
		System.out.println("AFTER"+h);
		h.put(4, "VAMSI");
		System.out.println("ADDING DUPLICATE ELEMENT"+h);
		
	}

}
