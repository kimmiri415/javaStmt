/**
 * 
 */
package whileloop;

import java.util.Scanner;

/**
 * @file NumGolfMain.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 10.
 * @story 컴퓨터가 랜덤 생성한 숫자를 가장 빠른 횟수로 맞추는 게임
 *
 */
public class NumGolfMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("컴퓨터 랜덤 수 발생");
		NumGolfBean bean = new NumGolfBean();
		bean.setCom();

		// while (bean.isFlag() == false) {
		// System.out.println("숫자 입력 :");
		// bean.setPlayer(scanner.nextInt());
		//
		// }
		// System.out.println(bean.toString());

		System.out.println("[메뉴] 1.숫자맞추기 2.종료");
		switch (scanner.nextInt()) {
		case 1:
			while (bean.isFlag() == false) {
				System.out.println("1부터 10까지 숫자 중하나를 입력");
				bean.setPlayer(scanner.nextInt());
				System.out.println(bean.toString());
			}

			break;
		case 2:
			System.out.println("종료합니다.");
			return;

		default:
			System.out.println("잘못된값");
			return;
		}

	}

}
