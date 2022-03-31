package com.ey.basic;
import java.util.Scanner;
public class payslip {
	Scanner sc=new Scanner(System.in);
	float no_of_days=sc.nextFloat();
	int no_of_depts=sc.nextInt();
	float amt=sc.nextFloat();
	public void salary() {
		float salary = amt*no_of_days*no_of_depts;
		System.out.println("Salary"+salary);
	}
}
