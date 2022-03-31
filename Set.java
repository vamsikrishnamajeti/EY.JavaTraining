package com.HandsonExercise;
import java.util.*;
//import java.util.Hashset;
//import java.util.Set;
public class Set {
	public static void main(String[]args) {
		HashSet<Integer> s=new HashSet<>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		System.out.println("Elements of set 1 is "+s);
		HashSet<Integer> s1=new HashSet<>();
		s1.add(2);
		s1.add(3);
		s1.add(4);
		s1.add(5);
		System.out.println("Elements of set 2 is "+s1);
		s.retainAll(s1);
		System.out.println("Retained Elements are "+s);
		}
}
	
