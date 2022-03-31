package com.HandsonExercise;
import java.util.*;
public class Java {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compare compare=new Compare();
		List<Student> li=new ArrayList<>();
		//Student s1= li.new Student(1,"VAMSI",21);
	    li.add(new Student(2,"VAMSI",21));
	    li.add(new Student(3,"KRISHNA",22));
	    li.add(new Student(1,"MAJETI",23));
	    Collections.sort(li,compare);
	    for(Student student : li) {
	    	System.out.println("Roll no -"+student.getId()+"\nName -"+student.getname()+"\nAge -"+student.getAge()) ;
	    	
	    }
	}


}
