package team.week04;

import java.util.Scanner;

public class Output {
	//private variables
	private Scanner scanner;
	private User user;
	private Calc calculator;

	//constructor
	public Output(){
		this.calculator = new Calc();
	}
	
	//public methods
	public void outputBill()
	{		
		float givenUsed;
		int givenline;
		String givenplan;
		
		givenUsed = scanner.nextFloat();
		givenline = scanner.nextInt();
		givenplan = scanner.next();
		
		try{
			user = new User(givenUsed, givenline, givenplan);
		}catch(Exception e){
			System.out.println(e);
			return;
		}
		
		this.calculator.setUser(this.user);
		System.out.println("이번 달의 사용 결과는 아래와 같습니다.");
		System.out.println("총 사용량 : " + user.getUsedRate());
		System.out.println("사용 회선 수 : " + user.getLine());
		System.out.println("사용중인 플랜 : " + user.getRank());
		System.out.println("납부하셔야 하는 요금 : " + this.calcCharge(user) );
	}
	
	public float calcCharge(User user){
		this.calculator.setUser(user);
		return this.calculator.calcCharge();
	}
}