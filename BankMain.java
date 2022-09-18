package Bank;

import java.util.Scanner;

public class BankMain {

 public static void main(String[] args) {
	 
	 BankService bankService = new BankService();
	 Scanner scanner ;
	 
	 bankService.create();
	 
	 while(true) {
		 System.out.println("부자은행 프로그램입니다");
		 System.out.println("원하시는 서비스를 입력해 주세요");
		 System.out.println("i. 입금");
		 System.out.println("o. 출금");
		 System.out.println("s. 계좌 조회");
		 System.out.println("e. 서비스 종료");
		 
		 scanner = new Scanner(System.in);
		 String select = scanner.next();
		 
		 if(select.equals("i")) {
			 bankService.in();
		 }else if(select.equals("o")) {
			 bankService.out();
		 }else if(select.equals("s")) {
			 bankService.total();
		 }else if(select.equals("e")) {
			 System.out.println("서비스를 종료합니다");
			 break;
		 }else {
			 System.out.println("올바르지 않은 입력입니다");
			 System.out.println("다시 입력해 주십시오");
			 System.out.println();
		 }
		 
	 }
	 
	 
	 
	 
	 
 	}
 }
