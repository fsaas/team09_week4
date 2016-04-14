package team.week04;

import java.util.Scanner;

public class Output {
	//private variables
	private Scanner scanner;
	private User user;
	private Calc calculator;

	//constructor
	public Output(){
		this.calculator = new Calc();
	}
	
	//public methods
	public float calcCharge(User user){
		this.calculator.setUser(user);
		return this.calculator.calcCharge();
	}
}