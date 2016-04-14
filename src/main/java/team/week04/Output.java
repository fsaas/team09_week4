package team.week04;

public class Output {
	//private variables
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