package Bank;

import java.util.Scanner;

public class BankService {

	private BankEntity bankEntity;
	private Scanner scanner;
	
	public BankService() {
		scanner = new Scanner(System.in);
	}
	
	public void create() {
		bankEntity = new BankEntity();
		bankEntity.setAccount(30485987);
		bankEntity.setName("장혜민");
		
		}
	
	public void in() {
		 System.out.println("얼마를 입금하시겠습니까?");
		 int in = scanner.nextInt();
		 int a = bankEntity.getTotal();
		 bankEntity.setTotal(in+a);
		 System.out.println("입금이 완료 되었습니다.");
		 System.out.println();
	}
	
	public void out() {
		while(true) {
		int a = bankEntity.getTotal();
		if(a == 0) {
			System.out.println("잔액이 없습니다");
			break;
		}
		
		System.out.println("얼마를 출금하시겠습니까?");
		int out = scanner.nextInt();
		
		if(a < out) { 
			System.out.println("잔액이 부족합니다");
			System.out.println("현재 잔액은 "+ a +"원 입니다");
			System.out.println("다시 입력해 주십시오");
		}else if(a > out) {
			bankEntity.setTotal(a-out);
			System.out.println("출금이 완료 되었습니다");
			System.out.println();
			break;
		}else {
			System.out.println("올바르지 못한 입력입니다");
			System.out.println("다시 입력해주십시오");
			}
		}
	}
	
	public void total() {
		System.out.println(bankEntity);
	}

	
	

	
}
