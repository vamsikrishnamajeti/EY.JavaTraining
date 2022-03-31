package com.HandsonExercise;
import java.util.*;
public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a=new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(2);
		System.out.println("ArrayList is - "+a);
		if(a.contains(3)) {
			System.out.println("Element 3 found");
		}
		else {
			System.out.println("Element 3 not found");
		}
		if(a.contains(2)) {
			System.out.println("Element 2 found");
		}
		else {
			System.out.println("Element 2 not found");
		}
		if(a.contains(5)) {
			System.out.println("Element 5 found");
		}
		else {
			System.out.println("Element 5 not found");
		}
	}

}
