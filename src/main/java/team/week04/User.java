package team.week04;

@SuppressWarnings("serial")
class NotExistPlanException extends Exception{
	private final String msg;
	
	public NotExistPlanException(String msg){
		this.msg = msg;
	}
	
	@Override
	public String getMessage(){return this.msg;}
}

public class User {
	private float usedRate;
	private int lines;
	private Rank rank;

	public User() {
		//default class
	}

	public User(float usedRate, int lines, String rank) throws NotExistPlanException {
		this.usedRate = usedRate;
		this.lines = lines;
		
		if(this.lines < 1)
			this.lines = 1;

		if (rank.compareTo("Gold") == 0) {
			this.rank = new Gold();
		} else if (rank.compareTo("Silver") == 0) {
			this.rank = new Silver();
		}else{
			throw new NotExistPlanException("존재하지 않는 요금제 입니다.");
		}
	}

	public float getUsedRate() {
		return this.usedRate;
	}

	public int getLine() {
		return this.lines;
	}

	public Rank getRank() {
		return this.rank;
	}
}
