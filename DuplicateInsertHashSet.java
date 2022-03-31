package com.HandsonExercise;
import java.util.*;
public class DuplicateInsertHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> h=new HashSet<>();
		h.add(1);
		h.add(2);
		h.add(3);
		System.out.println("Original HashSet"+h);
		h.add(2);
		System.out.println("After adding duplicate element"+h);
	}

}
