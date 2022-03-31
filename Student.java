package com.HandsonExercise;
import java.util.*;
public class Student{	
		int roll_no;
		String name;
		int age;
		public Student(int roll_no,String name,int age) {
			this.roll_no=roll_no;
			this.name=name;
			this.age=age;
		}
		public int getId() {
			return roll_no;
		}
		public String getname() {
			return name;
		}
		public int getAge() {
			return age;
		}
}
class Compare implements Comparator<Student>{
	@Override
	public int compare(Student o1,Student o2) {
		return o1.roll_no - o1.roll_no;
	}
}


