/**
 * 
 */
package bank;

import java.util.Vector;

public class BankServiceImpl implements BankService {

	private Vector<AccountBean> accountListB;

	public BankServiceImpl() {
		accountListB = new Vector<AccountBean>();
	}

//	public AccountBean findAccount(int accountNo){
//		
//	}
	
	@Override
	public String openAccount(String name, int password) {
		/**
		 * 계좌 개설
		 */
		AccountBean beanB = new AccountBean(name, password);
		accountListB.add(beanB);
		return "개설완료 >> " + beanB.toString();
	}

	@Override
	public String deposit(int accountNo, int money) {
		/**
		 * 입금
		 */
		String result = "";

		for (int i = 0; i < accountListB.size(); i++) {

			if (accountListB.get(i).getAccountNo() == accountNo) {
				int balance = accountListB.get(i).getMoney();
				accountListB.get(i).setMoney(balance + money);
				result = "입금 완료 >> 계좌 :" + accountListB.get(i).getAccountNo() + " , 입금 후 잔액 :"
						+ accountListB.get(i).getMoney() + "원";
				break;

			} else {
				result = "계좌번호 오류";

			}
		}
		return result;
	}

	@Override
	public String withdraw(int accountNo, int password, int money) {
		/**
		 * 출금
		 */
		String result = "";

		for (int i = 0; i < accountListB.size(); i++) {

			if (accountListB.get(i).getAccountNo() == accountNo) {
				if (accountListB.get(i).getPassword() == password) {
					if (accountListB.get(i).getMoney() >= money) {
						accountListB.get(i).setMoney(accountListB.get(i).getMoney() - money);
						result = "출금 완료 >> 계좌 :" + accountListB.get(i).getAccountNo() + " , 출금 후 잔액 :"
								+ accountListB.get(i).getMoney() + "원";
						break;
					} else {
						result = "잔액 부족";

					}
				} else {
					result = "비밀번호 오류";

				}

			} else {
				result = "계좌번호 오류";

			}
		}

		return result;
	}

	@Override
	public String findMoney(int accountNo, int password) {
		/**
		 * 잔액조회
		 */

		String result = "";

		for (int i = 0; i < accountListB.size(); i++) {

			if (accountListB.get(i).getAccountNo() == accountNo) {
				if (accountListB.get(i).getPassword() == password) {
					result = "잔액 조회 >> 계좌 :" + accountListB.get(i).getAccountNo() + " , 잔액 :"
							+ accountListB.get(i).getMoney() + "원";
					break;
				} else {
					result = "비밀번호 오류";

				}

			} else {
				result = "계좌번호 오류";

			}
		}

		return result;
	}

}
