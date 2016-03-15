/**
 * 
 */
package bank;

import java.util.Scanner;
import java.util.Vector;

import grade.GradeBean;

/**
 * @file AdminController.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 15.
 * @story
 *
 */
public class AdminController {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		AdminServiceImpl serviceAdmin = new AdminServiceImpl();

		while (true) {
			System.out.println("[메뉴]1.계좌개설 2.전체 계좌목록 3.조회(계좌번호) 4.조회(이름) 5.계좌수 6.계좌해지 0.종료");
			switch (s.nextInt()) {
			case 1:
				System.out.println("[계좌개설] 이름, 비밀번호 입력 :");
				System.out.println(serviceAdmin.openAccount(s.next(), s.nextInt()));
				break;
			case 2:
				System.out.println("[전체 계좌목록]");
				System.out.println(serviceAdmin.getList());
				break;
			case 3:
				System.out.println("[조회(계좌번호)] 계좌번호 입력 : ");
				AccountBean temp = serviceAdmin.findAccountByAccountNo(s.nextInt());
				System.out.println((temp.getName() == null) ? "조회하려는 계좌가 없습니다." : temp.toString());

				break;
			case 4:
				System.out.println("[조회(이름)] 이름 입력 : ");
				Vector<AccountBean> tmpVector = serviceAdmin.findAccountsByName(s.next());
				System.out.println((tmpVector.size() == 0) ? "조회하려는 계좌가 없습니다." : tmpVector);
				break;
			case 5:
				System.out.println("[계좌수]");
				System.out.println(serviceAdmin.countAll());
				break;
			case 6:
				System.out.println("[계좌해지] 계좌번호 입력 : ");
				System.out.println(serviceAdmin.closeAccount(s.nextInt()));
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
