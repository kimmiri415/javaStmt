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
			System.out.println("계좌개설 : '1', 계좌조회-계좌번호로 : '2', 계좌조회-계좌이름으로 : '3', 계좌해지 : '4'");
			switch (scanner.nextInt()) {
			case 1:
				System.out.println("이름, password입력하세요");

				System.out.println(admin.openAccount(scanner.next(), scanner.nextInt()));
				break;
			case 2:
				System.out.println("[계좌번호로 계좌조회] 계좌번호 입력 :");
				System.out.println(admin.findAccountByAccountNo(scanner.nextInt()));
				break;
			case 3:
				System.out.println("[계좌이름으로 계좌조회] 계좌이름 입력 : ");
				admin.findAccountsByName(scanner.next());

				break;
			case 4:
				System.out.println("[계좌 해지] 계좌번호 입력 :");
				admin.closeAccount(scanner.nextInt());
				break;
			default:
				System.out.println("해당 값이 존재하지 않습니다.");
				break;
			}

			break;
		case 2:
			System.out.println("계좌개설 : '1', 입금 : '2', 출금 : '3', 잔액조회 : '4'");
			switch (scanner.nextInt()) {
			case 1:
				System.out.println("이름, password입력하세요");

				System.out.println(bank.openAccount(scanner.next(), scanner.nextInt()));
				break;
			case 2:
				System.out.println("계좌번호를 입력해주세요 : ");

				System.out.println("입금금액 입력 : ");
				System.out.println(bank.deposit(scanner.nextInt()));
				break;
			case 3:
				System.out.println("계좌번호를 입력해주세요 : ");
				System.out.println("출금금액 입력 : ");
				System.out.println(bank.withdraw(scanner.nextInt()));
				break;
			case 4:
				System.out.println("계좌번호를 입력해주세요 : ");
				System.out.println("잔액조회 : ");
				System.out.println(bank.findMoney());
				break;
			default:
				System.out.println("해당 값이 존재하지 않습니다.");
				break;
			}

			break;
		default:
			System.out.println("해당 값이 존재하지 않습니다.");
			break;
		}

	}
}
