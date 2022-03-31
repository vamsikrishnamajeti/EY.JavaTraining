package com.HandsonExercise;

public class Programmer extends Employee {
	int bonus;
	float total_salary;
	
	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	
	public float salari() {
		return (total_salary=salary+bonus);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer obj=new Programmer();
		obj.setBonus(1000);
		obj.setSalary(25000);
		System.out.println("SALARY _ "+obj.salari());
	}

}
