/**
 * 
 */
package bank;

/**
 * @file BankService.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 10.
 * @story 뱅크서비스 비즈니스 로직
 *
 */

public class AdminServiceImpl2 implements AdminService2 {
	private AccountBean[] accountList;// 전체 계좌를 보관하는 객체

	private int count = 0;// 전체 통장 계좌 수

	public AdminServiceImpl2(int size) {
		// accountList를 초기화 해줌
		accountList = new AccountBean[size];

	}

	@Override
	public String openAccount(String name, int password) {
		/**
		 * 계좌 개설
		 */
		AccountBean bean = new AccountBean(name, password);
		accountList[count] = bean;
		count++;// 계좌를 개설할 때마다 카운트를 1씩증가시킨다.
		return bean.toString();
	}

	@Override
	public AccountBean findAccountByAccountNo(int accountNo) {
		/**
		 * 계좌번호로 계좌 조회(반드시 하나만 검색됨)
		 */
		AccountBean temp = new AccountBean();
		for (int i = 0; i < count; i++) {
			if (accountList[i].getAccountNo() == accountNo) {
				temp = accountList[i];

			}
		}
		return temp;
	}

	@Override
	public void findAccountsByName(String name) {
		/**
		 * 이름으로 계좌 조회(복수개의 결과가능)
		 */

		AccountBean[] tempList = new AccountBean[countByName(name)];
		int AccountNum = 0;
		for (int i = 0; i < count; i++) {
			if (accountList[i].getName().equals(name)) {
				tempList[AccountNum] = accountList[i];
				System.out.println("tempList[" + i + "] :" + tempList[AccountNum]);
				AccountNum++;

			}

		}
		return;
	}

	@Override
	public String closeAccount(int accountNo) {
		/**
		 * 계좌 해지
		 */
		int indexNum = 0;
		AccountBean newAccountList[] = new AccountBean[count - 1];
		for (int i = 0; i < count; i++) {
			if (accountList[i].getAccountNo() == accountNo) {

				indexNum = i;
				accountList[i] = null;// 계좌정보초기화

			}
		}
		if (count != 1) {
			if (indexNum != 0) {
				System.arraycopy(accountList, 0, newAccountList, 0, indexNum);
				System.arraycopy(accountList, indexNum + 1, newAccountList, indexNum, count - indexNum - 1);

			} else if (indexNum == 0) {
				System.arraycopy(accountList, 1, newAccountList, 0, count - 1);
			}
		}

		count--;

		for (int i = 0; i < newAccountList.length; i++) {
			accountList[i] = newAccountList[i];
			System.out.println(i + "번째계좌 : " + accountList[i]);
		}

		return null;
	}

	@Override
	public int countAll() {
		/**
		 * 전체 계좌수 조회
		 */
		return count;
	}

	@Override
	public int countByName(String name) {
		/**
		 * 해당 이름에 맞는 계좌 수 조회
		 */
		int countAccountbyName = 0;
		for (int i = 0; i < count; i++) {
			if (accountList[i].getName().equals(name)) {
				countAccountbyName++;
			}
		}
		return countAccountbyName;
	}

}
