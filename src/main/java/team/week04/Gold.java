package team.week04;

public class Gold extends Rank{
	//private variables
	
	//constructor
	public Gold(){
		super();
		this.defaultTime = 1000;
		this.exceedRate = 0.45f;
		this.defaultFee = 49.95f;
	}
	
	//public methods
	@Override
	public String toString(){
		return "Gold";
	}
}
