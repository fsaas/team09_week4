package team.week04;
import java.util.Scanner;
import java.util.logging.Logger;


public class Output {
	//private variables
	private Scanner scanner;
	private User user;
	private Calc calculator;
	private Logger logger;

	//constructor
	public Output(){
		this.scanner = new Scanner(System.in);
		this.calculator = new Calc();
		this.logger = Logger.getLogger("output");
	}
	
	//private method
	
	//public methods
	public void outputBill(){
		this.logger.info("이번달의 총 사용량을 입력해 주십시오: ");
		float used = this.scanner.nextFloat();
		
		this.logger.info("사용중인 회선의 총 수를 입력해 주십시오: ");
		int line = this.scanner.nextInt();
		
		this.logger.info("사용중인 플랜을 입력해 주십시오: ");
		String plan = this.scanner.next();
		
		user = new User(used, line, plan);
		
		if(user.getRank() == null){
			this.logger.warning("존재하지 않는 플랜입니다 : " + plan);
			return;
		}
		
		this.calculator.setUser(this.user);
		this.logger.info("이번 달의 사용 결과는 아래와 같습니다.\n");
		this.logger.info("총 사용량 : " + user.getUsedRate() + "\n");
		this.logger.info("사용 회선 수 : " + user.getLine() + "\n");
		this.logger.info("사용중인 플랜 : " + user.getRank() + "\n");
		this.logger.info("납부하셔야 하는 요금 : " + this.calculator.calcCharge() + "\n");
	}
}