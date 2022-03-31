package com.HandsonExercise;

public class Car {
	String carname;
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	
	class Wheel{
		String wheel1;
		String wheel2;
		String wheel3;
		public String getWheel1() {
			return wheel1;
		}
		public void setWheel1(String wheel1) {
			this.wheel1 = wheel1;
		}
		public String getWheel2() {
			return wheel2;
		}
		public void setWheel2(String wheel2) {
			this.wheel2 = wheel2;
		}
		public String getWheel3() {
			return wheel3;
		}
		public void setWheel3(String wheel3) {
			this.wheel3 = wheel3;
		}
		public String getWheel4() {
			return wheel4;
		}
		public void setWheel4(String wheel4) {
			this.wheel4 = wheel4;
		}
		String wheel4;
	}
	public static void main(String[]args) {
		Car c=new Car();
		Car.Wheel w=c.new Wheel();
		c.setCarname("Maruthi");
		w.setWheel1("MRF");
		w.setWheel2("MRF");
		w.setWheel3("MRF");
		w.setWheel4("MRF");
		System.out.println("Car of make - "+c.getCarname());
		System.out.println("wheel 1 of make - "+w.getWheel1());
		System.out.println("wheel 2 of make - "+w.getWheel2());
		System.out.println("wheel 3 of make - "+w.getWheel3());
		System.out.println("wheel 4 of make - "+w.getWheel4());
	}
}
