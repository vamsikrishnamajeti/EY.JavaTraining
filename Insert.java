package com.HandsonExercise;
import java.util.*;
public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> li=new LinkedList<>();
		li.add(20);
		li.add(40);
		li.add(60);
		li.add(80);
		li.add(2,100);// inserting at index 2
		li.add(3,120);//inserting at index 3
		System.out.println(li);
	}

}
