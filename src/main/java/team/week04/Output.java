package team.week04;
import java.util.Scanner;

public class Output {
	//private variables
	private Scanner scanner;
	private User user;
	private Calc calculator;

	//constructor
	public Output(){
		this.scanner = new Scanner(System.in);
		this.calculator = new Calc();
	}
	
	//public methods
	public void OutputBill()
	{
		System.out.print("이번달의 총 사용량을 입력해 주십시오: ");
		float used = this.scanner.nextFloat();
		
		System.out.print("사용중인 회선의 총 수를 입력해 주십시오: ");
		int line = this.scanner.nextInt();
		
		System.out.print("사용중인 플랜을 입력해 주십시오: ");
		String plan = this.scanner.next();
		
		try{
			user = new User(used, line, plan);
		}catch(Exception e){
			System.out.println(e);
			return;
		}
		
		this.calculator.setUser(this.user);
		System.out.println("이번 달의 사용 결과는 아래와 같습니다.");
		System.out.println("총 사용량 : " + user.getUsedRate());
		System.out.println("사용 회선 수 : " + user.getLine());
		System.out.println("사용중인 플랜 : " + user.getRank());
		System.out.println("납부하셔야 하는 요금 : " + this.calculator.calcCharge() );
	}
}