package team.week04;

public class Rank {
	//protected variables
	protected int defaultTime;
	protected float exceedRate;
	protected int lines;
	protected float defaultFee;
	
	//constructor
	public Rank(){
		this.lines = 1;
	}
	
	//public method
	public float calc(float used){
		return this.defaultFee + (this.lines - 1) * 21.50f + this.exceedFee(used);		
	}
	
	public void setLine(int line){
		this.lines = line;
	}

	public float exceedFee(float used){
		float exceedUse = this.defaultTime - used;
		
		if(exceedUse > 0)
			return 0;
		else{
			exceedUse *= -1.f;
		}
		
		return exceedUse * this.exceedRate;
	}

}
