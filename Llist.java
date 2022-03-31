package com.HandsonExercise;
import java.util.*;
public class Llist {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> lli=new LinkedList<>();
		lli.add(1);
		lli.add(2);
		lli.add(3);
		lli.add(4);
		lli.add(5);
		System.out.println("BEFORE"+lli);
		Collections.reverse(lli);
		System.out.println("AFTER"+lli);
	}

}
