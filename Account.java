package com.HandsonExercise;
public class Account {
	private long account_no;
	private String name;
	private String email;
	private float amount;
	public long getAccount_no() {
		return account_no;
	}
	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public static void main(String[] args) {
		Account a=new Account();
		a.setAccount_no(1234560);
		a.setAmount(15000);
		a.setEmail("mlrvamsikrishna@gmail.com");
		a.setName("Vamsikrishna");
		System.out.println("Account no - "+ a.getAccount_no());
		System.out.println("Name - "+ a.getName());
		System.out.println("Email - "+ a.getEmail());
		System.out.println("Amount - "+ a.getAmount());
		
		
	}


	

}
