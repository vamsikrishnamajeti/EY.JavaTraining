package com.HandsonExercise;

public class Test1 {
	public static void main(String[]args) {
		SBI sbi=new SBI();
		ICICI icici =new ICICI();
		Axix axix=new Axix();
		sbi.setMoney(10000);
		sbi.setRate(1);
		sbi.setTime(2);
		icici.setMoney(20000);
		icici.setRate(2);
		icici.setTime(1);
		axix.setMoney(30000);
		axix.setRate(0.5);
		axix.setTime(3);
		System.out.println("SBI");
		System.out.println("PRINCIPAL AMOUNT - "+sbi.getMoney());
		System.out.println("RATE - "+sbi.getRate());
		System.out.println("TIME - "+sbi.getTime());
		System.out.println("SIMPLE INTEREST  - "+sbi.getROI());
		System.out.println("ICICI");
		System.out.println("PRINCIPAL AMOUNT - "+icici.getMoney());
		System.out.println("RATE - "+icici.getRate());
		System.out.println("TIME - "+icici.getTime());
		System.out.println("SIMPLE INTEREST  - "+icici.getROI());
		System.out.println("Axix");
		System.out.println("PRINCIPAL AMOUNT - "+axix.getMoney());
		System.out.println("RATE - "+axix.getRate());
		System.out.println("TIME - "+axix.getTime());
		System.out.println("SIMPLE INTEREST  - "+axix.getROI());
	}
}
