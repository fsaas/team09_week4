package team.week04;

public class User {
	private float usedRate;
	private int lines;
	private Rank rank;

	public User(float usedRate, int lines, String rank){
		this.usedRate = usedRate;
		this.lines = lines;
		
		if(this.lines < 1)
			this.lines = 1;
		
		if ("Gold".equalsIgnoreCase(rank)) {
			this.rank = new Gold();
		} else if ("Silver".equalsIgnoreCase(rank)) {
			this.rank = new Silver();
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
