package com.HandsonExercise;
import java.util.*;
public class Display {
	public static void main(String[]args) {
		ArrayList<String> arr=new ArrayList<>();
		arr.add("MAJETI");
		arr.add("LAKSHMI");
		arr.add("RAGHAVA");
		arr.add("VAMSI");
		arr.add("KRISHNA");
		Iterator<String> itr = arr.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
