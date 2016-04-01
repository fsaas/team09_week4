package team09.week4;

public class Gold extends Rank{
	//private variables
	
	//constructor
	public Gold(){
		super();
		this._default = 1000;
		this._exceedRate = 0.45f;
	}
	
	//public methods
	@Override
	public float Calc(float used){
		float fees = 0;
		fees = 49.95f + (this._lines - 1) * 14.95f + this.exceedFee(used);
		
		return fees;
	}
	
	public void setLine(int line){
		this._lines = line;
	}
	
	public float exceedFee(float used){
		float eFee = 0.f;
		float exceedUse = this._default - used;
		
		if(exceedUse > 0)
			return 0;
		else{
			exceedUse *= -1.f;
			eFee = exceedUse * this._exceedRate;
		}
		
		return eFee;
	}
}
