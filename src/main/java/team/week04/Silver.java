package team.week04;

public class Silver extends Rank {
	//private variables
	
	//constructor
	public Silver(){
		super();
		this.defaultTime = 500;
		this.exceedRate = 0.54f;
		this.defaultFee = 29.95f;
	}
	
	//public methods
	@Override
	public String toString(){
		return "Silver";
	}
}
