
package bank;

public interface BankService {
	/**
	 * 계좌 개설
	 */
	public String openAccount(String name, int password);

	/**
	 * 입금
	 */
	public String deposit(int accountNo, int money);

	/**
	 * 출금
	 */
	public String withdraw(int accountNo, int password, int money);

	/**
	 * 잔액조회
	 */
	public String findMoney(int accountNo,int password);
	
}
