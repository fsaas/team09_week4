package team.week04;

public class Calc {
	//private variables
	private User user;
	
	//constructor
	public Calc(){
		//default class
	
	}
	
	//public methods
	public void setUser(User u){
		this.user = u;
	}
	
	public float calcCharge(){
		this.user.getRank().setLine(this.user.getLine());
		return this.user.getRank().calc(this.user.getUsedRate());
	}
}
