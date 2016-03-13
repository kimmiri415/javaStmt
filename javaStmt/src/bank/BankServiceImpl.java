/**
 * 
 */
package bank;

public class BankServiceImpl implements BankService {
	private AccountBean account;
	int balance;

	@Override
	public String openAccount(String name, int password) {
		/**
		 * 계좌 개설
		 */
		account = new AccountBean(name, password);

		return "계좌개설성공 > " + account.getName() + "님 계좌 번호 :" + account.getAccountNo();
	}

	@Override
	public String deposit(int accountNo, int money) {
		/**
		 * 입금
		 */
		balance = account.getMoney();
		account.setMoney(balance + money);
		return "입금 후 잔액 > " + account.getMoney() + "원";
	}

	@Override
	public String withdraw(int accountNo, int money) {
		/**
		 * 출금
		 */
		String result = "";
		balance = account.getMoney();
		if (balance >= money) {
			account.setMoney(balance - money);
			result = "출금 후 잔액 > " + account.getMoney() + "원";
			;
		} else {
			result = "잔액이부족합니다";
		}
		return result;
	}

	@Override
	public String findMoney(int accountNo) {
		/**
		 * 잔액조회
		 */

		return account.getName() + "님의 잔액 > " + account.getMoney() + "원";
	}

}
