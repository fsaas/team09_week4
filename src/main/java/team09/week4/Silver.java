package team09.week4;

public class Silver extends Rank {
	//private variables
	
	//constructor
	public Silver(){
		super();
		this._default = 500;
		this._exceedRate = 0.54f;
	}
	
	//public methods
	@Override
	public float Calc(float used){
		float fees = 0;
		fees = 29.95f + (this._lines - 1) * 21.50f + this.exceedFee(used);
		
		return fees;	}
	
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
