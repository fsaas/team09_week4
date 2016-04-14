package team.week04;
import java.util.logging.Logger;


public class Output {
	//private variables
	private User user;
	private Calc calculator;

	//constructor
	public Output(float givenused, int givenline, String givenplan){
		this.calculator = new Calc();
		
		try{
			user = new User(givenused, givenline, givenplan);
		}catch(Exception e){
			System.out.println(e);
			return;
		}
		
		this.calculator.setUser(user);
	}
	
	//public methods
	public void outputBill()
	{		
		this.calculator.setUser(this.user);
		System.out.println("이번 달의 사용 결과는 아래와 같습니다.");
		System.out.println("총 사용량 : " + user.getUsedRate());
		System.out.println("사용 회선 수 : " + user.getLine());
		System.out.println("사용중인 플랜 : " + user.getRank());
		System.out.println("납부하셔야 하는 요금 : " + this.calculator.calcCharge() );
	}
	
	public float calcCharge(){
		return this.calculator.calcCharge();
	}
}