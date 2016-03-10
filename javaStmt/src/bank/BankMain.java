/**
 * 
 */
package bank;

import java.util.Scanner;

/**
 * @file BankMain.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 10.
 * @story
 *
 */
public class BankMain {
	public static void main(String[] args) {

		// 지역변수 영역
		Scanner scanner = new Scanner(System.in);
		BankServiceImpl bank = new BankServiceImpl();
		AdminServiceImpl admin = new AdminServiceImpl(100);
		// 연산영역
		System.out.println("admin :'1', customer : '2'");
		switch (scanner.nextInt()) {
		case 1:

			
			
			break;
		case 2:
			System.out.println("이름, password입력하세요");

			System.out.println(bank.openAccount(scanner.next(), scanner.nextInt()));

			System.out.println("입금 : ");
			System.out.println(bank.deposit(scanner.nextInt()));

			System.out.println("출금 : ");
			System.out.println(bank.withdraw(scanner.nextInt()));

			System.out.println("잔액조회 : ");
			System.out.println(bank.findMoney());
			break;
		default:
			System.out.println("해당 값이 존재하지 않습니다.");
			break;
		}

	}
}
