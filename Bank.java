package com.HandsonExercise;

public class Bank {
	double money,rate,time;
	double ROI;
	
	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getTime() {
		return time;// years
	}

	public void setTime(double time) {
		this.time = time;
	}

	void Interest() {
		ROI=(money*rate*time)/100;
	}
	public double getROI(){
		return ROI;
	}
}
