package com.HandsonExercise;

public class School {
	String name;
	
	

	public void setName(String name) {
		this.name = name;
	}

	public class Student{
		
			String stu_name;
			public void accessSchoolName() {
				
		    }
			
			public void setStu_name(String stu_name) {
				this.stu_name = stu_name;
			}
			public void print() {
				System.out.println("Student name - "+stu_name+"\nSchool name - "+name);
			}
	}
	public static void main(String[]args) {
		School sc=new School();
		sc.setName("BHASHYAM");
		School.Student st=sc.new Student();
		st.setStu_name("VAMSI");
		st.print();
	}
}

