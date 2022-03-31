package com.HandsonExercise;

public class SBIi implements Banc {
	double money,roi;
	
	
	public void setMoney(double money) {
		this.money = money;
	}
	
	public void setRoi(double roi) {
		this.roi = roi;
	}
	public double ROI() {
		return (roi=((money)*2)/100);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBIi obj=new SBIi();
		obj.setMoney(10000);
		obj.setRoi(2);
		System.out.println("rate of interest - "+obj.ROI());
	}

}
