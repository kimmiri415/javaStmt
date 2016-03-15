/**
 * 
 */
package bank;

import java.util.Vector;

/**
 * @file AdminServiceImpl.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 15.
 * @story
 *
 */
public class AdminServiceImpl implements AdminService {
	private Vector<AccountBean> accountListA;

	public AdminServiceImpl() {
		accountListA = new Vector<AccountBean>();
	}

	public String openAccount(String name, int password) {
		/**
		 * 계좌 개설
		 */
		AccountBean beanA = new AccountBean(name, password);
		accountListA.add(beanA);
		return "개설완료 >> "+ beanA.toString();
	}

	public Vector<AccountBean> getList() {
		/**
		 * 전체 계좌 목록 출력*
		 */
		return accountListA;
	}

	public AccountBean findAccountByAccountNo(int accountNo) {
		/**
		 * 계좌번호로 계좌 조회(반드시 하나만 검색됨)
		 */
		for (int i = 0; i <accountListA.size(); i++) {
			if(accountListA.get(i).getAccountNo()==accountNo){
				//re
			}
		}
		
		return null;
	}

	public Vector<AccountBean> findAccountsByName(String name) {
		/**
		 * 이름으로 계좌 조회(복수개의 결과가능)
		 */
		return null;
	}

	public String closeAccount(int accountNo) {
		/**
		 * 계좌 해지
		 */
		return null;
	}

	public int countAll() {
		/**
		 * 전체 계좌수 조회
		 */
		return 0;
	}

	public int countByName(String name) {
		/**
		 * 해당 이름에 맞는 계좌 수 조회
		 */
		return 0;
	}

}
