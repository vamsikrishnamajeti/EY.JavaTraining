package com.HandsonExercise;

public class Emp extends Person {
	double salary;
	Emp(int id,String name,double salary){
		super(id,name);
		this.salary=salary;
	}
	double getSalary() {
		return salary;
	}
}
