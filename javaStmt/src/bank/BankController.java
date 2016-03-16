/**
 * 
 */
package bank;

import java.util.Scanner;

/**
 * @file BankController.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 15.
 * @story
 *
 */
public class BankController {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BankService serviceBank = new BankServiceImpl();
		while (true) {
			System.out.println("[메뉴] 1.계좌개설 2.입금 3.출금 4.잔액조회 0.종료");
			switch (s.nextInt()) {
			case 1:
				System.out.println("[계좌개설] 이름, 비밀번호 입력 :");
				System.out.println(serviceBank.openAccount(s.next(), s.nextInt()));
				break;
			case 2:
				System.out.println("[입금] 계좌번호, 금액 입력 :");
				System.out.println(serviceBank.deposit(s.nextInt(), s.nextInt()));
				break;
			case 3:
				System.out.println("[출금] 계좌번호, 비밀번호, 금액 입력 :");
				System.out.println(serviceBank.withdraw(s.nextInt(), s.nextInt(), s.nextInt()));
				break;
			case 4:
				System.out.println("[잔액조회] 계좌번호, 비밀번호 입력 :");
				System.out.println(serviceBank.findMoney(s.nextInt(), s.nextInt()));
				break;
			case 0:
				System.out.println("종료");
				return;

			default:
				System.out.println("잘못된 값");
				return;
			}
		}

	}
}
